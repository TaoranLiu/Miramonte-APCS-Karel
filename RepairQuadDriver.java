/**
   @Author:
      Date:
   Teacher: Boyko
  */
import kareltherobot.*;
import java.awt.Color;

public class RepairQuadDriver implements Directions
{
    public static void main(String args[])  {
        Robot karel = new Robot(1, 1, East, -1);  
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/quad.kwld"); 
        World.setBeeperColor(Color.black);
        World.setStreetColor(Color.gray);
        World.setNeutroniumColor(Color.black);
        World.setDelay(10);  
        World.setVisible(true);
    }
}
