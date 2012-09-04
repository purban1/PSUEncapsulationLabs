/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Patrick
 */
public class Game {
    private boolean typeBlackjack = false;
    private boolean typeTicTacToe = false;
    private boolean typeDice = false;
    private String gameChoice="";
        
    public Game(){
        
    }
    
    /**
     * @param typeBlackjack the typeBlackjack to set
     */
    public void setTypeBlackjack(boolean typeBlackjack) {
        this.typeBlackjack = typeBlackjack;
    }

    /**
     * @param typeTicTacToe the typeTicTacToe to set
     */
    public void setTypeTicTacToe(boolean typeTicTacToe) {
        this.typeTicTacToe = typeTicTacToe;
    }

    /**
     * @param typeDice the typeDice to set
     */
    public void setTypeDice(boolean typeDice) {
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
    public void setGameChoice(String gameChoice) {
        this.gameChoice = gameChoice;
    } 
}