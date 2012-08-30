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
public class GameCharacter {
    private String playerName;
    private String playerGender;
    private int playerNumber;
    
    Scanner keyboard = new Scanner(System.in);
    
    public GameCharacter(){
        this.playerName = "";
    }

    /*
     *  @param Setup all player information
     */
    public void setupGameCharacter(){
        String input;
        
        System.out.println("What is the player name?");
        input = keyboard.nextLine();
        setPlayerName(this.playerName);

        System.out.println("What is the player gender?");
        input = keyboard.nextLine();
        setPlayerGender(this.playerGender);

        System.out.println("What is the player number?");
        input = keyboard.nextLine();
        // Setup validation here before passing to setter to 
        // make sure input is 'Male', 'Female'
        setplayerNumber(Integer.parseInt(input));
    }

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    private void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the playerGender
     */
    public String getPlayerGender() {
        return playerGender;
    }

    /**
     * @param playerGender the playerGender to set
     */
    private void setPlayerGender(String playerGender) {
        this.playerGender = playerGender;
    }

    /**
     * @return the playerNumber
     */
    public int getplayerNumber() {
        return playerNumber;
    }

    /**
     * @param playerNumber the playerNumber to set
     */
    private void setplayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}
