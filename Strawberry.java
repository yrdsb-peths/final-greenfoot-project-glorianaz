import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Strawberry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strawberry extends Actor
{
    /**
     * Act - do whatever the Strawberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        touch();
    }
    
    int speed = 200;
    
    public void touch()
    {
        
        if(isTouching(Strawberry.class))
        {
            
            removeTouching(Strawberry.class);
            MyWorld world = (MyWorld) getWorld();
            int x = getX();
            int y = getY();
            setLocation(x, y);
            speed = 0;
            world.createOrange(x, y + 5); 
            if(isTouching(Orange.class))
            {
                removeTouching(Strawberry.class);
         

                if(isTouching(Strawberry.class))
                {
                removeTouching(Strawberry.class);
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
    }
}
