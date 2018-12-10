import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PongWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PongWorld extends World
{
    ScoreP1 scorep1 = new ScoreP1();
    ScoreP2 scorep2 = new ScoreP2();
    //score Score = new score();
    public final static int WIDTH = 600;
    public final static int HEIGHT = 400;
    public final static int CELL_SIZE = 1;
    

    public ScoreP1 getScoreP1()
    {
        return scorep1;
    }
    
    public ScoreP2 getScoreP2()
    {
        return scorep2;
    }
    
    /**
     * Constructor for objects of class PongWorld.
     * 
     */
    public PongWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WIDTH, HEIGHT, CELL_SIZE); 
        
        baseWorld();
        
    }
    
    public void baseWorld()
    {
        for(int i = 0; i < getHeight(); i += 60)
        {
            middle line = new middle();
            addObject(line, getWidth()/2, i + 20);
        }
        
        player1 p1 = new player1();
        addObject(p1, getWidth()/8, getHeight()/2);
        
        player2 p2 = new player2();
        addObject(p2, getWidth()*7/8, getHeight()/2);
        
        cube Cube = new cube();
        addObject(Cube, getWidth()/2 , Greenfoot.getRandomNumber(getHeight()));
        
        addObject(scorep1, getWidth()/2 - 40, 30);
        
        addObject(scorep2, getWidth()/2 + 40, 30);
    }
}
