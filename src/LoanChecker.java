/**
 * 
READ ME FIRST

The code is correct, only the Expected output text
 
Loan Eligibility Checker
	Check if Eligible to get a loan

Requirements:

User Input:

	The program should prompt the user to enter their monthly salary.
	The program should prompt the user to enter their credit score.
	The program should prompt the user to enter their total existing debt.
	The program should prompt the user to enter the desired loan amount.

Eligibility Criteria:

	The user must have a monthly salary of at least $3000.
	The user must have a credit score of 700 or above.
	The total debt, including the requested loan amount, 
        must not exceed 50% of the user’s annual income (i.e., (salary * 12) / 2).
        * 
1  4000    750	5000  20000   "Sorry, you are not eligible for the loan."

* 
*   annual income = (4000 * 12) = 48000
*   Max allowable debt (50%) of 48000 = 24000
*   5000+20000=25000 
* 
Decision Making:

	The program should evaluate the user's input against the eligibility criteria.
	If all criteria are met, the user is eligible for the loan.
	If any criteria are not met, the user is not eligible.

Output:

	Display a message informing the user whether they are eligible for the loan or not.

Error Handling:

	Ensure that all inputs are valid (e.g., numeric values for salary, credit score, debt, and loan amount).
	Handle negative values appropriately, providing feedback to the user.

Test Case	Input:      Input: 	Input:      Input:          Expected Output
        	Monthly     Credit 	Existing    Desired 
		Salary      Score	Debt        Loan Amount

1               4000        750		5000        20000           "Sorry, you are not eligible for the loan."
2		2500        680		3000        10000           "Sorry, you are not eligible for the loan."
3		3500        700		20000       15000           "Sorry, you are not eligible for the loan."
4		4500        720		10000       15000           "Congratulations! You are eligible for the loan."
5		3000        700		0           1000            "Congratulations! You are eligible for the loan."
6		2900        710		1000        5000            "Sorry, you are not eligible for the loan."
7		5000        650		2000        10000           "Sorry, you are not eligible for the loan."
8		6000        800		0           50000           "Congratulations! You are eligible for the loan."
9		3500        700		30000       5000            "Sorry, you are not eligible for the loan."
10		3200        710		500         1000            "Congratulations! You are eligible for the loan."
* 

 * @author hadjitejuco
 */
import java.util.Scanner;

public class LoanChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variables
        double salary;
        int creditScore;
        double existingDebt;
        double loanAmount;
        boolean isEligible;
        String resultMessage;
        
        System.out.println("Welcome to hjt Loan Eligibility Checker App...");
        System.out.print("Enter their monthly salary: ");
        salary = scanner.nextDouble();
        System.out.print("Enter their credit score: ");
        creditScore = scanner.nextInt();
        System.out.print("Enter their total existing debt: ");
        existingDebt = scanner.nextDouble();
        System.out.print("Enter the desired loan amount: ");
        loanAmount = scanner.nextDouble();
        
        if (salary >= 3000 && creditScore >= 700 && (existingDebt+loanAmount) <= (salary * 12) / 2){
            isEligible = true;
        }else{
            isEligible = false;
        }
               
        //result
        
        resultMessage = isEligible ? "Congratulations! You are eligible for the loan." : "Sorry, you are not eligible for the loan.";
        System.out.println(resultMessage);
        
        scanner.close();
    }
}
