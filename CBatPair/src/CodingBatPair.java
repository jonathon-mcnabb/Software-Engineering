//Authors: Carter Pasqualini, Jonathon McNabb

import java.util.Arrays;
public class CodingBatPair {
	
	
	//evenlySpaced exercise
	public static boolean evenlySpaced(int a, int b, int c) {
		  int[] sorted = new int[3];
		 
		  sorted[0] = a;
		  sorted[1] = b;
		  sorted[2] = c;
		 
		 Arrays.sort(sorted);
		 
		 return Math.abs(sorted[1] - sorted[0]) == Math.abs(sorted[2] - sorted[1]);
		}
	
	/*
	Expected Results	
	evenlySpaced(2, 4, 6) → true	true	OK	
	evenlySpaced(4, 6, 2) → true	true	OK	
	evenlySpaced(4, 6, 3) → false	false	OK	
	evenlySpaced(6, 2, 4) → true	true	OK	
	evenlySpaced(6, 2, 8) → false	false	OK	
	evenlySpaced(2, 2, 2) → true	true	OK	
	evenlySpaced(2, 2, 3) → false	false	OK	
	evenlySpaced(9, 10, 11) → true	true	OK	
	evenlySpaced(10, 9, 11) → true	true	OK	
	evenlySpaced(10, 9, 9) → false	false	OK	
	evenlySpaced(2, 4, 4) → false	false	OK	
	evenlySpaced(2, 2, 4) → false	false	OK	
	evenlySpaced(3, 6, 12) → false	false	OK	
	evenlySpaced(12, 3, 6) → false	false	OK
	 */
		
	//plusOut exercise
	public static String plusOut(String str, String word) {
		  
		  String inputCopy = "";
		  int originalWordLength = str.length();
		  
		  while(inputCopy.length() < originalWordLength){
		    int foundWordIndex = str.indexOf(word);
		    
		    if(foundWordIndex >= 0){
		      int count = 0;
		      
		      for(int i = 0; i < foundWordIndex; i++){
		        inputCopy += "+";
		      }
		      
		      inputCopy += word;
		      
		      str = str.substring(foundWordIndex + word.length());
		    }
		    
		    else{
		      for(int i = 0; i < str.length(); i++){
		        inputCopy += "+";
		      }
		    }
		  }
		  
		  return inputCopy;
		  
		}
	
	/*
	Expected Results	
	plusOut("12xy34", "xy") → "++xy++"	"++xy++"	OK	
	plusOut("12xy34", "1") → "1+++++"	"1+++++"	OK	
	plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"	"++xy++xy+++xy"	OK	
	plusOut("abXYabcXYZ", "ab") → "ab++ab++++"	"ab++ab++++"	OK	
	plusOut("abXYabcXYZ", "abc") → "++++abc+++"	"++++abc+++"	OK	
	plusOut("abXYabcXYZ", "XY") → "++XY+++XY+"	"++XY+++XY+"	OK	
	plusOut("abXYxyzXYZ", "XYZ") → "+++++++XYZ"	"+++++++XYZ"	OK	
	plusOut("--++ab", "++") → "++++++"	"++++++"	OK	
	plusOut("aaxxxxbb", "xx") → "++xxxx++"	"++xxxx++"	OK	
	plusOut("123123", "3") → "++3++3"	"++3++3"	OK
	 */
	
	//countClumps exercise
	public static int countClumps(int[] nums) {
		 if(nums.length == 0) {
		      return 0;
		  }
		  int tempHold = nums[0];
		  int tempCount = 1;
		  int clumpCount = 0;
		  
		  for(int i = 1;i < nums.length; i++) {
		    if(tempHold == nums[i]) {
		      tempCount++;
		      if(i == nums.length - 1) {
		    	  if(tempCount >= 1) {
		    		  clumpCount++;
		    	  }
		      }
		    }
		    else{
		      tempHold = nums[i];
		      if(tempCount > 1) {
		        clumpCount++;
		      }
		      tempCount = 1;
		    }
		  }
		  
		  return clumpCount;
		}
	
