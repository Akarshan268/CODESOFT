import java.util.Scanner;
public class MarksCalculator
{
	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);
	System.out.print("Enter number of subjects: ");
	int numSubjects = scanner.nextInt();
	int[] marks=new int[numSubjects];
	int totalMarks = 0;
	
	//input marks for each subjects
	for(int i=0;i<numSubjects;i++)
	{
		System.out.print("Enter marks for subject "+(i+1) + " (out of 100): ");
		marks[i]=scanner.nextInt();
		totalMarks += marks[i];
	}
	
	//Calculate average percentage
	double average=(double)totalMarks/numSubjects;
	
	String grade;
	if(average>=90)
	{
		grade = "A+";
	}
	else if(average>=80)
	{
		grade = "A";
	}
	else if(average>70)
	{
		grade = "B";
	}
	else if(average>=60)
	{
		grade = "C";
	}
	else if(average>=50)
	{
		grade = "D";
	}
	else
	{
		grade = "F";
	}
	
	//Display Result
	System.out.println("\n--- Result ---");
	System.out.println("Total Marks: " + totalMarks);
	System.out.println("Average Percentage: " + average + "%");
	System.out.println("Grade: " + grade);
	scanner.close();
	}
}