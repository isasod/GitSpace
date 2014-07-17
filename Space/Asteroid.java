import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Mover
{
    public Asteroid() 
    {
        //set speed of asteroid to 1
        super(1);
    }
    
    public void act() 
    {
     
        move();// Add your action code here.
         if (atWorldEdge())
        { turn(5);}//om asteroiden krockar med världskanten kommer den vända med 30 graders vinkel
        if (Greenfoot.getRandomNumber(100)<10)
        {turn(50);}
        move(3);

      
    }  

public void destroy ()
{
Actor Rocket;
Rocket= getOneObjectAtOffset(0,0,Rocket.class);
if (Rocket !=null) {   
World world;    
world= getWorld();
world.removeObject(Rocket);
Greenfoot.playSound("explosion.wav");
}}}
  
