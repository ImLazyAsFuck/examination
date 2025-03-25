package entity;

import java.util.Scanner;

public class Student{
    private String studentId;
    private String studentName;
    private String studentAge;
    private float averageScore;

    public Student(String studentId, String studentName, String studentAge, float averageScore){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.averageScore = averageScore;
    }

    public Student(){
    }

    public String getStudentId(){
        return studentId;
    }

    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public String getStudentAge(){
        return studentAge;
    }

    public void setStudentAge(String studentAge){
        this.studentAge = studentAge;
    }

    public float getAverageScore(){
        return averageScore;
    }

    public void setAverageScore(float averageScore){
        this.averageScore = averageScore;
    }

    public void inputData(Scanner scanner){
        System.out.print("Enter student name: ");
        this.studentName = scanner.nextLine();

        System.out.print("Enter student age: ");
        this.studentAge = scanner.nextLine();

        float averageScore;
        while(true){
        System.out.print("Enter average score: ");
            System.out.print("Enter student avarage score: ");
            averageScore = Float.parseFloat(scanner.nextLine());
            if(averageScore >= 0 && averageScore <= 10){
                this.averageScore = averageScore;
            }
            System.out.println("Average score must be between 0 and 10");
        }

    }

    @Override
    public String toString(){
        return "studentId: " + studentId + "\nstudentName: " + studentName + ",\nstudentAge: " + studentAge + ",\naverageScore: " + averageScore;
    }
}
