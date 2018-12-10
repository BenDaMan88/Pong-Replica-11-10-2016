import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cube here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cube extends Actor
{
    private int dy = (((int)(Math.random()+ .5))*2 -1)*4;
    private int dx = (((int)(Math.random()+ .5))*2 -1)*4;
    private int scoreP1 = 0;
    private int scoreP2 = 0;

    /**
     * Act - do whatever the cube wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        PongWorld world = new PongWorld();
        setLocation (getX() + dx, getY()+ dy);
        if (getX() >= world.getWidth()-10 )
        {
            World myWorld = getWorld();
            PongWorld pongworld = (PongWorld)myWorld;
            ScoreP1 scorep1 = pongworld.getScoreP1();
            ScoreP2 scorep2 = pongworld.getScoreP2();
            scorep2.IncrementScoreP1();
            scorep1.IncrementScoreP1();
            setLocation(myWorld.getWidth()/2, Greenfoot.getRandomNumber(myWorld.getHeight()));
            dy = (((int)(Math.random()+ .5))*2 -1)*4;
            dx = (((int)(Math.random()+ .5))*2 -1)*4;
            
            /*
            myWorld.removeObjects(myWorld.getObjects(player1.class));
            myWorld.removeObjects(myWorld.getObjects(player2.class));

            player1 p1 = new player1();
            myWorld.addObject(p1, myWorld.getWidth()/8, myWorld.getHeight()/2);

            player2 p2 = new player2();
            myWorld.addObject(p2, myWorld.getWidth()*7/8, myWorld.getHeight()/2);
            */
        }
        if (getX() <= 10 )
        {
            World myWorld = getWorld();
            PongWorld pongworld = (PongWorld)myWorld;
            ScoreP2 scorep2 = pongworld.getScoreP2();
            ScoreP1 scorep1 = pongworld.getScoreP1();
            scorep1.IncrementScoreP2();
            scorep2.IncrementScoreP2();
            setLocation(myWorld.getWidth()/2, Greenfoot.getRandomNumber(myWorld.getHeight()));
            dy = (((int)(Math.random()+ .5))*2 -1)*4;
            dx = (((int)(Math.random()+ .5))*2 -1)*4;
            
            /*
            myWorld.removeObjects(myWorld.getObjects(player1.class));
            myWorld.removeObjects(myWorld.getObjects(player2.class));

            player1 p1 = new player1();
            myWorld.addObject(p1, myWorld.getWidth()/8, myWorld.getHeight()/2);

            player2 p2 = new player2();
            myWorld.addObject(p2, myWorld.getWidth()*7/8, myWorld.getHeight()/2);
            */
        }
        if (getY() >= world.getHeight()-10 )
        {
            dy = -6;
        }
        if (getY() <= 10 )
        {
            dy = 6;
        }

        Actor p1;
        p1 = getOneObjectAtOffset(-10,0,player1.class);
        if(p1 != null)
        {
            dx = 6;

            int y = getWorld().getObjects(player1.class).get(0).getY();
            if(getY() >= y - 5 && getY() <= y + 5)
            {
                dy = 0;
            }
            if(getY() < y - 5 && getY() >= y-10 )
            {
                dy = -4;
            }
            if(getY() < y - 10 && getY() >= y-20 )
            {
                dy = -5;
            }
            if(getY() < y - 20 )
            {
                dy = -6;
            }
            if(getY() > y + 5 && getY() <= y + 10 )
            {
                dy = 4;
            }
            if(getY() > y + 10 && getY() <= y + 20 )
            {
                dy = 5;
            }
            if(getY() > y + 20)
            {
                dy = 6;
            }
        }

        Actor p2;
        p2 = getOneObjectAtOffset(10,0,player2.class);

        if(p2 != null)
        {
            dx = -6;
            
            int y = getWorld().getObjects(player2.class).get(0).getY();
            if(getY() >= y - 5 && getY() <= y + 5)
            {
                dy = 0;
            }
            if(getY() < y - 5 && getY() >= y-10 )
            {
                dy = -4;
            }
            if(getY() < y - 10 && getY() >= y-20 )
            {
                dy = -5;
            }
            if(getY() < y - 20 )
            {
                dy = -6;
            }
            if(getY() > y + 5 && getY() <= y + 10 )
            {
                dy = 4;
            }
            if(getY() > y + 10 && getY() <= y + 20 )
            {
                dy = 5;
            }
            if(getY() > y + 20)
            {
                dy = 6;
            }
        }
    } 

    public int getScoreP1()
    {
        return scoreP1;
    }

    public int getScoreP2()
    {
        return scoreP2;
    }

    public cube()
    {
        GreenfootImage cube = new GreenfootImage("cube.png");
        setImage(cube);
    }
}
