package classANDoop;

import java.util.Scanner;

public class ExactChange {
	public static void main(String[] args) {
		System.out.println("Enter the value to get the change in Dollars, Quarters, Dime and Nickel");
		Scanner scnr = new Scanner(System.in);
		int userTotal = scnr.nextInt();
		if (userTotal==0) {
			System.out.println( "no change");
		}else {
		int [] coinVals = new int[5];
		System.out.println(exactChange(userTotal, coinVals));
		}//else
	}//main
public static String exactChange(int userTotal, int [] coinVal) {
	
	int dollar = userTotal / 100;
	int quarter = (userTotal % 100) / 25;
	int dime = ((userTotal % 100) % 25) / 10;
	int nickel = (((userTotal % 100) % 25) % 10) / 5;
	int penny = ((((userTotal % 100) % 25) % 10) % 5) / 1;
	int [] coinVals = {dollar, quarter, dime, nickel, penny};
	for (int i = 0;i<coinVals.length;i++) {
		coinVal[i]=coinVals[i];
	}
	coinVal = coinVals;		
	String y = "";
	String [] name = {"dollar","quarter","dime","nickel","penny"};
	String [] names = {"dollars","quarters","dimes","nickels","pennies"};
	for (int i = 0; i<coinVal.length;i++) {
		if (coinVal[i]==0) {
			continue;
		}if (coinVal[i]>1) {
			if(i==4){
			y = y + coinVal[i] + " "+ names[i];
			}else {
			y = y + coinVal[i] + " "+ names[i]+"\n";}
		}else {
			if(i==4){
				y = y + coinVal[i] + " "+ name[i];
				} else {
			y = y + coinVal[i] + " "+ name[i]+"\n";}
		}
	}
	return y;
}
}//class
