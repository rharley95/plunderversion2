/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.model;

import java.io.Serializable;
import java.util.Objects;
import javax.tools.DocumentationTool.Location;

/**
 *
 * @author madug
 */
public class RegularScene implements Serializable{
 
    private String description;
    private String Scenetype;
    private double symbol;
    private String blocked;
    private Location location;

    public RegularScene() {
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScenetype() {
        return Scenetype;
    }

    public void setScenetype(String Scenetype) {
        this.Scenetype = Scenetype;
    }

    public double getSymbol() {
        return symbol;
    }

    public void setSymbol(double symbol) {
        this.symbol = symbol;
    }

    public String getBlocked() {
        return blocked;
    }

    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + Objects.hashCode(this.Scenetype);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.symbol) ^ (Double.doubleToLongBits(this.symbol) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.blocked);
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
        final RegularScene other = (RegularScene) obj;
        if (Double.doubleToLongBits(this.symbol) != Double.doubleToLongBits(other.symbol)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.Scenetype, other.Scenetype)) {
            return false;
        }
        return Objects.equals(this.blocked, other.blocked);
    }

    @Override
    public String toString() {
        return "RegularScene{" + "description=" + description + ", Scenetype=" + Scenetype + ", symbol=" + symbol + ", blocked=" + blocked + '}';
    }
    
    
}
