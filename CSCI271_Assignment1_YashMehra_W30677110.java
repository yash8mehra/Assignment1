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

public class CSCI271_Assignment1_YashMehra_W30677110 {
    public static void main(String[] args){

        //making all the variables
        double FINAL_GRADE = 0.0; //G, The final grade
        double ASSIGNMENT_AVERAGE = 0.0; // A, the assignment test score average
        double CLASS_TEST_AVERAGE = 0.0; // T, in class test score average
        double MIDTERM_GRADE = 0.0; // M, midterm grade
        double FINAL_EXAM_GRADE = 0.0; // F, Final exam grade
        double TEST_AVERAGES = 0.0; // E, How well you did on your midterm, final, and in class tests
        double ASSIGNMENT_WEIGHT = 0.0; // W, Assignment weights
        final int NUM_ASSIGNMENTS = 7; // 7 assignemnts for averaging
        final int NUM_TESTS = 7; //7 in class tests
        double ASSIGNMENT_TOTAL = 0.0; // adding up all the assignment scores for averaging
        double TEST_TOTAL = 0.0; //adding up all the test scores for averaging
        double ASSIGNMENT_GRADE = 0.0; // used for adding up into assignment total
        double TEST_GRADE = 0.0; // used for adding up into test total


        //I will now read in values for assignment averages
        Scanner scanner = new Scanner(System.in);//scanner to input values



        System.out.println("Enter 7 assignment scores or 0 if u don't have any left");
        for (int i = 0; i < NUM_ASSIGNMENTS; i++){
            ASSIGNMENT_GRADE = scanner.nextDouble(); //reads the next grade entered
            ASSIGNMENT_TOTAL += ASSIGNMENT_GRADE;
            System.out.printf("Your ASSIGNMENT_TOTAL is: %.2f%n", ASSIGNMENT_TOTAL);
        }
        ASSIGNMENT_AVERAGE = ASSIGNMENT_TOTAL / NUM_ASSIGNMENTS; //divides total grade by 7
        System.out.printf("Your ASSIGNMENT_AVERAGE grade is: %.2f%n" , ASSIGNMENT_AVERAGE);


        System.out.println("Enter 7 test scores or 0 if you don't have any left");
        for (int j = 0; j < NUM_TESTS; j++){
            TEST_GRADE = scanner.nextDouble();
            TEST_TOTAL += TEST_GRADE;
            System.out.printf("Your TEST_TOTAL is %.2f%n", TEST_TOTAL);
        }
        CLASS_TEST_AVERAGE = TEST_TOTAL / NUM_TESTS; // divides total test grades by 7
        System.out.printf("Your CLASS_TEST_AVERAGE test score average grade is: %.2f%n" , CLASS_TEST_AVERAGE);


        //get Midterm grade
        System.out.println("Enter your midterm grade");
        MIDTERM_GRADE = scanner.nextInt();


       //get Final exam grade
        System.out.println("Enter your final exam grade");
        FINAL_EXAM_GRADE = scanner.nextInt();


	//calculates test average
        TEST_AVERAGES = ((0.4 * FINAL_EXAM_GRADE) + (0.2 * MIDTERM_GRADE) + (0.1 * CLASS_TEST_AVERAGE)) / 0.7;
        //in the line above, 0.4, 0.2, and 0.1 are assignment weights while 0.7 is used to bring the number up to a proper percent value

        ASSIGNMENT_WEIGHT = ((TEST_AVERAGES - 60) / 20) * (0.3); // W value / formula for how much the assignments weigh
        System.out.printf("Your TEST_AVERAGES were: %.2f%n", TEST_AVERAGES, ". and your ASSIGNMENT_WEIGHT is: %.2f%n", ASSIGNMENT_WEIGHT);




        //next thing to do now is to move some of these blocks under the if blocks below
        //if E is below 60, only calculate FINAL_EXAM_GRADE, MIDTERM_GRADE, CLASS_TEST_AVERAGE, assignments wont count
        //elif E is between 60 and 80(not included), do all the above plus ASSIGNMENT_WEIGHT (only used here) and ASSIGNMENT_AVERAGE
        

        if (TEST_AVERAGES < 60) {
            FINAL_GRADE = TEST_AVERAGES;
        } else if ((60 <= TEST_AVERAGES) && (TEST_AVERAGES < 80)) {
            FINAL_GRADE = ((1 - ASSIGNMENT_WEIGHT) * TEST_AVERAGES) + (ASSIGNMENT_WEIGHT * ASSIGNMENT_AVERAGE);
        } else { //If the test averages is 80 or above
            FINAL_GRADE = (0.4 * FINAL_EXAM_GRADE) + (0.2 * MIDTERM_GRADE) + (0.1 * CLASS_TEST_AVERAGE) + (0.3 * ASSIGNMENT_AVERAGE);
        }
        System.out.printf("Your final grade is: %.2f%n", FINAL_GRADE);






    scanner.close(); //closing scanner because inputs are no longer required
    }
}




