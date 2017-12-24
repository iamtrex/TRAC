package com.tracv.model;


import java.util.List;

public class Map {
    private List<GameComponent> gameComponents;
    private Terrain[][] terrains;

    public Map (List<GameComponent> gameComponents, Terrain[][] terrains) {
        this.gameComponents = gameComponents;
        this.terrains = terrains;
    }
    public List<GameComponent> getGameComponents() {
        return gameComponents;
    }

    public void addComponent(GameComponent component) {
        gameComponents.add(component);
    }

    public void removeComponent(GameComponent component) {
        gameComponents.remove(component);
    }

    public Terrain[][] getTerrains() {
        return terrains;
    }

}
