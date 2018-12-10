import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PONGtitle extends Actor
{
    /**
     * Act - do whatever the StartScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PONGtitle()
    {
        GreenfootImage title = new GreenfootImage("PONG_title.png");
        setImage(title);
        
        //setImage(new GreenfootImage("PONG", 48, Color.WHITE, Color.BLACK));
    } 
}
