import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Strawberry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strawberry extends Actor
{
    int speed = 200;
    private boolean touch = false;
    private boolean isFalling = false;
    /**
     * Act - do whatever the Strawberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        touch();
        
        moveDown();
      
        
        if(Greenfoot.mousePressed(this) && !isFalling)
        {
            isFalling = true;
            setSpeed(speed);
        }
        
        
    }
    
    public void moveDown()
    {
        setLocation(getX(), getY() + speed);
        
        if(getY() >= getWorld().getHeight() - 40 || isTouching(Blueberry.class) || isTouching(Melon.class) || isTouching(Orange.class))
        {
            isFalling = false;
            speed = 0;
        }
    }
    
    public int setSpeed(int spd)
    {
        speed = spd;
        return speed;
    }
    
    public void touch()
    {
        
        if(isTouching(Strawberry.class) && !touch)
        {
            int touchingStrawberriesCount = getIntersectingObjects(Strawberry.class).size();
            
            while(isTouching(Strawberry.class))
            {
                removeTouching(Strawberry.class);
            }
            
            
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
