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





public class GradingScheme {
    public static void main(String[] args){
        System.out.println("hi");


        //making all the variables
        float FINAL_GRADE = 0.0; //G, The final grade
        float ASSIGNMENT_AVERAGE = 0.0; // A, the assignment test score average
        float CLASS_TEST_AVERAGE = 0.0; // T, in class test score average
        float MIDTERM_GRADE = 0.0; // M, midterm grade
        float FINAL_EXAM_GRADE = 0.0; // F, Final exam grade
        float TEST_AVERAGES = 0.0; // E, How well you did on your midterm, final, and in class tests
        float ASSIGNMENT_WEIGHT = 0.0; // W, Assignment weights


	//calcualtes test average
        TEST_AVERAGES = ((0.4 * FINAL_EXAM_GRADE) + (0.2 * MIDTERM_GRADE) + (0.1 * CLASS_TEST_AVERAGE)) / 0.7;
        ASSIGNMENT_WEIGHT = ((TEST_AVERAGES - 60) / 20) * (0.3);


        if (TEST_AVERAGES < 60) {
            FINAL_GRADE = TEST_AVERAGES;
        } else if ((60 <= TEST_AVERAGES) && (TEST_AVERAGES < 80)) {
            FINAL_GRADE = ((1 - ASSIGNMENT_WEIGHT) * TEST_AVERAGES) + (ASSIGNMENT_WEIGHT * ASSIGNMENT_AVERAGE);
        } else { //If the test averages is 80 or above
            FINAL_GRADE = (0.4 * FINAL_EXAM_GRADE) + (0.2 * MIDTERM_GRADE) + (0.1 * CLASS_TEST_AVERAGE) + (0.3 * ASSIGNMENT_AVERAGE);
        }








    }
}




