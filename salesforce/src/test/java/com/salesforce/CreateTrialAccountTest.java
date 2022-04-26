package com.salesforce;

import java.util.ArrayList;

import org.testng.annotations.Test;

import salesforce.base.ExcelReader;
import salesforce.base.Keywords;

public class CreateTrialAccountTest {
	@Test
	public void loginTest() throws Throwable {
		// open open
		ArrayList data = ExcelReader.getData("F:\\CreateTrialAccountTest.xlsx");
		Keywords key = new Keywords();
		for (int i = 0; i < data.size(); i++) {
			// System.out.println(data.get(i));
			if (data.get(i).equals("open")) {
				System.out.println(data.get(i));
				key.open();
			}
			if (data.get(i).equals("url")) {
				String httpUrl=data.get(i+1).toString();
				

				key.url(httpUrl);
			}
			if (data.get(i).equals("input")) {
				String testData=data.get(i+1).toString();
				String objectName=data.get(i+2).toString();
				key.input(testData,objectName);
			}
			if (data.get(i).equals("button")) {
				String ClickOn=data.get(i+2).toString();
				

				key.button(ClickOn);

		}
			if (data.get(i).equals("button")) {
				String ClickOn=data.get(i+2).toString();
				

				key.button(ClickOn);

	}
}}}
