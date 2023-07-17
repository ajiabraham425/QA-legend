package com.Demo_Project.Utilities;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableUtilities {
	
	public static boolean checkTableElement(List<WebElement> rowItems, List<WebElement> columnItems, String checkText,String tagName) {
		boolean checkTableElement = false;
		for (int i = 0; i < rowItems.size(); i++) {
			List<WebElement> currentRow = rowItems.get(i).findElements(By.tagName(tagName));
			for (int j = 0; j < columnItems.size(); j++) {
				String tableText = currentRow.get(j).getText();
				if (tableText.equals(checkText)) {
					checkTableElement = true;
					break;
					
					
				}
				System.out.println(checkTableElement);
			}
			

		}
		return checkTableElement;
	}

}
