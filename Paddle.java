import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * This is my class Paddle here.
 * 
 * @author (Jazzdin Eulalia) 
 * @version (November, 15, 2017)
 */
public class Paddle extends Actor
{
    private static final int WIDTH = 10;
    private static final int HEIGHT = 60;
    private String upKey;
    private String downKey;
    GreenfootImage paddleImage;

    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkKeyPress();
    }    
    
    public Paddle(boolean isLeft)
    {
        GreenfootImage paddleImage = new GreenfootImage( WIDTH, HEIGHT );
        if( isLeft == true )
        {
            upKey = "w";
            downKey = "s";
            paddleImage.setColor(Color.BLUE);
            paddleImage.fillRect( 0, 0, WIDTH, HEIGHT );

        }
        else
        {
            upKey = "up";
            downKey = "down";
            paddleImage.setColor(Color.YELLOW);
            paddleImage.fillRect( 0, 0, WIDTH, HEIGHT );
        }
        setImage(paddleImage);
    }
    
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown( upKey ) )
        {
            setLocation( getX(), getY() -4 );
            
        }
        
        if(Greenfoot.isKeyDown( downKey ) )
        {
            setLocation( getX(), getY() +4 );
        }
    }   
    
}    
