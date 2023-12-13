import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blueberry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blueberry extends Actor
{
    public Blueberry()
    {
        
        
    }
    
    /**
     * Act - do whatever the Blueberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MouseInfo mouseInfo = Greenfoot.getMouseInfo();
    public void act()
    {
        // Add your action code here.
        if(mouseInfo != null)
        {
            int x = mouseInfo.getX();
            int y = mouseInfo.getY();
            setLocation(x, y);
        }
    }
}
