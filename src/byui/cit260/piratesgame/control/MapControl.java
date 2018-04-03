/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.control;

import byui.cit260.piratesgame.model.Inventory;
import byui.cit260.piratesgame.model.Location;
import byui.cit260.piratesgame.model.Map;
import byui.cit260.piratesgame.model.Question;
import byui.cit260.piratesgame.model.SceneType;
import byui.cit260.piratesgame.model.RegularScene;
import byui.cit260.piratesgame.model.ResourceScene;
import byui.cit260.piratesgame.model.RiddleScene;


/**
 *
 * @author madug
 */
public class MapControl {

    public static Map createMap(int noOfRows, int noOfColumns, Inventory[] items) {

        if (noOfRows < 0 || noOfColumns < 0){
            return null;
                }
        
        if ( items == null || items.length < 1){
        return null;
            }
        
         Map userMap = new Map();
         userMap.setRowCount(noOfRows);
         userMap.setColumnCount(noOfColumns);
    
  
         Location[][] myLocations = createLocations(noOfRows, noOfColumns);
         userMap.setLocations(myLocations);
         RegularScene[] myScenes = createScenes();
         Question[] myQuestion = createQuestions();
//         myScenes.assignQuestionsToScenes(Question[] questions, QuestionScene[] scenes);
//       assignItemsToScenes()
//        assignScenesToLocations()
        
                
        return userMap;
    }

     private static Location[][] createLocations(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            return null;
        }
        Location[][] locations = new Location[rows][columns];
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++) {
                Location location = new Location(i, j);
                locations[i][j] = location;
            }
        }
        return locations;
    }

//    private static Scene[] createScenes() {
//        return null;
//    }
//    
    private static RegularScene[] createScenes() {

        RegularScene[] scenes = new RegularScene[15];

        RegularScene start = new RegularScene("This is where you would have to pick crew", "St", "You are stuck.");
        RegularScene water = new RegularScene("You are on paradise seas", "W", "You are stuck.");
        RegularScene island = new RegularScene("You are on an island", "I", "You are stuck.");
        RegularScene ship = new RegularScene("You are on your ship", "##", "You are stuck.");
        RegularScene finish = new RegularScene("Congratulations!! You just won the game", "F", "You are stuck.");
        RegularScene battle = new RegularScene("This is where we fight the monster to get the treasure", "F", "You are stuck.");
        RegularScene islandgold = new RegularScene("You found gold...in a deserted islan.", "F", "You are stuck.");
        RegularScene block = new RegularScene("Be careful! ROCKS! YOU CAN'T GO THIS WAY!", "F", "You are stuck.");
        RiddleScene findtexas = new RiddleScene(23.56,"fail", "you have passed", "riddle", "Be careful! ROCKS! YOU CAN'T GO THIS WAY!", "F", "You are stuck.");
        RiddleScene findhank = new RiddleScene(23.56,"fail", "you have passed", "riddle", "Be careful! ROCKS! YOU CAN'T GO THIS WAY!", "F", "You are stuck.");
        RiddleScene findbo = new RiddleScene(23.56,"fail", "you have passed", "riddle", "Be careful! ROCKS! YOU CAN'T GO THIS WAY!", "F", "You are stuck.");
        ResourceScene fish = new ResourceScene("hjghj", 5, "Be careful! ROCKS! YOU CAN'T GO THIS WAY!", "F", "You are stuck.");
        ResourceScene findgold= new ResourceScene("hjghj", 5, "Be careful! ROCKS! YOU CAN'T GO THIS WAY!", "F", "You are stuck.");
         
        scenes[SceneType.start.ordinal()] = start;
        scenes[SceneType.water.ordinal()] = water;
        scenes[SceneType.island.ordinal()] = island;
        scenes[SceneType.ship.ordinal()] = ship;
        scenes[SceneType.findhank.ordinal()]= findhank;
        scenes[SceneType.finish.ordinal()] = finish;
        scenes[SceneType.battle.ordinal()] = battle;
        scenes[SceneType.findgold.ordinal()] = findgold;
        scenes[SceneType.islandgold.ordinal()] = islandgold;
        scenes[SceneType.fish.ordinal()] = fish;
        scenes[SceneType.findtexas.ordinal()] = findtexas;
        scenes[SceneType.findbo.ordinal()] = findbo;
        scenes[SceneType.block.ordinal()] = block;
        
        return scenes;
    }
    
      private static Question[] createQuestions() {
        return null;
        
    }
      
    private static void assignQuestionsToScenes(Question[] questions, RegularScene[] scenes) {

        System.out.println("You have a question");
    }

    private static void assignItemsToScenes(Inventory[] items, RegularScene[] scenes) {
        System.out.println("You have a question");
    }

    private static void assignScenesToLocations(RegularScene[] scenes, Map myMap) {
        Location [][] locations = myMap.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.findhank.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.findgold.ordinal()]);
        
        locations[1][0].setScene(scenes[SceneType.water.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.findgold.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.islandgold.ordinal()]);
        
        locations[2][0].setScene(scenes[SceneType.fish.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.findz.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.findbo.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.findtexas.ordinal()]);
        
        locations[3][0].setScene(scenes[SceneType.water.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.fish.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.battle.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.block.ordinal()]);
        
        locations[4][0].setScene(scenes[SceneType.block.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.block.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.block.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.block.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.finish.ordinal()]);
    }

   

}
