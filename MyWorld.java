import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{


    public MyWorld()
    {    
        super(600, 400, 1);
        
        Ludek ludek = new Ludek();
        addObject(ludek, 300, 200);
        
    }
}
