package com.Demo_Project.Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUploadUtility {

	/*	public static void uploadFileWithRobot(String imagePath){
			
			
			
			StringSelection stringSelection=new StringSelection(imagePath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			
			Robot r =new Robot();  //is in awt package
			r.delay(2000);
			
			//press ctrl v or paste
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			//Releasing Key
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			//press enter
			r.keyPress(KeyEvent.VK_ENTER);
			//release enter
			r.keyRelease(KeyEvent.VK_ENTER);		

		}

	}  */

public static void uploadFileWithRobot (String imagePath) {
    StringSelection stringSelection = new StringSelection(imagePath);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    Robot robot = null;
    try {
        robot = new Robot();
    } catch (AWTException e) {
        e.printStackTrace();
    }
    robot.delay(2500);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.delay(150);
    robot.keyRelease(KeyEvent.VK_ENTER);
}
}
