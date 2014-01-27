import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String inputString = "0:30 AM 12:59 PM";// scan.nextLine();
    	String[] inputStringArray = inputString.split(" ");
    	String[] enteringString = inputStringArray[0].split(":");
    	String[] leavingString = inputStringArray[2].split(":");
    	
    	int enteringTime = timeOf(inputStringArray[1], enteringString[0], enteringString[1]);
    	int leavingTime = timeOf(inputStringArray[3], leavingString[0], leavingString[1]);
    	int price = determinePrice(enteringTime, leavingTime);
    	String priceString = formatPrice(price);

    	System.out.println(enteringTime);
    	System.out.println(leavingTime);
    	System.out.println(priceString);
    	
    	scan.close();
    }

	private static String formatPrice(int price) {
		String priceString = Integer.toString(price);
		int priceLength = priceString.length();
		String newStringDollars = priceString.substring(0, priceLength - 2);
		String newStringCents = priceString.substring(priceLength - 2, priceLength);
		return "$"+newStringDollars+":"+newStringCents;
	}

	private static int determinePrice(int enteringTime, int leavingTime) {
		return 3150;
	}

	private static int timeOf(String enteringString, String incomingHours, String incomingMinutes) {
		int timeMinutes = Integer.parseInt(incomingMinutes);
		int timeHours = Integer.parseInt(incomingHours);
		if (enteringString.equals("PM")){
			timeHours+= 12;
			timeHours%=24;
		}
		timeMinutes+= 60*timeHours;
		return timeMinutes;
	}
}