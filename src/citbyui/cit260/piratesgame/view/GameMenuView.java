/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.control.MapControl;
import byui.cit260.piratesgame.model.Game;
import byui.cit260.piratesgame.model.Location;
import piratesgame.PiratesGame;

/**
 *
 * @author rominapainter
 */
   class GameMenuView extends View{
 

    public String[] getInputs() {
        
        String[] inputs = new String[1];
       String menuItem = this.getInput
          ("\nGame Menu\n" +
          "M - Display Map\n"+
           "W - Move Menu\n"+
            "C - Get Crew\n"+
           "T - Talk to Crew\n"+
            "P - Pick Crew\n"+
            "D - riddle\n"+
            "R - Another riddle\n"+
                  
          "H - Help\n"  );
        inputs[0] = menuItem;   
          
        return inputs;

    }

     @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
//        menuItem = inputs[0].toUpperCase();

        switch (menuItem) {
            case "M":
                this.displayMap();
                break;
            case "W":
                moveActor();
                break;
            case "L":
                loadGame();
                break;
            case "H":
                helpMenu();
                break;
            case "C":
                getCrew();
                break;
            case "T":
                talkCrew();
                break;
            case "P":
                pickCrew();
                break;
            case "D":
                boriddle();
                break;
            case "R":
                riddleSo();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Please enter a valid option.");
        }

        return false;
    }

    private void displayMap() {
       Game game = PiratesGame.getCurrentGame();
       
       System.out.println("The map\n");
       System.out.println("1 2 3 4 5\n");
       
       // assign location object to the map in current game
       
       Location[][] locations = game.getMap().getLocations();
       int num = 1;
       for (int i = 0; i < locations.length; i++) {
           System.out.println();
           System.out.print(num++ + "|" );
           
           for (int j = 0; j < locations[i].length;j++) {
               Location location = locations[i][j];
               if(location.isVisited()) {
                   String symbol = location.getScene().getSymbol();
                   System.out.print(symbol);
               }
               else {
                   System.out.print("??");
               }
               System.out.print("|");
           }
           
       }
       
       
    }
//    private void viewMap() {
//
//        MapControl.displayMap(PiratesGame.getMap());
//        GameMenuView gameMenuView = new GameMenuView();
//
//        gameMenuView.display();
//    }

    private void loadGame() {
     LoadGameView loadGameView = new LoadGameView();

        loadGameView.displayLoadGameView();
    }


    private void helpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();

       helpMenuView.displayHelpMenuView();
    }

private void getCrew() {
        PickCrewView pickCrewView = new PickCrewView();

        pickCrewView.display();
    }

    private void talkCrew() {
        TalkCrewView talkCrewView = new TalkCrewView();

        talkCrewView.displayTalkCrewView();

    }

    private void riddleSo() {
        RiddleSoView riddleSoView = new RiddleSoView();

        riddleSoView.displayRiddleSoView();
    }

    private void pickCrew() {
        PickCrewView pickCrewView = new PickCrewView();

        pickCrewView.display();
    }

//    private void mapMenu() {
//       MapMenuView mapMenuView = new MapMenuView() {};
//
//        mapMenuView.display();
//    }

//    void boriddle() {
//        BoRiddle boRiddle = new BoRiddle();
//        
//        boRiddle.display();
//    }

    private void boriddle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveActor() {
        MoveActorView moveActor = new MoveActorView() {};

        moveActor.display();
    }

   
   }
