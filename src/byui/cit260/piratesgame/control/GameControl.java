/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.control;

import byui.cit260.piratesgame.exceptions.GameControlException;
import byui.cit260.piratesgame.model.Actor;
import byui.cit260.piratesgame.model.Player;
import byui.cit260.piratesgame.model.Game;
import byui.cit260.piratesgame.model.Inventory;
import byui.cit260.piratesgame.model.InventoryType;
//import byui.cit260.piratesgame.model.Inventory;
import byui.cit260.piratesgame.model.Map;
import citbyui.cit260.piratesgame.view.ErrorView;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
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

    public static void createNewGame(Player player) throws GameControlException {

        if (player == null) {
            throw new GameControlException("Something went wrong.");
        }

        System.out.println("Welcome to a new game!");

        Game userGame = new Game();
        PiratesGame.setPlayer(player);
        PiratesGame.setCurrentGame(userGame);
        userGame.setPlayer(player);
        PiratesGame.getPlayer().setActor(Actor.You);

        Inventory[] items = GameControl.createItems();
        userGame.setItems(items);

        Map myMap = MapControl.createMap(5, 5, items);
        if (myMap == null) {
            throw new GameControlException("Something went wrong.");
        }

        userGame.setMap(myMap);

    }

    public static void saveGame(Game game, String filePath) throws GameControlException, FileNotFoundException, IOException {

        if (game == null || filePath.length() < 1) {

            throw new GameControlException("Your game is not able to save");
        }
        try (FileOutputStream out = new FileOutputStream(filePath)) {

            try (ObjectOutputStream outObject = new ObjectOutputStream(out)) {
                outObject.writeObject(game);
            } catch (IOException ex) {
                System.out.println("You have saved your game." + ex.getMessage());

            }
        }
    }
    
    public static void startSavedGame(String filePath) throws GameControlException{
            
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filePath)){
        ObjectInputStream input = new ObjectInputStream(fips);
        
        game = (Game) input.readObject();
        
        }
        
        catch(Exception ex){
        throw new GameControlException(ex.getMessage());
        }
        
        PiratesGame.setCurrentGame(game);
    
    }
        
    

    public static Game getGame(String filePath) throws GameControlException, ClassNotFoundException, IOException {
        Game game = null;
        if (filePath == null) {
            throw new GameControlException("/nEnter a filepath");
        }
        try (FileInputStream in = new FileInputStream(filePath)) {

            try (ObjectInputStream inObject = new ObjectInputStream(in)) {
                game = (Game)inObject.readObject();
                PiratesGame.setCurrentGame(game);
                PiratesGame.setPlayer(game.getPlayer());
            }
            catch (ClassNotFoundException ex) {
                throw new GameControlException(ex.getMessage());
            }
        } catch (IOException ex) {
            System.out.println("I/O Error" + ex.getMessage());
        }
        
        return game;
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

