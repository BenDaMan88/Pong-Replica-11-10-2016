import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playButton extends Actor
{
    /**
     * Act - do whatever the playButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public playButton() 
    {
        GreenfootImage Play = new GreenfootImage("play.png");
        setImage(Play);

    }  

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new PongWorld());
        }
    }
}
