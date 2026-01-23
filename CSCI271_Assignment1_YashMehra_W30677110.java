/*************************************************************************
* Project 1 for CSCI 271-001 Spring 2026
*
* Author: Yash Mehra
* OS: Ubuntu Debian Linux 21.1
* Compiler: javac 25.0.1
* Date: January 21, 2026
*
* Purpose
* This program reads a list of scores from an input file, counts how many
* scores there are in the list, and computes their sum and average.
*
*************************************************************************/
/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* <Yash Mehra>
* <W30677110>
********************************************************************/

//CamelCase for classes and interfaces
//camelCase for methods and variables
//THIS_THING for constants



import java.util.Scanner; //for reading in values



/***************************************************************
* Class: CSCI271_Assignment1_YashMehra_W30677110
*
* Purpose:
*   Finds the final grade based on
*   assignment and test average grades, midterm grade, and
*   final exam grade using the formula provided in the syllabus.
***************************************************************/

public class CSCI271_Assignment1_YashMehra_W30677110 {

/*****************************<main>****************************
* Description: calculate the final grade using the other grade inputs
*
* Parameters: String[] args
*
* Pre: User must enter in valid numbers when asked
*
* Post: Prints the final grade after calculating using the input
*
* Returns: No return
*
* Called by: JVM
* Calls: scanner
************************************************************************/
    public static void main(String[] args){


        //making all the variables
        String name = ""; // Name of the user
        double finalGrade = 0.0; //G, The final grade
        double assignmentAverage = 0.0; // A, the assignment test score average
        double classTestAverage = 0.0; // T, in class test score average
        double midtermGrade = 0.0; // M, midterm grade
        double finalExamGrade = 0.0; // F, Final exam grade
        double testAverages = 0.0; // E, How well you did on your midterm, final, and in class tests
        double assignmentWeight = 0.0; // W, Assignment weights
        final int NUM_ASSIGNMENTS = 7; // 7 assignemnts for averaging
        final int NUM_TESTS = 7; //7 in class tests
        double assignmentTotal = 0.0; // adding up all the assignment scores for averaging
        double testTotal = 0.0; //adding up all the test scores for averaging
        double assignmentGrade = 0.0; // used for adding up into assignment total
        double testGrade = 0.0; // used for adding up into test total


        //I will now read in values for assignment averages
        Scanner scanner = new Scanner(System.in);//scanner to input values


        System.out.println("Hi!! What is your name?");
        name = scanner.nextLine(); //takes in the name
        


        System.out.println("Enter 7 assignment scores");
        //This for loop is used for adding up all of the assignment grades and then later that number is used to find the average
        for (int i = 0; i < NUM_ASSIGNMENTS; i++){
            assignmentGrade = scanner.nextDouble(); //reads the next grade entered
            assignmentTotal += assignmentGrade;
        }
        assignmentAverage = assignmentTotal / NUM_ASSIGNMENTS; //divides total grade by 7


        System.out.println("Enter 7 test scores");

        //This for loop is used for adding up all the test grades entered in and then later that number is used to find the average
        for (int j = 0; j < NUM_TESTS; j++){
            testGrade = scanner.nextDouble();
            testTotal += testGrade;
        }
        classTestAverage = testTotal / NUM_TESTS; // divides total test grades by 7

        //get Midterm grade
        System.out.println("Enter your midterm grade");
        midtermGrade = scanner.nextInt(); //takes in the midterm grade


       //get Final exam grade
        System.out.println("Enter your final exam grade");
        finalExamGrade = scanner.nextInt(); //takes in the final exam grade


	//calculates test average
        testAverages = ((0.4 * finalExamGrade) + (0.2 * midtermGrade) + (0.1 * classTestAverage)) / 0.7;
        //in the line above, 0.4, 0.2, and 0.1 are assignment weights while 0.7 is used to bring the number up to a proper percent value

        assignmentWeight = ((testAverages - 60) / 20) * (0.3); // W value / formula for how much the assignments weigh



        //this will calculate your grade if your test averages were under 60
        if (testAverages < 60) {
            finalGrade = testAverages;
        } else if ((60 <= testAverages) && (testAverages < 80)) { //this will calcualte your grade if your test averages were 60 or over but less than 80
            finalGrade = ((1 - assignmentWeight) * testAverages) + (assignmentWeight * assignmentAverage);
        } else { //If the test averages is 80 or above
            finalGrade = (0.4 * finalExamGrade) + (0.2 * midtermGrade) + (0.1 * classTestAverage) + (0.3 * assignmentAverage);
        }
        System.out.printf("%s, your final grade is: %.2f%n", name, finalGrade); // Prints the output to terminal





    scanner.close(); //closing scanner because inputs are no longer required
    }
}




