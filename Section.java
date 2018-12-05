/*--------------------------------------------------------
*Section.java
*Represents each "category" in a class, such as "tests",
*"attendence", "quizes", etc.
*Holds the weight of each section as well as the average.
*
*--------------------------------------------------------*/
public class Section{
    private double weight; //The weight of the section
    private double[] grades; //All grades in the section

    public Section(){
        weight = 0;
        grades = new double[0];
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setGrades(double[] grades){
        int count = 0;
        int index = 0;
        for(double k: grades){
            count++;
        }
        this.grades = new double[count];
        for(double k: grades){
            this.grades[index] = k;
            index++;
        }
    }

    public double getWeight(){
        return weight;
    }

    public double[] getGrades(){
        double[] gradesCopy;
        int count = 0;
        int index = 0;
        for(double k: grades){
            count++;
        }
        gradesCopy = new double[count];
        for(double k: grades){
            gradesCopy[index] = k;
            index++;
        }

        return gradesCopy;
    }

    //----------------------------------
    //average()- calculates average of 
    //all grades in the section
    //----------------------------------
    public double average(){
        double sum = 0;
        int count = 0;
        for(Double k: grades){
            sum = sum + k;
            count++;
        }
        return sum/count;

    }

}