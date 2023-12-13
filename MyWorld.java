import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Gloriana Zheng
 * @version December 2023
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
    }
    
    public void createBlueberry(int x, int y)
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null && x >= 0 && x < getWidth() && y >= 0 && y < getHeight())
        {
            Blueberry blueberry = new Blueberry();
            addObject(blueberry, x, 0);
            blueberry.setSpeed(1);
        }
    }
    
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if(Greenfoot.mousePressed(null))
        {
            removeObjects(getObjects(Blueberry.class));
        }
        
        
        if (Greenfoot.mousePressed(null))
        {
            createBlueberry(mouse.getX() , mouse.getY());
        }
        
    }
    
    
}
