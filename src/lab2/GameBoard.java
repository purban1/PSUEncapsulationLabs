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
        
    /**
     * @return the numberOfDice
     */
    public String getNumberOfDice() {
        return numberOfDice;
    }

    /**
     * @param numberOfDice the numberOfDice to set
     */
    public void setNumberOfDice(String numberOfDice) {
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
    public void setNumberOfDecks(String numberOfDecks) {
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
    public void setTicTacToeLetter(String ticTacToeLetter) {
        this.ticTacToeLetter = ticTacToeLetter;
    }

    

}
