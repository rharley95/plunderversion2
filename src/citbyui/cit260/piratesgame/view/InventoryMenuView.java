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
public class InventoryMenuView {
    
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

    private String[] getInputs() {
          String[] inputs = new String[1];
          
          
        System.out.println("Here is a list of your inventory;");
        for (int i = 0; i<this.inventoryItems.length; i++) {
            String itemType = this.inventoryItems[i].getInventoryType();
            String firstLetter = itemType.substring(0,0).toUpperCase();
            System.out.println("\t" + firstLetter + " - " + itemType);
        }

        boolean valid = false;
        Scanner name = new Scanner(System.in);
        while (valid == false) {

            System.out.println("Enter the item that you want");
            String itemSelected = name.nextLine();
            itemSelected = itemSelected.trim();

            if (itemSelected.length() < 1) {
                System.out.println("You must enter a letter.");
                continue;
            }

            inputs[0] = itemSelected;
            valid = true;
        }

        return inputs;
        
    }

    private boolean doAction(String[] inputs) {
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
                System.out.println("Please enter a valid option.");
        }

        return false; 
    }

    private void goldItem() {
        System.out.println("You have" );
    }

    private void fishIteam() {
       System.out.println("You have traveled North! Let's see where else we could go!");
    }

    private void mapItem() {
        System.out.println("You have traveled North! Let's see where else we could go!");
    }

    private void swordItem() {
        System.out.println("You have traveled North! Let's see where else we could go!");
    }
    
    
}
