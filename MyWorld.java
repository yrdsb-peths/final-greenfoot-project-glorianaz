import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Gloriana Zheng
 * @version December 2023
 */
public class MyWorld extends World
{

    Label scoreLabel;
    public int score = 0;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, getWidth()/2 - 250, getHeight() - 90);
        
        // sets the order of the way the classes appear in the world 
        setPaintOrder(Label.class, Melon.class, Orange.class, Strawberry.class, Blueberry.class);
        
    }

    
    private boolean gameIsOver = false;
    /*
     * End the game and draw game over
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("GAME OVER", 100);
        addObject(gameOverLabel, getWidth()/2, getHeight()/2);
        removeObject(scoreLabel);
        Label scoreLabel = new Label("Score: " + score, 50);
        addObject(scoreLabel, getWidth()/2, getHeight()/2 + 70);
        Label reset = new Label("Press space to restart", 50);
        addObject(reset, getWidth()/2 , getHeight()/2 + 110);
        gameIsOver = true;
    }
    
    /*
     * This method creates a blueberry
     */
    public void createBlueberry(int x, int y)
    {
        // doesn't allow to add more fruits when game is over
        if (gameIsOver) return;
        
        // Adds a blueberry if the user clicks the screen and lets it fall from the top
        if(x >= 0 && x < getWidth())
        {
            Blueberry blueberry = new Blueberry();
            addObject(blueberry, x, 0);
            blueberry.setSpeed(10);
        }
    }
    
    
     /*
     * This method creates a strawberry
     */
    public void createStrawberry(int x, int y)
    {
        if (gameIsOver) return;
        
        if(x >= 0 && x < getWidth())
        {
            Strawberry strawberry  = new Strawberry();
            addObject(strawberry, x, y);
            strawberry.setSpeed(10);
        }
    }
    
    
     /*
     * This method creates an orange
     */
    public void createOrange(int x, int y)
    {
        if (gameIsOver) return;
        
        Orange orange = new Orange();
        addObject(orange, x, y);
    }
   
     /*
     * This method creates a melon
     */
    public void createMelon(int x, int y)
    {
        if (gameIsOver) return;
        
        Melon melon = new Melon();
        addObject(melon, x, y - 30);
        
        // When user gets a melon, the score updates 
        score++;
        scoreLabel.setValue(score);
     
    }

    
    public void act()
    {
        
        if(gameIsOver)
        {
            // Resets the world when it is game over when hte user clicks space button
            if(Greenfoot.isKeyDown("space"))
            {
                gameIsOver = false;
                Greenfoot.setWorld(new MyWorld());
            }
        }
        
        if (gameIsOver) return;
        
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        // creating random blueberry or strawberry that appears at the top of the screen 
        if (Greenfoot.mousePressed(null) && mouse != null)
        {
            int random = Greenfoot.getRandomNumber(2);
        
            if(random == 0)
            {
                createStrawberry(mouse.getX(), 0);
            }
            else 
            {
                createBlueberry(mouse.getX(), 0);
            }
        }
        
       
    }
    
    
}
