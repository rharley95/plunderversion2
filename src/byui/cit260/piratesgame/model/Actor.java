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
    
    Hank("Hank","The oldest member in your crew that has “seen things”.\n"
                + "You want to use his memories and clues to take you to the next clues for your story\n."
                + "He wears a red bandana and has a scar on his left eye.\n "
                + "Hank will be found inside the first surrounding island of your story where you find half of the map.\n"  
            , new Point(1, 2), 1 ),
    Bo("bo", "Bo is the youngest member of your crew.\n"
                + "He may not know much, but he’s got eyes of an eagle.\n"
                + "Bo will be the one to spot another ship coming your way to attack.\n"
                + "You find him swimming in the ocean on a lifesaver, who got rid of him??????.\n", new Point(1, 3), 2 ),
    Zebra("zebra", " He leads you to the second half of your map to the treasure.\n"
                + " A man of a few words. “...” is his favorite quote.\n"
                + "you might find it useful to follow him and he will probably turn out to be the most faithful crew member.\n", new Point(1, 3), 2 ),
    TexasPit("Texas Pit", "He will be the one you find the key to the treasure with in island 3.\n"
                + "Texas Pit is a pirate with a cowboy complex.\n", new Point(1, 4), 3 );

    
    private String name;
    private String description;
    private Point coordinates;
    private int actorType;

    
    
            
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
    
  


  
    
    
    
}
