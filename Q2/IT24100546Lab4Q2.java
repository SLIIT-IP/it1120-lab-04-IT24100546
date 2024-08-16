import java.util.Scanner;

public class IT24100546Lab4Q2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
       
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = x.nextDouble();
        
        
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }
        
        
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = x.nextDouble();
        
       
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }
        
       
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = x.nextDouble();
        
        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = x.nextDouble();
        
       
        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentage must add up to 100. Terminating program.");
            return;
        }
        
       
        double finalMark = (examMarks * (examPercentage / 100.0)) + (labMarks * (labPercentage / 100.0));

	System.out.println();
        
        System.out.println("Final Exam Mark is: "+ finalMark);
    }
}
