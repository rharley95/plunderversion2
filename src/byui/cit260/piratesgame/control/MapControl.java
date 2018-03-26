/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.control;

import byui.cit260.piratesgame.model.Inventory;
import byui.cit260.piratesgame.model.Map;
import byui.cit260.piratesgame.model.Location;
import byui.cit260.piratesgame.model.RegularScene;
import byui.cit260.piratesgame.model.RiddleScene;
import byui.cit260.piratesgame.model.Question;
import byui.cit260.piratesgame.model.QuestionScene;
import byui.cit260.plunderversion2.model.ResourceScene;

/**
 *
 * @author madug
 */
public class MapControl {
    public static Map createMap(int noOfRows, int noOfColumns, Inventory[] items){
        
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
         RegularScene[] myScenes = createScenes();
         Question[] myQuestion = createQuestions();
//         myScenes.assignQuestionsToScenes(Question[] questions, QuestionScene[] scenes);
//       assignItemsToScenes()
//        assignScenesToLocations()
        
                
        return userMap;
    }
    
    private static Location[][] createLocations(int rows, int columns) {
        return null;
        
    }
    
    private static RegularScene[] createScenes() {
        return null;
    }
    
    private static Question[] createQuestions() {
        return null;
        
    }
    
    private static void assignQuestionsToScenes(Question[] questions, QuestionScene[] scenes){
    }
    
    private static void assignItemsToScenes(Inventory[] items, ResourceScene[] scenes) {
    }
    
    private static void assignScenesToLocations(RegularScene[] scenes, Location[][] locations){
    }
}
