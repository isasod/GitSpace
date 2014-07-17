import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World{

    /**
     * Constructs a world in space
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Astronaut(), 25, 30);  
        addObject(new Astronaut(), 100, 300); 
        addObject(new Astronaut(), 200, 400); 
        addObject(new Astronaut(), 300, 200);
        addObject(new Astronaut(), 20, 150);
        addObject(new Asteroid(), 50, 70); 
        addObject(new Asteroid(), 150, 270); 
        addObject(new Asteroid(), 350, 370); 
        addObject(new Rocket(), 50, 20); 
 
 
      
    }
}
