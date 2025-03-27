package entity;

import java.util.Scanner;

public class Student{
    private String studentId;
    private String studentName;
    private int studentAge;
    private float averageScore;

    public Student(String studentId, String studentName, int studentAge, float averageScore){
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

    public int getStudentAge(){
        return studentAge;
    }

    public void setStudentAge(int studentAge){
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
        this.studentAge = Integer.parseInt( scanner.nextLine());

        float averageScore;
        while(true){
            System.out.print("Enter average score: ");
            averageScore = Float.parseFloat(scanner.nextLine());
            if(averageScore >= 0f || averageScore <= 10f){
                this.averageScore = averageScore;
                break;
            }
            System.out.println("Average score must be between 0 and 10");
        }

    }

    @Override
    public String toString(){
        return "studentId: " + studentId + "\nstudentName: " + studentName + ",\nstudentAge: " + studentAge + ",\naverageScore: " + averageScore;
    }
}
