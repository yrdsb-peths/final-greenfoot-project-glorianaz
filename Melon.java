import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Melon here.
 * 
 * @author Gloriana Zheng
 * @version January 2024
 */
public class Melon extends Actor
{
    /**
     * Act - do whatever the Melon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int grow = 3;
    private int maxSize = 300;
    GreenfootSound watermelonSound = new GreenfootSound("achievement.mp3");
    public void act()
    {
        // Add your action code here.
        growDissapear();
        
    }
   
    // When a melon is created, it grows and makes a sound, then dissapears
    private void growDissapear()
    {
        watermelonSound.play();
        if(getImage().getWidth() < maxSize)
        {
            GreenfootImage image = getImage();
            image.scale(image.getWidth() + grow, image.getHeight() + grow);
            setImage(image);
            
        }else 
        {
            getWorld().removeObject(this);
        }
    }
   
}