	/*
	Expected Results	
	countClumps([1, 2, 2, 3, 4, 4]) → 2	2	OK	
	countClumps([1, 1, 2, 1, 1]) → 2	2	OK	
	countClumps([1, 1, 1, 1, 1]) → 1	1	OK	
	countClumps([1, 2, 3]) → 0	0	OK	
	countClumps([2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4	4	OK	
	countClumps([0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4	4	OK	
	countClumps([0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5	5	OK	
	countClumps([0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5	5	OK	
	countClumps([]) → 0	0	OK
	 */

	//fix34 exercise
	public static int[] fix34(int[] nums) {
		  
		  int[] threePositions = new int[nums.length];
		  int[] fourPositions = new int[nums.length];
		  
		  int threeIndex = 0;
		  int fourIndex = 0;
		  
		  int pairCount = 0;
		  
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 3){
		      threePositions[threeIndex] = i;
		      threeIndex++;
		      pairCount++;
		    }
		    else if(nums[i] == 4){
		      fourPositions[fourIndex] = i;
		      fourIndex++;
		    }
		  }
		  
		  int temp = 0;
		  
		  for(int i = 0; i < pairCount; i++){
		    temp = nums[fourPositions[i]];
		    nums[fourPositions[i]] = nums[threePositions[i] + 1];
		    nums[threePositions[i] + 1] = temp;
		  }
		  
		  return nums;
		  
		}
	
	/*
	Expected Results
	fix34([1, 3, 1, 4]) → [1, 3, 4, 1]	[1, 3, 4, 1]	OK	
	fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]	[1, 3, 4, 1, 1, 3, 4]	OK	
	fix34([3, 2, 2, 4]) → [3, 4, 2, 2]	[3, 4, 2, 2]	OK	
	fix34([3, 2, 3, 2, 4, 4]) → [3, 4, 3, 4, 2, 2]	[3, 4, 3, 4, 2, 2]	OK	
	fix34([2, 3, 2, 3, 2, 4, 4]) → [2, 3, 4, 3, 4, 2, 2]	[2, 3, 4, 3, 4, 2, 2]	OK	
	fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5]) → [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]	[5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]	OK	
	fix34([3, 1, 4]) → [3, 4, 1]	[3, 4, 1]	OK	
	fix34([3, 4, 1]) → [3, 4, 1]	[3, 4, 1]	OK	
	fix34([1, 1, 1]) → [1, 1, 1]	[1, 1, 1]	OK	
	fix34([1]) → [1]	[1]	OK	
	fix34([]) → []	[]	OK	
	fix34([7, 3, 7, 7, 4]) → [7, 3, 4, 7, 7]	[7, 3, 4, 7, 7]	OK	
	fix34([3, 1, 4, 3, 1, 4]) → [3, 4, 1, 3, 4, 1]	[3, 4, 1, 3, 4, 1]	OK	
	fix34([3, 1, 1, 3, 4, 4]) → [3, 4, 1, 3, 4, 1]	[3, 4, 1, 3, 4, 1]	OK
	 */

	
	public static void main(String[] args) {
		
		int numOne = 3;
		int numTwo = 4;
		int numThree = 5;
		
		if(evenlySpaced(numOne,numTwo,numThree)) {
			System.out.println("The numbers " + numOne + ", " + numTwo + ", and " + numThree + " are evenly spaced");
		} else {
			System.out.println("The numbers " + numOne + ", " + numTwo + ", " + numThree + " are not evenly spaced");
		}
		

		
		String convertedPlus = plusOut("12xy34", "xy");
		System.out.println("The converted plus out string is: " + convertedPlus);
		
		int[] clumps = {1, 1, 2, 1, 1};
		int clumpCount = countClumps(clumps);
		
		System.out.println("There are " + clumpCount + " clumps given in the input");
		
		int[] testArray = {1, 3, 1, 4};
		fix34(testArray);
		System.out.println(Arrays.toString(testArray));
		

	}

}
