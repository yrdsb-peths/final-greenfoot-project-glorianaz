import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the title screen of the Watermelon game
 * 
 * @author Gloriana Zheng 
 * @version December 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Watermelon", 55);
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, getWidth()/2, getHeight()/2 - 100);
        prepare();
    }
    
    public void act()
    {
        // Stars the game when user presses space bar 
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }  
    }
    
    private void prepare()
    {
        Label label1 = new Label("Press Space to Play!", 35);
        addObject(label1,getWidth()/2 + 75, getHeight()/2 - 40);
        Label label2 = new Label("Combine fruits until it", 30); 
        Label label3 = new Label("evolves to a WATERMELON", 30);
        addObject(label2, getWidth()/2 + 75, getHeight()/2 + 10);
        addObject(label3, getWidth()/2 + 75, getHeight()/2 + 40 );
        
        Watermelon watermelon = new Watermelon();
        addObject(watermelon, getWidth()/2 - 190, getHeight()/2 + 20);
    }
}
