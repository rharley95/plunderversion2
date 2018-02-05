/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.plunderversion2.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author madug
 */
public class CombatScene implements Serializable{
    private String combatType;
    private double remainingTime;
    private CombatScene combatscene;

    public CombatScene() {
    }

    public CombatScene getCombatscene() {
        return combatscene;
    }

    public void setCombatscene(CombatScene combatscene) {
        this.combatscene = combatscene;
    }
    
    

    public String getCombatType() {
        return combatType;
    }

    public void setCombatType(String combatType) {
        this.combatType = combatType;
    }

    public double getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(double remainingTime) {
        this.remainingTime = remainingTime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.combatType);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.remainingTime) ^ (Double.doubleToLongBits(this.remainingTime) >>> 32));
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
        final CombatScene other = (CombatScene) obj;
        if (Double.doubleToLongBits(this.remainingTime) != Double.doubleToLongBits(other.remainingTime)) {
            return false;
        }
        return Objects.equals(this.combatType, other.combatType);
    }

    @Override
    public String toString() {
        return "CombatScene{" + "combatType=" + combatType + ", remainingTime=" + remainingTime + '}';
    }
    
    
}
