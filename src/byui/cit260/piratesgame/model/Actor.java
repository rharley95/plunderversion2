/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.model;

import java.awt.Point;
/**
 *
 * @author rominapainter
 */
public enum Actor {
    
    eric("Eric", "Our greatest member of the crew", new Point(1, 2), 1 ),
    lehi("lehi", "Our greatest member of the crew", new Point(1, 3), 2 ),
    nephi("nephi", "Our greatest member of the crew", new Point(1, 4), 3 );

    
    private String name;
    private String description;
    private Point coordinates;
    private int actorType;
    private RiddleScene riddle = new RiddleScene();
//    private CombatScene combatType;
    private Location location = new Location();
    private Player player;   
    private Game game;
    
    
            
    Actor(String name, String description, Point coordinates, int actorType){
    this.name = name;
    this.description = description;
    this.coordinates = coordinates; 
    this.actorType = actorType;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public int getActorType() {
        return actorType;
    }

    public void setActorType(int actorType) {
        this.actorType = actorType;
    }
    
  
    
    public RiddleScene getRiddle() {
        return riddle;
    }

    public void setRiddle(RiddleScene riddle) {
        this.riddle = riddle;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + ", actorType=" + actorType + ", riddle=" + riddle + ", location=" + location + ", player=" + player + ", game=" + game + '}';
    }

    
    
  
    
    
    
}
