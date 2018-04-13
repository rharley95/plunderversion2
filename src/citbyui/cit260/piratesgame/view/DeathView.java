/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

/**
 *
 * @author madug
 */
public  class DeathView extends View {

    @Override
    public String[] getInputs() {
        this.console.println("🆆🅴🅻🅲🅾🅼🅴\n" +
                   "🆈🅾🆄 🅻🅾🆂🆃 🆃🅷🅴 🅶🅰🅼🅴");
        
        String[] inputs = new String[1];
       String menuItem = this.getInput
          ("\nGame Menu\n" +
           "M - Main Menu" +
           "Q - Quit Game\n");
          
       inputs[0] = menuItem;   
          
        return inputs; 
    }
       
 
    
    @Override
    public boolean doAction(String[] inputs) {

        String menuItem = inputs[0];
//        menuItem = inputs[0].toUpperCase();

        switch (menuItem) {
             case "M":
               mainMenu();
                break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Please enter a valid option.");
    }
        return false;
 
    }

    private boolean mainMenu() {
       MainMenuView mainMenuView = new MainMenuView();
       
        mainMenuView.display();

        return true;
    }

} 
    

