package ProgramingAssignment1;
import java.util.Scanner;
public class programingAssignment {
public static void main(String args[]) {
// Questions and answers variables declared here
String question1 = "Q1. What is the meaning of UOPeople? ";
String question2 = "Q2. Who found UOPeople? ";
String question3 = "Q3. Where was UOPeople found? ";
String question4 = "Q4. When was UOPeople Found? ";
String question5 = "Q5. What platform does UOPeople use for Learning? ";
String answer1 = "A";
String answer2 = "A";
String answer3 = "D";
String answer4 = "B";
String answer5 = "C";
//Current mark and percentage of the user before the quize start.
int mark = 0;
int percentages = 100;
//Asking the user for input
Scanner user = new Scanner(System.in);
System.out.println(user);
//String userAnswer1 = user.next();
int n = 5;
// Warning the user to stick with letters
System.out.println("Note: You only have one chance of each input, so make sure you stick with only letters!");
switch(n) {
case 5:
System.out.println(question1);
System.out.println("A. University of the People B. Union Of People C.One People D. People's University");
String userAnswer1 = user.next();
System.out.println(userAnswer1);
if(userAnswer1.equalsIgnoreCase(answer1)) {
mark++;
System.out.println("Score " + mark);
}
else {
System.out.println("Score " + 0);
}
n--;
case 4:
System.out.println(question2);
System.out.println("A. Shai Reshef B. Alhassan Sesay C. Abu Kamara D.Khushboo Sharma");
String userAnswer2 = user.next();
System.out.println(userAnswer2);
if(userAnswer2.equalsIgnoreCase(answer2)) {
mark++;
System.out.println("Score " + mark);
}
else {
System.out.println("Score " + 0);
}
n--;
case 3:
System.out.println(question3);
System.out.println("A. Freetown B. New York C. Conakery D.Califonia");
String userAnswer3 = user.next();
System.out.println(userAnswer3);
if(userAnswer3.equalsIgnoreCase(answer3)) {
mark++;
System.out.println("Score " + mark);
}
else {
System.out.println("Score " + 0);
}
n--;
case 2:
System.out.println(question4);
System.out.println("A. 2008 B. 2009 C. 2015 D. 1996");
String userAnswer4 = user.next();
System.out.println(userAnswer4);
if(userAnswer4.equalsIgnoreCase(answer4)) {
mark++;
System.out.println("Score " + mark);
}
else {
System.out.println("Score " + 0);
}
n--;
case 1:
System.out.println(question5);
System.out.println("A. Classroom B. Intership C. Online D. All");
String userAnswer5 = user.next();
System.out.println(userAnswer5);
if(userAnswer5.equalsIgnoreCase(answer5)) {
mark++;
System.out.println("Score " + mark);
}
else {
System.out.println("Score " + 0);
}
n--;
break;
}
int totalMark = mark;
double percentage = (double) totalMark / 5.0 * 100.0;
System.out.println("Total Mark is " + totalMark);
System.out.println("Your percentage is " + percentage + "%");
}
}
