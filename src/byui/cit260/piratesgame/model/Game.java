/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author rominapainter
 */
public class Game implements Serializable{
    private double startTime;
    private String description;
    private double saveGame;
    private double quitGame;
    private Player player;
    private Map map;
    
    
    
    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

      
    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSaveGame() {
        return saveGame;
    }

    public void setSaveGame(double saveGame) {
        this.saveGame = saveGame;
    }

    public double getQuitGame() {
        return quitGame;
    }

    public void setQuitGame(double quitGame) {
        this.quitGame = quitGame;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.startTime) ^ (Double.doubleToLongBits(this.startTime) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.saveGame) ^ (Double.doubleToLongBits(this.saveGame) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.quitGame) ^ (Double.doubleToLongBits(this.quitGame) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.startTime) != Double.doubleToLongBits(other.startTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.saveGame) != Double.doubleToLongBits(other.saveGame)) {
            return false;
        }
        if (Double.doubleToLongBits(this.quitGame) != Double.doubleToLongBits(other.quitGame)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "startTime=" + startTime + ", description=" + description + ", saveGame=" + saveGame + ", quitGame=" + quitGame + '}';
    }
    
    
    
    
    
}
