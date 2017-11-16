import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * This is my class Score here.
 * 
 * @author (Jazzdin Eulalia) 
 * @version (November, 15, 2017)
 */
public class Score extends Actor
{
    int playerScore;
    boolean isLeft;
    boolean scoreChanged;        
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if( scoreChanged == true )
        {
            displayScore();
        }
    }
    
    public void countScore()
    {
        playerScore++;
        scoreChanged = true;
    }
    
    public int getScore()
    {
        return playerScore;
    }
    
    public Score( boolean left )
    {
        playerScore = 0;
        isLeft = left;
        displayScore();
    }
    
    private void displayScore()
    {
        GreenfootImage display;
        
        if(isLeft == true)
        {
            display = new GreenfootImage( Integer.toString( playerScore ), 30, Color.BLUE, Color.BLACK );
            setImage(display);
        }
        else
        {
            display = new GreenfootImage( Integer.toString( playerScore ), 30, Color.YELLOW, Color.BLACK );
            setImage(display);
            scoreChanged = false;
        }
    }
}
