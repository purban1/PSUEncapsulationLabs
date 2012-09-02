/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Patrick (purban1)
 */
public class startup {
    public static void main(String[] args) {
    
        Game yourGame = new Game();
        
        // Create the character and setup the game.
        yourGame.chooseYourGame();
        
        // Setup the GUI
        GameGUI gui = new GameGUI();
        gui.setUpGameGUI();
    }
}