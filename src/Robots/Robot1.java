package Robots;

import becker.robots.*;

/**
 *
 * @author Jhon
 */
public class Robot1 extends Thread{
    
    private Robot robot;
    private City city;

    public Robot1(Robot robot, City city) {
        this.robot = robot;
        this.city = city;
    }

    @Override
    public void run() {
        while(robot.frontIsClear()){
            for (int i = 0; i < 10; i++) {
                robot.move();
            }
        }
    }
}
