//Special Numbers
//Given a number “n”, find if sum of its digits powered with their respective positions is equal to the number itself.
//Examples: 
//
//Input   : n = 135
//1^1 + 3^2 + 5^3 = 135
//
//Input   : n = 89
//8^1+9^2 = 89
//
//Input   : n = 80
//8^1 + 0^2 = 8
//Display all such special numbers between 1 to 10,000.
//
//Display out of these special numbers how many are 2 digit, 3 digit and 4 digit numbers between 1 to 10,000. 
//
//Display the total count of such special numbers.

public class SpecialNumbers {
	
    public static void main(String[] args) {
    	
    	int remainder, number, count, num, cnt, total = 0, doubleDigit=0, tripleDigit = 0, fourDigit = 0 ;
		double sum;
    	int tempArray[] = new int[5];
    	
    	System.out.println(" The special numbers are: \n");
    	for(int a = 10; a < 10000; a++) {
    		count = 0; num = 0; sum = 0; cnt = 1;
    		
    		number = a; 
    		while(number > 0) {
    			remainder = number % 10;
    			number = number / 10;
    			tempArray[count] = remainder;
    			count++;  			
    		}
    		
    		for (int b = count - 1; b >= 0; b--) {
    			
    			num = tempArray[b];
    			sum = sum + (Math.pow(num, cnt)) ; 
    			cnt++;
    		}
    		if(sum == a) {
    			System.out.print(" "+ a + "  ");
    			total++;
    			
    			if(count == 2) {
        			doubleDigit++;
        		}
        		else if(count == 3) {
        			tripleDigit++;
        		}
        		else if(count == 4) {
        			fourDigit++;
        		}
    		}
    		
    	}
    	
    	System.out.println("\n\n The total number of such special numbers present between 1 & 10000 : "+ total);
    	System.out.println("\n The count of 2 digit numbers present in it : "+ doubleDigit);
    	System.out.println("\n The count of 3 digit numbers present in it : "+ tripleDigit);
    	System.out.println("\n The count of 4 digit numbers present in it : "+ fourDigit);
    }
}
