import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blueberry here.
 * 
 * @author Gloriana Zheng
 * @version December 2023 
 */
public class Blueberry extends Actor
{
    int speed = 100;
    
    /**
     * Act - do whatever the Blueberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        MouseInfo mouseInfo = Greenfoot.getMouseInfo();
        if(mouseInfo != null)
        {
            int x = mouseInfo.getX();
            int y = mouseInfo.getY();
            
            int leftBoundary = 20;
            int rightBoundary = getWorld().getWidth() - 20;
            int topBoundary = 20;
            int bottomBoundary = getWorld().getHeight() - 40;
        
            setLocation(getX(), getY() + speed);
        
            if(x < leftBoundary)
            {
                setLocation(leftBoundary, y);
            }else if(x > rightBoundary)
            {
                setLocation(rightBoundary, y);
            }  
        
            if(y < topBoundary)
            {
                setLocation(x, topBoundary);
            }else if(y > bottomBoundary)
            {
                setLocation(x,bottomBoundary);
            }
            
            touch();
            
            if(getY() >= getWorld().getHeight() - 40)
            {
                
                
                setLocation(getX(), getWorld().getHeight() - 40);
                speed = 0;
            }
        } 
    }
    
    public int setSpeed(int spd)
    {
        speed = spd;
        return speed;
    }
    
    
    public void touch()
    {
        
        if(isTouching(Blueberry.class) && !isTouching(Strawberry.class))
        {
            int touchingBlueberriesCount =  getIntersectingObjects(Blueberry.class).size();
            

            if(touchingBlueberriesCount == 1)
            {
                // remove touching blueberry
                int x = getX();
                int y = getY();
                setLocation(x, y);
                speed = 0;
                
                while(isTouching(Blueberry.class))
                {
                    removeTouching(Blueberry.class);
                }
                
                
                MyWorld world = (MyWorld) getWorld();
                world.createStrawberry(x, y + 7);
            }
        }
        
        if(isTouching(Strawberry.class))
        {
            int x = getX();
            int y = getY();
            setLocation(x, y);
            speed = 0;
        }
    }    
    
}
