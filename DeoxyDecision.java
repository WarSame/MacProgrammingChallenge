import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String entryString = scan.nextLine();
    	String[] entryStringArray = entryString.split(" ");
    	int sequences = Integer.parseInt(entryStringArray[0]);
    	int maxLength = Integer.parseInt(entryStringArray[0]);
    	int currentLength = maxLength;
    	int shortestLength = 0;
    	String[] sequenceArray = new String[sequences];
    	int[] sequenceBenefit = new int[sequences];
    	int[] sequenceLength = new int[sequences];
    	int[] selectedSequences;
    	double[] sequenceBenefitDensity = new double[sequences];
    	for (int i =0; i<sequences; i++){
    		sequenceArray[i] = scan.nextLine();
    		String[] sequence = sequenceArray[i].split(" ");
    		sequenceBenefit[i] = Integer.parseInt(sequence[0]);
    		sequenceLength[i] = Integer.parseInt(sequence[1]);
    		sequenceBenefitDensity[i] = (double)(sequenceBenefit[i])/sequenceLength[i];
    		if (sequenceLength >= Collections.min(sequenceLength))
    	}
    	while (currentLength > sequenceLength.min()+1){
    		
    	}
    	scan.close();
    }
}