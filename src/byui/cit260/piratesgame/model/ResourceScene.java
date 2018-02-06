/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.plunderversion2.model;

import java.util.Objects;
import java.io.Serializable;
/**
 *
 * @author madug
 */
public class ResourceScene implements Serializable {
    
    private String attribute;
    private double amount;
    private ResourceScene resourcescene;

    public ResourceScene() {
    }
    
    

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.attribute);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
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
        final ResourceScene other = (ResourceScene) obj;
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        return Objects.equals(this.attribute, other.attribute);
    }

    @Override
    public String toString() {
        return "ResourceScene{" + "attribute=" + attribute + ", amount=" + amount + '}';
    }
    
    
    
}
