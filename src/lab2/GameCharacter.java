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
    private int playerSkillLevel;
    
    Scanner keyboard = new Scanner(System.in);
    
    public GameCharacter(){
        this.playerName = "";
    }

    /*
     *  @param Setup all player information
     */
    public void setupGameCharacter(){
        String input;
        
        System.out.println("\nWhat is the player name?");
        input = keyboard.nextLine();
        setPlayerName(this.playerName);

        System.out.println("What is the player gender?");
        input = keyboard.nextLine();
        /* Setup validation here before passing to setter to 
           make sure input is 'Male', 'Female'
        */
        setPlayerGender(this.playerGender);

        System.out.println("What is the skill level would you like to play at?");
        System.out.println("( (1) Easy, (2) Novice, (3) Hard");
        input = keyboard.nextLine();
        /* Setup validation here before passing to setter to 
           make sure input is 1, 2 or 3
        */
        setplayerSkillLevel(Integer.parseInt(input));
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
    public void setPlayerName(String playerName) {
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
    public void setPlayerGender(String playerGender) {
        this.playerGender = playerGender;
    }

    /**
     * @return the playerSkillLevel
     */
    public int getplayerSkillLevel() {
        return playerSkillLevel;
    }

    /**
     * @param playerSkillLevel the playerSkillLevel to set
     */
    public void setplayerSkillLevel(int playerSkillLevel) {
        this.playerSkillLevel = playerSkillLevel;
    }
}
