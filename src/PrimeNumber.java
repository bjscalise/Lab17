import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber{

	
	public static int findPrime(int n) {
		int count = 0;
		int num = 1;
		int i = 0;
		
		while (count< n) {
		num++;
		for (i = 2; i <= num; i++) {
			if (num % i == 0) {
				break;
			} 
			
		}
		if (i == num)
			count++;
			
		} 
			
		return num;
}
}
//	public static int findPrime(int valueIndex)	{
//		int n = 0;
//		
//		for (int i = 0; i < valueIndex; i++) {
//			n++;
//			while(!isPrime(n)) {
//				n++;
//			}
//		valueIndex = n;
//		}
//		return valueIndex;
//	}
//	
//	public static boolean isPrime(int n) {
//		    for(int i = 2; 2 * i < n; i++) {
//		        if(n % i == 0)
//		            return false;
//		    }
//		    return true;
//		}
//	}
//		
		
		
//	public static int findPrime(int ) {
//	
//	int max = 100;
//	
//	
//	for(int i = 2; i < max; i++) {
//		boolean isPrime = true;
//		for(int j = 2; j < i; j++) {
//			if (i % j == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//		if (isPrime) {
//			System.out.println(i + " prime");
//			primeArr.add(i);
//			f
		
