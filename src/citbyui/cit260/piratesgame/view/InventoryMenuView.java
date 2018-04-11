/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.model.Inventory;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rominapainter
 */
public class InventoryMenuView extends View{
    
    private Inventory[] inventoryItems = new Inventory[4];

    public InventoryMenuView() {
        inventoryItems[0] = new Inventory("Gold", 2, 5);
        inventoryItems[1] = new Inventory("Fish", 2, 5);
        inventoryItems[2] = new Inventory("Map", 1, 2);
        inventoryItems[3] = new Inventory("Sword", 1, 1);
    }
    
    
    
    
    void inventoryMenuDisplay(){
     boolean endView = false;

        do {
            String[] inputs = this.getInputs();

            if (inputs[0].length() < 1 || inputs[0].equals('Q')) {
                return;
            }
            endView = doAction(inputs);

        } while (endView != true);
    
    
    
    }
    @Override
    public String[] getInputs() {
          String[] inputs = new String[1];
          
          
        this.console.println("Here is a list of your inventory;");
        for (int i = 0; i<this.inventoryItems.length; i++) {
            String itemType = this.inventoryItems[i].getInventoryType();
            String firstLetter = itemType.substring(0,0).toUpperCase();
            this.console.println("\t" + firstLetter + " - " + itemType);
        }

        boolean valid = false;
        Scanner name = new Scanner(System.in);
        while (valid == false) {

            this.console.println("Enter the item that you want");
            String itemSelected = name.nextLine();
            itemSelected = itemSelected.trim();

            if (itemSelected.length() < 1) {
                ErrorView.display(this.getClass().getName(),"You must enter a letter.");
                continue;
            }

            inputs[0] = itemSelected;
            valid = true;
        }

        return inputs;
        
    }

    @Override
    public boolean doAction(String[] inputs) {
       String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase();

        switch (menuItem) {
            case "G":
                goldItem();
                break;
            case "F":
                fishIteam();
                break;
            case "M":
                mapItem();
                break;
           case "S":
                swordItem();
                break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Please enter a valid option.");
        }

        return false; 
    }

    private void goldItem() {
        this.console.println("You have" );
    }

    private void fishIteam() {
       this.console.println("You have traveled North! Let's see where else we could go!");
    }

    private void mapItem() {
        this.console.println("You have traveled North! Let's see where else we could go!");
    }

    private void swordItem() {
        this.console.println("You have traveled North! Let's see where else we could go!");
    }
    
    
}
