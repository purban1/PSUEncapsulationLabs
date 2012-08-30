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
public class Game {
    private boolean typeBlackjack = false;
    private boolean typeTicTacToe = false;
    private boolean typeDice = false;
    private String gameChoice="";
    
    Scanner keyboard = new Scanner(System.in);
    
    public Game(){
        
    }
    
    public void chooseYourGame(){
        String gameChoice;
        
        System.out.println("\nWould you like to play Blackjack (B), Tic Tac Toe (T)" +
                " or Dice (D)");
        gameChoice = keyboard.nextLine().toUpperCase();
        // include validators for choise and set appropriate boolean value for game choosen
        if (gameChoice.equals("B")){
            setTypeBlackjack(true);
            setGameChoice("Black Jack");
        }
        else if (gameChoice.equals("T")){
            setTypeTicTacToe(true);       
            setGameChoice("Tic Tac Toe");
        }
        else{
            setTypeDice(true);
            setGameChoice("Dice");
        }
        confirmGameChoice();
        
        /*
         * Create the GameBoard by send the game chosen
         */
        GameBoard gameBrd = new GameBoard();
        gameBrd.initializeTheGameBoard(getGameChoice());
        
    }
    
    /**
     * @param typeBlackjack the typeBlackjack to set
     */
    private void setTypeBlackjack(boolean typeBlackjack) {
        this.typeBlackjack = typeBlackjack;
    }

    /**
     * @param typeTicTacToe the typeTicTacToe to set
     */
    private void setTypeTicTacToe(boolean typeTicTacToe) {
        this.typeTicTacToe = typeTicTacToe;
    }

    /**
     * @param typeDice the typeDice to set
     */
    private void setTypeDice(boolean typeDice) {
        this.typeDice = typeDice;
    }

    /**
     * @return the typeBlackjack
     */
    public boolean isTypeBlackjack() {
        return typeBlackjack;
    }

    /**
     * @return the typeTicTacToe
     */
    public boolean isTypeTicTacToe() {
        return typeTicTacToe;
    }

    /**
     * @return the typeDice
     */
    public boolean isTypeDice() {
        return typeDice;
    }
    
     /**
     * @return the gameChoice
     */
    public String getGameChoice() {
        return gameChoice;
    }

    /**
     * @param gameChoice the gameChoice to set
     */
    private void setGameChoice(String gameChoice) {
        this.gameChoice = gameChoice;
    }
    
    private void confirmGameChoice(){
        System.out.println("You have choosen to play " + getGameChoice() + ".");
    }

   
}
