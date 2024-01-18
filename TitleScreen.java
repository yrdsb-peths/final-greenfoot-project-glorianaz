import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the title screen of the Watermelon game
 * 
 * @author Gloriana Zheng 
 * @version December 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("WATERMELON!", 55);
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, getWidth()/2, getHeight()/2 - 130);
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
        Label label1 = new Label("Press Space to Play!", 30);
        addObject(label1,getWidth()/2, getHeight()/2 - 90);
        Label label2 = new Label("Combine fruits to make as ", 30); 
        Label label3 = new Label("many WATERMELONS", 30);
        Label label4 = new Label("GAME OVER if the fruits leave the screen!", 30);
        Label label5 = new Label("Click the screen on where you", 27);
        Label label6 = new Label("want the fruit to fall", 27);
        Label label7 = new Label("to save FRUITOPIA", 30);
        addObject(label2, getWidth()/2 +80, getHeight()/2 -40);
        addObject(label3, getWidth()/2 + 75, getHeight()/2 -10);
        addObject(label4, getWidth()/2, getHeight()/2 + 150);
        addObject(label5, getWidth()/2 + 75, getHeight()/2 + 70);
        addObject(label6, getWidth()/2 +75, getHeight()/2 + 100);
        addObject(label7, getWidth()/2 + 75, getHeight()/2 + 20);
        
        // This adds the array of the watermelon animation
        Watermelon watermelon = new Watermelon();
        addObject(watermelon, getWidth()/2 - 190, getHeight()/2 + 20);
    }
}
