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
