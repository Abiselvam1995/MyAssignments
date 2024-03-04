package week1.day2;

public class IsPrime {

	public static void main(String[] args)  {  
        //check for every number from 1 to N-1
		int n=10 ;
        for(int i=2; i<=n-1; i++){
            //check if current number is prime
            if(n%i==0) {
                System.out.print( i + " ");
            }
        }
 
    }
}
