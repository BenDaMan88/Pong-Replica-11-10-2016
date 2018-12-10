import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class ScoreP1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreP1 extends Actor
{
    int ScoreP1 = 0;
    int ScoreP2 = 0;
    
    /**
     * Act - do whatever the ScoreP1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("" + ScoreP1, 60, Color.WHITE, null));
        
        if (ScoreP1 == 10)
        {
            Greenfoot.setWorld(new P1Wins(ScoreP1, ScoreP2));
        }
    }    
    
    public void IncrementScoreP1()
    {
        ScoreP1++;
    }
    
        public void IncrementScoreP2()
    {
        ScoreP2++;
    }
    
    public int getScoreP1()
    {
        return ScoreP1;
    }
}
