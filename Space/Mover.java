import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Mover. This is a base class for all object that can move around in space. In addition
 * to the standard Actor methods, it provides the ability to move and turn.
 * 
 * Based on the code from the class Animal from Introduction to programming with Greenfoot, 
 * chapter 4
 */
public class Mover extends Actor
{
    private double _speed = 5.0;
    
    /**
     * Constructor for Mover, set the speed of the mover
     */
    public Mover(double speed)
    {
        _speed = speed;
    }

    /**
     * Act - empty method. Movers have no default action.
     */
    public void act()
    {
    }
        
    /**
     * Turn 'angle' degrees towards the right (clockwise).
     */
    public void turn(int angle)
    {
        setRotation(getRotation() + angle);
    }
    
    /**
     * Move forward in the current direction.
     */
    public void move()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle) * _speed);
        int y = (int) Math.round(getY() + Math.sin(angle) * _speed);
        
        setLocation(x, y);
    }
    
    /**
     * Test if we are close to one of the edges of the world. Return true is we are.
     */
    public boolean atWorldEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
    
    
    /**
     * Return true if we can see an object of class 'clss' right where we are. 
     * False if there is no such object here.
     */
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    
    /**
     * Remove an object of class 'clss' if there is such an object where we are.
     * Otherwise do nothing.
     */
    public void removeSeen(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }  
}
