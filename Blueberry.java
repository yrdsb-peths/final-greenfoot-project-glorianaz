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
            
            
            if(getY() >= getWorld().getHeight() - 1)
            {
                setLocation(getX(), getWorld().getHeight() - 40);
                speed = 0;
            }
        } 
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }

    
}
