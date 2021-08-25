package com.StepDefination;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	@DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
		
		Object[][] obj = new Object[3][1];
		obj[0][0]="Rutuja";
		obj[1][0]="Thakre";
		obj[2][0]="ok";
		
		return obj;
	}
	@org.testng.annotations.Test(dataProvider = "data-provider")
	public void myTest (String a) {
		System.out.println(a);
	}
}
	