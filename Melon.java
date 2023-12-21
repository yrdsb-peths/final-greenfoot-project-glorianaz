import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Melon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Melon extends Actor
{
    /**
     * Act - do whatever the Melon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        touch();
    }
    int speed = 20;
    
    public void touch()
    {
        
        if(isTouching(Orange.class))
        {
            
            removeTouching(Orange.class);
            MyWorld world = (MyWorld) getWorld();
            int x = getX();
            int y = getY();
            setLocation(x, y);
            speed = 0;
            world.createMelon(x, y + 5); 
            if(isTouching(Melon.class))
            {
                removeTouching(Orange.class);
                if(isTouching(Orange.class))
                {
                removeTouching(Orange.class);
                }
            }

        }
        
        if(isTouching(Blueberry.class))
        {
            int x = getX();
            int y = getY();
            setLocation(x, y);
            speed = 0;
        }
        
        if(isTouching(Strawberry.class))
        {
            int x = getX();
            int y = getY();
            setLocation(x, y);
            speed = 0;
        }
        
        if(isTouching(Orange.class))
        {
            int x = getX();
            int y = getY();
            setLocation(x, y);
            speed = 0;
        }
    }
}
