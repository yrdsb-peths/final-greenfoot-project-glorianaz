import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blueberry here.
 * 
 * @author Gloriana Zheng
 * @version December 2023 
 */
public class Blueberry extends Actor
{
    int speed = 1;
    
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
            
            int leftBoundary = 0;
            int rightBoundary = getWorld().getWidth() - 1;
            int topBoundary = 0;
            int bottomBoundary = getWorld().getHeight() - 1;
        
            setLocation(x, y + speed);
        
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
        } 
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }

    
}
