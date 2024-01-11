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
    private boolean touch = false;
    
    public void touch()
    {
        
        if(isTouching(Strawberry.class) && !touch)
        {
            int touchingStrawberriesCount = getIntersectingObjects(Strawberry.class).size();
            removeTouching(Strawberry.class);
            
            int x = getX();
            int y = getY();
            setLocation(x, y);
            speed = 0;
                
            MyWorld world = (MyWorld) getWorld();
            world.createOrange(x, y-2); 
                
            touch = true;

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
