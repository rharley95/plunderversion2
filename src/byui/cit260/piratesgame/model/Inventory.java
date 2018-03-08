/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.model;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
/**
 *
 * @author rominapainter
 */
public class Inventory implements Serializable{
    
    
    private String inventoryType;
    private int quantityInStock;
    private int maxAmount;
    private Array[] Item;
    private Inventory inventory = new Inventory();
//    private ResourceScene scene;

    public Inventory() {
    }

    public Inventory(String inventoryType, int quantityInStock, int maxAmount) {
        this.inventoryType = inventoryType;
        this.quantityInStock = quantityInStock;
        this.maxAmount = maxAmount;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(int requiredAmount) {
        this.maxAmount = requiredAmount;
    }

    public Array[] getItem() {
        return Item;
    }

    public void setItem(Array[] Item) {
        this.Item = Item;
    }

    @Override
    public String toString() {
        return "Inventory{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", maxAmount=" + maxAmount + ", Item=" + Item + ", inventory=" + inventory + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.inventoryType);
        hash = 19 * hash + this.quantityInStock;
        hash = 19 * hash + this.maxAmount;
        hash = 19 * hash + Arrays.deepHashCode(this.Item);
        hash = 19 * hash + Objects.hashCode(this.inventory);
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
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.maxAmount != other.maxAmount) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Arrays.deepEquals(this.Item, other.Item)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        return true;
    }

    
   

    
    
    
    
    
}
