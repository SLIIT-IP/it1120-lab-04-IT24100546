import java.util.Scanner;

	public class IT24100546Lab4Q3{
		public static void main(String[] args){

		Scanner x=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=x.nextInt();

		String message=(number>0) ? "The number is Positive!":
		(number<0)?
		"The number is negative!":
		"The number is zero";

		System.out.println(message);
}

}


