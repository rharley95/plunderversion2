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
public class WelcomeView extends View{
     
    
    public String[] getInputs() {
        
        this.console.println("\n Its a beautiful day!!!! What do you think we should do???"
                + "\n Should we go for an Adventure??"
                + "\n Should we just sleep??"
                + "\n The choice is yours."
                + "\n For an adventure Select A and to go back to that beautiful bed and pretend this is "
                + "\n a dream Select B"
                 +"\n ");
        
        String[] inputs = new String[1];
       String menuItem = this.getInput
          ("\n 🆆🅴🅻🅲🅾🅼🅴 and  -----------------------,,,,,.......------------ \n" +
"  / ____|| |                                        (_)           | |       \n" +
" | |     | |__    ___    ___   ___   ___  __      __ _  ___   ___ | | _   _ \n" +
" | |     | '_ \\  / _ \\  / _ \\ / __| / _ \\ \\ \\ /\\ / /| |/ __| / _ \\| || | | |\n" +
" | |____ | | | || (_) || (_) |\\__ \\|  __/  \\ V  V / | |\\__ \\|  __/| || |_| |\n" +
"  \\_____||_| |_| \\___/  \\___/ |___/ \\___|   \\_/\\_/  |_||___/ \\___||_| \\__, |\n" +
"                                                                       __/ |\n" +
"                                                                      |___/  \n" +
           "A - Adventure\n"+
          " B - Sleep\n"+    
           "H - Help\n" +
           " Q - Quit game");       
        inputs[0] = menuItem;   
          
        return inputs;

    }

     @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
//        menuItem = inputs[0].toUpperCase();

        switch (menuItem) {
             case "A":
                gameMenu();
                break;
            case "B":
                sleepView();
                break;
            case  "H":
                helpMenu();
                break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Please enter a valid option.");
        }

        return false;
    }

    private void gameMenu() {
        MainMenuView mainMenuView = new MainMenuView();

        mainMenuView.display();
    }

    private void sleepView() {
        SleepView sleepView = new SleepView();
        
        sleepView.display();
    }

    private void helpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        
        helpMenuView.display(); 
    }
}
