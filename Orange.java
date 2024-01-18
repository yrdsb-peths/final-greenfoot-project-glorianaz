import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orange here.
 * 
 * @author Gloriana Zheng
 * @version January 2024
 */
public class Orange extends Actor
{
    /**
     * Act - do whatever the Orange wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        touch();
    }
    
    int speed = 200;

    // When 2 oranges touch, it creates a melon
    public void touch()
    {
         if(isTouching(Orange.class))
        {
            
            MyWorld world = (MyWorld) getWorld();
            int x = getX();
            int y = getY();
            setLocation(x, y);
            speed = 0;
            
            // If the orange gets too close to the top of the screen, it calls game over
            if(y <= 25 )
            {
                world.gameOver();
            }
            
            while(isTouching(Orange.class))
            {
                removeTouching(Orange.class);
            }
            
            world.createMelon(x, y);
        
            if(isTouching(Melon.class))
            {
                removeTouching(Orange.class);
                
            }
        }
        
        if(isTouching(Strawberry.class))
        {
            int x = getX();
            int y= getY();
            setLocation(x, y);
            speed = 0;
        }
        
    }
    
}
