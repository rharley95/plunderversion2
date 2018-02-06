/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.model;

import java.io.Serializable;
import java.awt.Point;
import java.util.Objects;

/**
 *
 * @author rominapainter
 */
public class Location implements Serializable{
    
    private Point row;
    private Point column;
    private boolean visited;
    private int amountRemaining;
    private Actor actor;

    public Location() {
    }
    
    

    public Point getRow() {
        return row;
    }

    public void setRow(Point row) {
        this.row = row;
    }

    public Point getColumn() {
        return column;
    }

    public void setColumn(Point column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", amountRemaining=" + amountRemaining + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.row);
        hash = 41 * hash + Objects.hashCode(this.column);
        hash = 41 * hash + (this.visited ? 1 : 0);
        hash = 41 * hash + this.amountRemaining;
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
        final Location other = (Location) obj;
        if (this.visited != other.visited) {
            return false;
        }
        if (this.amountRemaining != other.amountRemaining) {
            return false;
        }
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
