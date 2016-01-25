import java.util.Scanner;

public class GPACalc {

    public static void main(String[] args) {
    System.out.println("Enter your number of A credit hours: ");
	Scanner scanner = new Scanner(System.in);
	int numACreditHours = scanner.nextInt();

	System.out.println("Enter your number of B credit hours:");
	int numBCreditHours = scanner.nextInt();

	System.out.println("Enter your number of C credit hours:");
	int numCCreditHours = scanner.nextInt();

	System.out.println("Enter your number of D credit hours:");
	int numDCreditHours = scanner.nextInt();

	System.out.println("Enter your number of F credit hours:");
	int numFCreditHours = scanner.nextInt();

	double abGPA = 4.0 * numACreditHours + 3.0 * numBCreditHours;
	double cdGPA = 2.0 * numCCreditHours + 1.0 * numDCreditHours;
	double fGPA = 0.0 * numFCreditHours;
	double gpa = abGPA + cdGPA + fGPA;
	double sumOfGPA = numACreditHours + numBCreditHours;
	double sumOfGPA2 = numCCreditHours + numDCreditHours;
	double sumOfGPA3 = sumOfGPA + sumOfGPA2 + numFCreditHours;
	double gpaVal = Math.round((gpa / sumOfGPA3) * 100) / 100.0;

	System.out.println("A Credit Hours: " + numACreditHours);
	System.out.println("B Credit Hours: " + numBCreditHours);
	System.out.println("C Credit Hours: " + numCCreditHours);
	System.out.println("D Credit Hours: " + numDCreditHours);
	System.out.println("F Credit Hours: " + numFCreditHours);
	System.out.println("GPA: " + gpaVal);
    }
}