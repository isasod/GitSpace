import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Astronaut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Astronaut extends Mover
{
    public Astronaut() 
    {
        //set speed of astronaut to 1
        super(1);
    }
    /**
     * Act - do whatever the Astronaut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (atWorldEdge())
        { turn(30);}//om astronauten krockar med världskanten kommer den vända med 30 graders vinkel
        if (Greenfoot.getRandomNumber(100)<10)
        {turn(10);}
        move(5);
       
    }
}
