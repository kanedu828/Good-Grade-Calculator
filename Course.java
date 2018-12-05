/*--------------------------------------------------------
*Course.java
*Represents the entire coure, such as "CSCI 1301".
*Holds each section and calculates the grade of the entire
*course.
*--------------------------------------------------------*/
public class Course{
    private Section[] course;

    public Course(){
        course = new Section[0];
    }

    public void setCourse(Section[] course){
        int count = 0;
        int index = 0;
        for(Section k: course){
            count++;
        }
        this.course = new Section[count];
        for(Section k: course){
            this.course[index] = k;
            index++;
        }
    }
    
    public Section[] getCourse(){
        Section[] courseCopy;
        int count = 0;
        int index = 0;
        for(Section k: course){
            count++;
        }
        courseCopy = new Section[count];
        for(Section k: course){
            courseCopy[index] = k;
            index++;
        }

        return courseCopy;
    }
    //-----------------------------------------------------
    //average()- calculates the weighted average of all the 
    //sections.
    //-----------------------------------------------------
    public double average(){
        double average = 0;
        for(Section k: course){
            average = average + k.getWeight() * k.average();
        }
        return average;
    }
}