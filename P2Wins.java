import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P2Wins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P2Wins extends World
{

    /**
     * Constructor for objects of class P2Wins.
     * 
     */
    public P2Wins(int score1, int score2)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(PongWorld.WIDTH, PongWorld.HEIGHT, PongWorld.CELL_SIZE); 
        
        menuButton menu = new menuButton();
        addObject(menu, getWidth()/2, getHeight()*3/4);
        
        PlayAgainButton playagain = new PlayAgainButton();
        addObject(playagain, getWidth()/2, getHeight()*3/4 - 80);
        
        Player2Wins p2win = new Player2Wins();
        addObject(p2win, getWidth()/2, getHeight()/3 - 50);
        
        score Score = new score(score1, score2);
        addObject(Score, getWidth()/2, getHeight()/2 - 50);
    }
}
