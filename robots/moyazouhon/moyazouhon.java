package moyazouhon;
import java.awt.Color;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.HitWallEvent;
import java.util.Random;
import robocode.HitByBulletEvent;

public class MoyaZouhon extends Robot {
 
    public void run(){

        setBodyColor(Color.pink);
		setGunColor(Color.pink); 
		setRadarColor(Color.pink);
		setBulletColor(Color.pink);
		setScanColor(Color.pink);

       
        
        
        
		// controls generic movement for entire game
		while (true) {
            
            Random randomNum= new Random();
            int num = randomNum.nextInt(500) + 75;
            Random randomAngle= new Random();
            int angle= randomAngle.nextInt(360)+20; 

            

            ahead(num);
            turnLeft(angle);
            back (num);
            ahead (num);
            turnLeft (angle);
			turnGunRight(angle);
            ahead(num);
            back (num);
            turnLeft(angle);
            ahead (num);
            turnLeft (angle);
			turnGunRight(angle);
		}
            
            
       }
       //controls what happenes when another robot is detected
       public void onScannedRobot(ScannedRobotEvent e) {
        double distance= e.getDistance();    

        if (distance <=10){
            fire(5);
        }else if (distance <= 100){
            fire (2);
        }else if (distance<= 200){
            fire(1);
        }else{
            fire(.5);
        }
    }
    //modeled after Fire and Crazy Robot
    public void onHitByBullet(HitByBulletEvent e) {
		turnLeft(90 - (getHeading() - e.getHeading()));
		ahead(500);
	}
     //random angled turn picked when robot runs into wall- does not help robot so it's been scrapped
    //public void onHitWall(HitWallEvent e) {
            //int angle= randomAngle.nextInt(360);
        //turnLeft(angle);
	//}

}     
    
   
   
        
	




