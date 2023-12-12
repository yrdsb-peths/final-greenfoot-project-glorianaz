import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Watermelon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Watermelon extends Actor
{
    GreenfootImage[] idle = new GreenfootImage[30];
    
    /**
     * Constructor - The code that ges run one time when object is created 
     */
    
    public Watermelon()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/watermelon_idle/watermelon" + i + ".png");
        }    
        setImage(idle[0]);
    }   
    
    /**
     * Animate the watermelon
     */
    int imageIndex = 0;
    public void animateWatermelon()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    
    /**
     * Act - do whatever the Watermelon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        // Animate the Watermelon
        animateWatermelon();
    }
}
