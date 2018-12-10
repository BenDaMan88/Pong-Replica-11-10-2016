import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class score extends Actor
{
    /*
    int score1 = 0;
    int score2 = 0;

    public void Incrementscore1()
    {
    score1++;
    }

    public void Incrementscore2()
    {
    score2++;
    }
     */  

    public score(int score1, int score2)
    {
        GreenfootImage scorefinal = new GreenfootImage(score1 + " : " + score2, 48, Color.WHITE, null);
        setImage(scorefinal);
    }
    
    /**
     * Act - do whatever the score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }    
}
