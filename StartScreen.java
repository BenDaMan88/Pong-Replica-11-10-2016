import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Ben  
 * @version 10/23/16
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(PongWorld.WIDTH, PongWorld.HEIGHT, PongWorld.CELL_SIZE); 
        
        PONGtitle Title = new PONGtitle();
        addObject(Title, getWidth()/2, getHeight()/3);
        
        playButton Play = new playButton();
        addObject(Play, getWidth()/2, getHeight()*3/4);
    }
}
