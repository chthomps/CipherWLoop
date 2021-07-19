
import java.util.Scanner;
import java.util.Random;


public class CipherwLoop {

	public static void main(String[] args) {
		
		Random generator = new Random();
		int key = generator.nextInt(10);
		int []data = new int[3]; //settting array for user value inputs
		int sum, tens, ones, tensCoded, onesCoded;
					
		System.out.println("enter 3 numbers between 0 and 19");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1st number: ");
		data[0] = scan.nextInt();
		System.out.println("2nd number: ");
		data[1] = scan.nextInt();
		System.out.println("3rd number: ");
		data[2] = scan.nextInt();
	
		for(int i =0; i <3; i++);	
			if (data[i]<0|| data[i]>19)
			{
				System.out.println("Read directions and try again");
				System.exit(0);
			}
			else
				
				//compute the sum
				sum= (data[0]+data[1]+data[2]);
					System.out.println("Total= "+sum);
				
				//print generated random key
					System.out.println("Your random key is: "+ key);
				
				//encoded number broken down by tens and ones
				tens = (sum/10);
				ones = (sum%10);
				 
				tensCoded =(tens+key)%10;
				onesCoded =(ones+key)%10;
				
					System.out.println("Your encoded number is: " +tensCoded+onesCoded);
		
		
		
	}

}
