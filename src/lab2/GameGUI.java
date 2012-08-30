/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Patrick
 */
public class GameGUI {
    private String gameBackgroundColor="";
    private int gameBoardWidth;
    private int gameBoardHeight;

    Scanner keyboard = new Scanner(System.in);

    public GameGUI() {
        this.gameBackgroundColor="";
        this.gameBoardWidth = 0;
        this.gameBoardHeight = 0;
    }
    
    public void setUpGameGUI(){
        String colorFromUser;
        int sizeFromUser;
        
        // Validators needed for width and height 
        System.out.println("\nWhat is the width of your gameboard?");
        sizeFromUser = keyboard.nextInt();
        this.setGameBoardWidth(sizeFromUser);
        
        System.out.println("What is the height of your gameboard?");
        sizeFromUser = keyboard.nextInt();
        this.setGameBoardHeight(sizeFromUser);

        // Consume the line feed
        keyboard.nextLine();
        
        // Validators needed for color i.e. not a number
        System.out.println("What color should your gameboard be?");
        colorFromUser = keyboard.nextLine();
        this.setGameBackgroundColor(colorFromUser);
        
        confirmTheSetup();
    }
    
    public void confirmTheSetup(){
        System.out.println("\nYour background color is set to " + this.getGameBackgroundColor() + ".");
        System.out.println("The size of the gameboard is " + this.getGameBoardWidth() + " x " + this.getGameBoardHeight() + ".");
    }
    
    /**
     * @return the gameBackgroundColor
     */
    public String getGameBackgroundColor() {
        return gameBackgroundColor;
    }

    /**
     * @param gameBackgroundColor the gameBackgroundColor to set
     */
    private void setGameBackgroundColor(String gameBackgroundColor) {
        this.gameBackgroundColor = gameBackgroundColor;
    }

    /**
     * @return the gameBoardWidth
     */
    public int getGameBoardWidth() {
        return gameBoardWidth;
    }

    /**
     * @param gameBoardWidth the gameBoardWidth to set
     */
    private void setGameBoardWidth(int gameBoardWidth) {
        this.gameBoardWidth = gameBoardWidth;
    }

    /**
     * @return the gameBoardHeight
     */
    public int getGameBoardHeight() {
        return gameBoardHeight;
    }

    /**
     * @param gameBoardHeight the gameBoardHeight to set
     */
    private void setGameBoardHeight(int gameBoardHeight) {
        this.gameBoardHeight = gameBoardHeight;
    }
}
