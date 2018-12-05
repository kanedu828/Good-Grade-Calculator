/******************************************************************
*Good Grade Calculator
*
*CalculateGrade.java - Main method to execute the grade calculator
*
*This program allows user to calculate their grade for their specfic
*class. It accounts for the weight and grade of each section.
*
*Last edited: 12/5/2018
*
*Version: 1.0.0
*
*By: Kane Du
*
*******************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;
public class CalculateGrade{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        
        System.out.println("How many sections do you have?");
        int sectionAmount = input.nextInt(); //Helps set the amount of sections in the course.
        Section[] course = new Section[sectionAmount]; //Array for all the sections in course.

        Course userCourse = new Course(); //The course the user is calculating for.

        //Each index of course is set to a new section.
        for(int courseIndex = 0; courseIndex < sectionAmount; courseIndex++){
            Section section = new Section();//Section that is remade every loop. This is so it can be set to the next index of course[]

            System.out.println("-----------Section " + (courseIndex + 1) + ":-----------");

            System.out.println("What is the weight in decimal?");
            //Checks for invalid input
            boolean pass = false;
            double weight = 0;
            while(pass == false){
                weight = input.nextDouble(); //Determines the weight for the section
                if(weight >=0 && weight <=1){
                    pass = true;
                }
                else{
                    System.out.println("The weight is invalid. Please try again. (The weight is in decimal format, it can not be great than 1 or negative.");
                }
            }
            section.setWeight(weight);
            

            System.out.println("How many grades do you have?");
            int gradesAmount = input.nextInt(); //Sets the amount of grades in a section,
            double[] grades = new double[gradesAmount];

            //Sets each index of grades[] to a user inputted int.
            for(int gradesIndex = 0; gradesIndex<gradesAmount; gradesIndex++){
                System.out.println("Grade " + (gradesIndex + 1) + ":");
                double grade = input.nextDouble();
                grades[gradesIndex] = grade;
            }
            section.setGrades(grades); //Sets the grades
            course[courseIndex] = section; //Each index of course is set to this new section
        }
        userCourse.setCourse(course); //Sets the course

        System.out.println("Your average for the course is: " + df.format(userCourse.average())); //Calculates average of course
        
        
    }
}