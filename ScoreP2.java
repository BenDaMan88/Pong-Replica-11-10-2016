import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class ScoreP2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreP2 extends Actor
{
    int ScoreP2 = 0;
    int ScoreP1 = 0;
    
    /**
     * Act - do whatever the ScoreP1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("" + ScoreP2, 60, Color.WHITE, null));
        
        if (ScoreP2 == 10)
        {
            Greenfoot.setWorld(new P2Wins(ScoreP1, ScoreP2));
        }
    }    

    public void IncrementScoreP2()
    {
        ScoreP2++;
    }
    
    public void IncrementScoreP1()
    {
        ScoreP1++;
    }
    
    public int getScoreP2()
    {
        return ScoreP2;
    }
}