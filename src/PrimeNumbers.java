//WAP to print the prime numbers by user input
import java.util.Scanner;
class PrimeNumbers{


		public static void main(String[] args){


			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			int count=0;
			for(int i=1;i<=n;i++){
				count=0;
				for(int j=1;j<=i;j++){
					if(i%j==0){
						count++;
					}
				}
				if(count==2){
					System.out.println(i);
				}
			}

		}