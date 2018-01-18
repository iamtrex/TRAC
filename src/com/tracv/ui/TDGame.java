package com.tracv.ui;

import com.tracv.directional.PointToPointDistance;
import com.tracv.model.GameState;
import com.tracv.observerpattern.Observable;
import com.tracv.observerpattern.Observer;
import com.tracv.swing.IconButton;
import com.tracv.types.TowerType;
import com.tracv.ui.game.GamePane;
import com.tracv.ui.game.HUDButtonPane;
import com.tracv.ui.game.HUDPane;
import com.tracv.util.Comp;
import com.tracv.util.Constants;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.TimerTask;

/**
 * The Game.
 */
public class TDGame extends JLayeredPane implements ActionListener, Observer{

    private TDFrame tdf;

    private HUDPane hudPane;
    private GamePane gamePane;
    private MenuPane menuPane;

    private IconButton pause;

    private GameState gs;


    public TDGame(TDFrame tdf){
        this.tdf = tdf;

        hudPane = new HUDPane();
        gamePane = new GamePane();
        gs = gamePane.getGameState();
        gs.addObserver(this);
        gs.addObserver(hudPane);
        gs.addObserver(gamePane);

        menuPane = new MenuPane();

        Comp.add(gamePane, this, 0, 0, 0, 1, 1, 1, 1,
                GridBagConstraints.BOTH, GridBagConstraints.CENTER);

        //Align to bottom edge.
        Comp.add(hudPane, this, 0, 0, 1, 1, 1, 1, 1,
                GridBagConstraints.NONE, GridBagConstraints.BASELINE);

        //Align to top right corner with default sizes.
        Comp.add(menuPane, this, 1, 0, 0, 1, 1, 1, 1,
                GridBagConstraints.NONE, GridBagConstraints.FIRST_LINE_END);

        hudPane.getHUDButtonsPane().addPropertyChangeListener(new TowerChangeListener());

        createGameTimer();
    }

    public void startNewGame(){
        gs.newGame();
        setGameRunning(true);
    }

    public void setGameRunning(boolean b) {
        if(gameTimer != null){
            if(running != b){
                if(b){
                    gameTimer.start();
                    System.out.println("Starting/Resuming Game");
                }else{
                    gameTimer.stop();
                    System.out.println("Stopping Game");
                }
                running = b;
            }
        }
    }

    private boolean running = false;
    private javax.swing.Timer gameTimer;
    private void createGameTimer(){
       gameTimer = new Timer(Constants.REFRESH_DELAY, (e)->{
           gs.update();
           gamePane.repaint();
       });
    }

    @Override
    public void update(Observable o) {
        GameState gs = gamePane.getGameState();
        if(o == gs){
            if(gs.isGameOver()){
                tdf.toggleMenu(true);
            }
        }
    }

    /**
     * Menu that lies on top of the game in order to pause hte game/sounds etc...
     */
    private class MenuPane extends JPanel{
        public MenuPane(){
            this.setPreferredSize(Constants.ICON_SIZE); //TODO REMOVE TEMP.
            this.setBorder(new LineBorder(Color.BLUE, 3));
            pause = new IconButton("Pause"); //Show menu;
            pause.addActionListener(TDGame.this::actionPerformed);
            Comp.add(pause, this, 0, 0, 1, 1, 0, 0,
                    GridBagConstraints.NONE, GridBagConstraints.FIRST_LINE_END);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == pause){
            gamePane.getGameState().pause();
            setGameRunning(false);
            tdf.toggleMenu(true);
        }

    }



    private class TowerChangeListener implements PropertyChangeListener {
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            if(evt.getPropertyName().equals(HUDButtonPane.TOWER_CHANGED)){
                gamePane.setSelectedTower((TowerType) evt.getNewValue());
            }
        }
    }

}
