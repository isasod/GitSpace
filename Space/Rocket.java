import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Mover
{
    public Rocket() 
    {
        //set speed of rocket to 2
        super(2);        
    }
    
    public void act() 
    {
        
        move(2); //gör att raketen kan röra sig
        if (Greenfoot.isKeyDown("left"))
        { turn(-4);}
        if (Greenfoot.isKeyDown("right"))
        { turn(4);}
        canSee(Astronaut.class);// gör att raketen kan se astronauten 
        removeSeen(Astronaut.class);// gör att raketen kan "plocka upp" astronauterna den träffar
       

    }    
}
