import java.util.Scanner;
	public class IT24100546Lab4Q1{
		public static void main(String[] args){

		Scanner x =new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number1 = x.nextInt();

		if(number1>0){
			System.out.println("The number is: positive");


			}
		
		else if(number1<0){
			
			System.out.println("The number is: negative");

				}

		else{
			System.out.println("The number is zero");


				}
		
		
	}
}



