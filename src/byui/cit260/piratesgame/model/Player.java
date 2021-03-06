/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;


/**
 *
 * @author rominapainter
 */

public class Player implements Serializable{
    
    private String name;
    private double bestTime;
    private String role;
    private Actor actor;
    private ArrayList<Game> games = new ArrayList<>();
    private ArrayList<Actor> character = new ArrayList<>();

    public Player() {
    }
 
    //* extra space *//

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<Actor> getCharacter() {
        return character;
    }

    public void setCharacter(ArrayList<Actor> character) {
        this.character = character;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.role);
        hash = 83 * hash + Objects.hashCode(this.actor);
        hash = 83 * hash + Objects.hashCode(this.games);
        hash = 83 * hash + Objects.hashCode(this.character);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.role, other.role)) {
            return false;
        }
        if (this.actor != other.actor) {
            return false;
        }
        if (!Objects.equals(this.games, other.games)) {
            return false;
        }
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + ", role=" + role + ", actor=" + actor + ", games=" + games + ", character=" + character + '}';
    }
    
    

    
}