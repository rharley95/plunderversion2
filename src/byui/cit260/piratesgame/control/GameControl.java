/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.control;

import byui.cit260.piratesgame.model.Player;
import byui.cit260.piratesgame.model.Game;
import byui.cit260.piratesgame.model.Inventory;
import byui.cit260.piratesgame.model.InventoryType;
import byui.cit260.piratesgame.model.Map;
import java.io.Serializable;
import piratesgame.PiratesGame;

/**
 *
 * @author madug
 */
public class GameControl implements Serializable {

    public static Player savePlayer(String name) {
        Player player = new Player();
        player.setName(name);
        PiratesGame.setPlayer(player);

        if (name == null) {
            return null;
        }

        player = new Player();
        return player;
    }

    public static int createNewGame(Player player) {
        System.out.println("Welcome to a new game!");

        if (player == null) {
            return -1;
        }
        Game userGame = new Game();
        PiratesGame.setPlayer(player);
        PiratesGame.setCurrentGame(userGame);
        userGame.setPlayer(player);

        Inventory[] items = GameControl.createItems();
        userGame.setItems(items);

        Map myMap = MapControl.createMap(5, 5, items);
        if (myMap == null) {
            return -1;
        }

        userGame.setMap(myMap);

        return 1;
    }

    public static void saveGame(Player player) {
        System.out.println("You have saved your game.");

    }

    public static Inventory[] createItems() {
        
        Inventory[] myItems = new Inventory[3];
        Inventory fish = new Inventory("Fish", 0, 5);
        myItems[InventoryType.Fish.ordinal()] = fish;
        Inventory gold = new Inventory("Gold", 0, 10);
        myItems[InventoryType.Gold.ordinal()] = gold;
        Inventory weapon = new Inventory("Weapon", 0, 1);
        myItems[InventoryType.Weapon.ordinal()] = weapon;

        return myItems;
    }

}
