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
    
    Game yourGame = new Game();
    GameCharacter character = new GameCharacter();
    GameBoard gameBrd = new GameBoard();
    
    public GameGUI() {
        this.gameBackgroundColor="";
        this.gameBoardWidth = 0;
        this.gameBoardHeight = 0;
    }
    
    public void setUpGameGUI(){
        String colorFromUser;
        int sizeFromUser;
        
        // Validators needed for width and height 
        System.out.println("What is the width of your gameboard?");
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
        
        // Create the character and setup the game.
        chooseYourGame();
        
        // Intialize the the gameboard
        initializeTheGameBoard(yourGame.getGameChoice());
        
        // Setup the Game Character
        setupGameCharacter();
    
    }
    
    private void confirmTheSetup(){
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
    public void setGameBackgroundColor(String gameBackgroundColor) {
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
    public void setGameBoardWidth(int gameBoardWidth) {
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
    public void setGameBoardHeight(int gameBoardHeight) {
        this.gameBoardHeight = gameBoardHeight;
    }
    
    private void chooseYourGame(){
        String gameChoice;
        
        System.out.println("\nWould you like to play Blackjack (B), Tic Tac Toe (T)" +
                " or Dice (D)");
        gameChoice = keyboard.nextLine().toUpperCase();
        // include validators for choise and set appropriate boolean value for game choosen
        if (gameChoice.equals("B")){
            yourGame.setTypeBlackjack(true);
            yourGame.setGameChoice("Black Jack");
        }
        else if (gameChoice.equals("T")){
            yourGame.setTypeTicTacToe(true);       
            yourGame.setGameChoice("Tic Tac Toe");
        }
        else{
            yourGame.setTypeDice(true);
            yourGame.setGameChoice("Dice");
        }
        confirmGameChoice();
    }
    
    private void confirmGameChoice(){
        System.out.println("You have choosen to play " + yourGame.getGameChoice() + ".");
    }
    
    public void initializeTheGameBoard (String gameChosen){
        String userInput;
        
        if (gameChosen.equals("Black Jack"))
        {
            System.out.println("\nHow many decks do you want in the shoe?");
            userInput = keyboard.nextLine();
            //Validate the choice is > 0 and < 7 decks of cards
            gameBrd.setNumberOfDecks(userInput);
        }
        else if (gameChosen.equals("Tic Tac Toe"))
        {
            System.out.println("\nDo you wish to be 'X' or 'O'?");
            userInput = keyboard.nextLine();
            //Validate the choice before setting field to 'X' or 'O'
            gameBrd.setTicTacToeLetter(userInput);
        }
        else
        {
            System.out.println("\nHow many dice will you be shaking?");
            userInput = keyboard.nextLine();
            //Validate the choice is > 0 and < 7 dice
            gameBrd.setNumberOfDice(userInput);
        }
        confirmTheSetupOfTheGame();

    }
    
    private void confirmTheSetupOfTheGame(){
        System.out.println("\nYour game of " + yourGame.getGameChoice() + " has been setup.");
    }
    
    private void setupGameCharacter(){
        String input;
        
        System.out.println("\nWhat is the player name?");
        input = keyboard.nextLine();
        character.setPlayerName(input);

        System.out.println("What is the player gender?");
        input = keyboard.nextLine();
        /* Setup validation here before passing to setter to 
           make sure input is 'Male', 'Female'
        */
        character.setPlayerGender(input);

        System.out.println("What is the skill level would you like to play at?");
        System.out.println("( (1) Easy, (2) Novice, (3) Hard )");
        input = keyboard.nextLine();
        /* Setup validation here before passing to setter to 
           make sure input is 1, 2 or 3
        */
        character.setplayerSkillLevel(Integer.parseInt(input));
    }
}
