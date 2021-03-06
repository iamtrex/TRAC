package com.tracv.util;

import java.awt.*;

/**
 * In future can make this read from a settings.ini
 */
public class Constants {

    //Names
    public static final String GAME_NAME = "TRACV Tower Defense";
    public static final String VERSION_NUMBER = "ALPHA 0.3";

    //Scaling and Dimensions
    public static final Double HUD_VERTICAL_SCALE = 0.2;
    public static final Double GAME_VERTICAL_SCALE = 1-HUD_VERTICAL_SCALE;
    public static final long MOUSE_TRACKING_DELAY = 10; //Wait 10 ms between checking mouse
    public static final long MAP_MOVE_REFRESH = 1;
    public static final float DIM_FACTOR = 0.5f;
    public static final int MOVEMENT_PIXEL_PADDING = 30;
    public static final int MAP_MOVE_SPEED = 600;
    public static final int REFRESH_RATE =  60; //FPS
    public static final int REFRESH_DELAY = (int)Math.round(1000/REFRESH_RATE);
    public static final Double DEFAULT_BLOCK_SIZE = 50.0;
    public static final long MAP_MOVE_REFRESH_DELAY = REFRESH_DELAY;

    public static final int DEFAULT_GOLD = 1000;

    //Size of Frame, game and HUD
        private static final int FRAME_WIDTH = 1200;
        private static final int FRAME_HEIGHT = 700;

        public static final Dimension FRAME_DEFAULT_SIZE = new Dimension(FRAME_WIDTH, FRAME_HEIGHT);

        public static final Dimension HUD_DIMENSION = new Dimension((int)(FRAME_DEFAULT_SIZE.width * 0.75), (int)(FRAME_DEFAULT_SIZE.height * HUD_VERTICAL_SCALE));

        public static final Dimension GAME_DIMENSION = new Dimension(FRAME_DEFAULT_SIZE.width,
                (int)(FRAME_DEFAULT_SIZE.height));


        public static final Dimension HUD_STATS_SIZE = new Dimension((int)(FRAME_WIDTH * 0.33), (int)HUD_DIMENSION.getHeight());
        public static final Dimension HUD_STATE_SIZE = new Dimension((int)(FRAME_WIDTH * 0.33), (int)HUD_DIMENSION.getHeight());
        public static final Dimension HUD_BUTTON_SIZE = new Dimension((int)(FRAME_WIDTH * 0.33), (int)HUD_DIMENSION.getHeight());

    //Sizes of icons.
        public static final Dimension HUD_TOWER_ICON_SIZE = new Dimension(35, 35+10+2); //Add HUD Font + spacing
        public static final Dimension ICON_SIZE = new Dimension(35, 35);


    //Directory Locations

        public static final String LEVEL_DIR = "/Levels/";
        public static final String MAP_DIR = "Levels/LevelMap/";

        public static final String ICON_DIR = "/Icons/";
        public static final String ICON_FILE_TYPE = ".png";

        public static final String TOWER_ICON_DIR = "/TowerIcons/";
        public static final String TOWER_SPRITE_DIR = "/TowerSprites/";
        public static final String TOWER_ICON_FILETYPE = ".png";
        public static final String TOWER_SPRITE_FILETYPE = ".png";

        //TODO FILL OUT
        public static final String EXTERNAL_ROOT_DIR = "TRACV/";
        public static final String SETTINGS_FILE = EXTERNAL_ROOT_DIR + "preferences.json";

    public static final int DEFAULT_SIZE = 14;

    //Fonts
        public static final String FONT_FAMILY = "Calibri";
        //TODO FIX FONTS. 
        public static final Font DEFAULT_FONT = new Font("Calibri", Font.BOLD, 24);
        public static final Font HUD_TOWER_GOLD_FONT = new Font("Calibri", Font.PLAIN, 10);

        public static final Font LARGE_LABEL_FONT = new Font("Calibri", Font.BOLD, 36);
        public static final Font MEDIUM_LABEL_FONT = new Font("Calibri", Font.BOLD, 20);
        public static final Font SMALL_LABEL_FONT = new Font("Calibri", Font.PLAIN, 14);

        public static final Font LOGGER_FONT = new Font(FONT_FAMILY, Font.PLAIN, DEFAULT_SIZE);


    //Default colours of selected vs unselected buttons
        public static final Color BUTTON_SELECTED_COLOR = new Color(150, 150, 150, 150);
        public static final Color BUTTON_UNSELECTED_COLOR = new Color(1, 1, 1, 1.0f);

    //MISC Constants
        //Number of tower buttons in a row.
        public static final int HUD_BUTTONS_PER_ROW = 5;

        // The distance between click and release to still build a tower... Makes for comfortable UI feel...
        public static final double CLICK_VAR_DISTANCE = 50;

    public static final boolean DEBUGGING_MODE = true;

    public static final int HEALTH_BAR_SPACING_BASE = 15;
    public static final int HEALTH_BAR_HEIGHT_BASE = 5;
    public static final double HEALTH_BAR_WIDTH_REDUCTION_FACTOR = 0.8;


    public static final String OBSERVER_GOLD_CHANGED = "Gold Changed";
    public static final String OBSERVER_NEW_GAME = "New Game";
    public static final String OBSERVER_TIME_MODIFIED = "Time Modified";

    public static final int INSETS_OUTSIDE = 10;
    public static final int INSETS_BETWEEN = 5;

    //public static final String OBSERVER_GAME_OVER = "GGWP";
    public static final String OBSERVER_LEVEL_COMPLETE = "GGEZ";
    public static final String OBSERVER_GAME_TICK = "UPDATE";
    public static final String OBSERVER_WAVE_SPAWNED = "wave spawned";
    public static final String OBSERVER_TOWER_SELECTED = "tower sel";
    public static final String OBSERVER_UPGRADED_TOWER = "tower modif";
    public static final String OBSERVER_SOLD_TOWER = "SOLD";
    public static final String OBSERVER_BASE_HEALTH_CHANGED = "HEALTH";
    public static final String OBSERVER_GAME_PAUSED = "game paused";
    public static final String OBSERVER_GAME_RESUMED = "game resumed";
    public static final String OBSERVER_LEVEL_FAILED = "FAILED";

    public static final String OBSERVER_STATE_RUNNING = "RUNNING";
    public static final String OBSERVER_STATE_PAUSED = "PAUSED";
    public static final String OBSERVER_STATE_TERMINATED = "TERMINATED";



}

