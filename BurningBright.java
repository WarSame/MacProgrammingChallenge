import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String inputString = scanner.nextLine();
		String[] inputStringArray = inputString.split(" ");
		int subLength = 4;
		int lightsLength = inputStringArray[1].length();
		String lightsInput = inputStringArray[1];
		int lightsMissing = lightsLength;
		
		for (int i = 0; i <= lightsLength - subLength; i++) {
			int missing = countMatches(lightsInput.substring(i, i+subLength), "0");
			if (missing < lightsMissing){
				lightsMissing = missing;
			}
		}
		System.out.println(lightsMissing);
		scanner.close();
	}
	private static int countMatches(String entireString, String subString) {
		int entireStringLength = entireString.length();
		int matches = 0;
		
		for (int i = 0; i<entireStringLength; i++){
			if (Character.toString(entireString.charAt(i)).equals(subString)){
				matches++;
			}
		}
		return matches;
	}
}
