import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.awt.Color;

public class Ludek extends Actor
{
    String imie;
    public void act() 
    {
        try{
       do{
        imie = JOptionPane.showInputDialog("Jak masz na imię?");
        }while(imie.isEmpty()); 
        setImage(new GreenfootImage("Cześć " + imie, 24, Color.RED, null));
        Greenfoot.stop();
       }    
       catch(Exception e)
       {
           imie = "";
           JOptionPane.showMessageDialog(null,"Wprowadź dane!");
       }
}
}
