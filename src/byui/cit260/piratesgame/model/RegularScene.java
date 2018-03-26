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
    private String symbol;
    private String blocked;
    private Location location;

    public RegularScene() {
    }

    public RegularScene(String description, String symbol, String blocked) {
        this.description = description;
        this.symbol = symbol;
        this.blocked = blocked;
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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
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
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.Scenetype);
        hash = 37 * hash + Objects.hashCode(this.symbol);
        hash = 37 * hash + Objects.hashCode(this.blocked);
        hash = 37 * hash + Objects.hashCode(this.location);
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
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.Scenetype, other.Scenetype)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (!Objects.equals(this.blocked, other.blocked)) {
            return false;
        }
        if (this.location != other.location) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RegularScene{" + "description=" + description + ", Scenetype=" + Scenetype + ", symbol=" + symbol + ", blocked=" + blocked + ", location=" + location + '}';
    }

    
    
}
