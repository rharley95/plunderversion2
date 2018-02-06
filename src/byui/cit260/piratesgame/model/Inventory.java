/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.model;

import java.io.Serializable;
/**
 *
 * @author rominapainter
 */
public class Inventory implements Serializable{
    
    
    private double inventoryType;
    private int quantityInStock;
    private int requiredAmount;
    private Inventory item = new Inventory();
//    private ResourceScene scene;

    public Inventory() {
    }

    public double getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(double inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public Inventory getItem() {
        return item;
    }

    public void setItem(Inventory item) {
        this.item = item;
    }
    
    

    @Override
    public String toString() {
        return "Inventory{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.inventoryType) ^ (Double.doubleToLongBits(this.inventoryType) >>> 32));
        hash = 61 * hash + this.quantityInStock;
        hash = 61 * hash + this.requiredAmount;
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
        final Inventory other = (Inventory) obj;
        if (Double.doubleToLongBits(this.inventoryType) != Double.doubleToLongBits(other.inventoryType)) {
            return false;
        }
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        return true;
    }
    
    

    
    
    
    
    
    
}
