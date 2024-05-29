package moyazouhon;
import java.awt.Color;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.HitWallEvent;

public class MoyaZouhon extends Robot {
 
    public void run(){

        setBodyColor(Color.pink);
		setGunColor(Color.pink); 
		setRadarColor(Color.pink);
		setBulletColor(Color.pink);
		setScanColor(Color.pink);

       
        
		// controls generic movement for entire game
		while (true) {
            
            ahead(200);
            turnLeft(67);
            back (50);
            ahead (500);
            turnLeft (23);
			turnGunRight(45);
            ahead(300);
            back (50);
            turnLeft(34);
            ahead (50);
            turnLeft (45);
			turnGunRight(45);
		}
            
            
       }
       public void onScannedRobot(ScannedRobotEvent e) {
        double distance= e.getDistance();    

        if (distance <=50){
            fire(5);
        }else if (distance <= 100){
            fire (3);
        }else if (distance<= 200){
            fire(1);
        }else{
            fire(.5);
        }
    }


 }      
    
   
   
        
	




