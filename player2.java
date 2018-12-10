import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player2 extends Actor
{
    StartScreen size = new StartScreen();
    private int dy = size.getHeight()/2;
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public player2()
    {
        GreenfootImage player = new GreenfootImage("player.png");
        setImage(player);
    }
    
    public void act() 
    {
        PongWorld world = new PongWorld();
        if(Greenfoot.isKeyDown("up"))
        {
            dy -= 8;
            setLocation(world.getWidth()*7/8, dy);
        }    
        if(Greenfoot.isKeyDown("down"))
        {
            dy += 8;
            setLocation(world.getWidth()*7/8, dy);
        }
        
        if( dy < 0)
            {
                dy = 0;
            }
        if (dy > world.getHeight())
            {
                dy = world.getHeight();
            }
    }   
    
    
}
