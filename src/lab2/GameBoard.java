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
public class GameBoard {
    private String numberOfDice;
    private String numberOfDecks;
    private String ticTacToeLetter;
    
    Scanner keyboard = new Scanner(System.in);

    public GameBoard(){
        this.numberOfDecks="0";
        this.numberOfDice="0";
        this.ticTacToeLetter = "0";
    }
    
    public void initializeTheGameBoard (String gameChosen){
        String userInput;
        
        if (gameChosen.equals("Black Jack"))
        {
            System.out.println("\nHow many decks do you want in the shoe?");
            userInput = keyboard.nextLine();
            //Validate the choice is > 0 and < 7 decks of cards
            this.setNumberOfDecks(userInput);
        }
        else if (gameChosen.equals("Tic Tac Toe"))
        {
            System.out.println("\nDo you wish to be 'X' or 'O'?");
            userInput = keyboard.nextLine();
            //Validate the choice before setting field to 'X' or 'O'
            this.setTicTacToeLetter(userInput);
        }
        else
        {
            System.out.println("\nHow many dice will you be shaking?");
            userInput = keyboard.nextLine();
            //Validate the choice is > 0 and < 7 dice
            this.setNumberOfDice(userInput);
        }
        confirmTheSetupOfTheGame(gameChosen);
        
        
    }
    
    private void confirmTheSetupOfTheGame(String game){
        System.out.println("\nYour game of " + game + " has been setup.");
    }

    /**
     * @return the numberOfDice
     */
    public String getNumberOfDice() {
        return numberOfDice;
    }

    /**
     * @param numberOfDice the numberOfDice to set
     */
    private void setNumberOfDice(String numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    /**
     * @return the numberOfDecks
     */
    public String getNumberOfDecks() {
        return numberOfDecks;
    }

    /**
     * @param numberOfDecks the numberOfDecks to set
     */
    private void setNumberOfDecks(String numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }

    /**
     * @return the ticTacToeLetter
     */
    public String getTicTacToeLetter() {
        return ticTacToeLetter;
    }

    /**
     * @param ticTacToeLetter the ticTacToeLetter to set
     */
    private void setTicTacToeLetter(String ticTacToeLetter) {
        this.ticTacToeLetter = ticTacToeLetter;
    }

    

}
