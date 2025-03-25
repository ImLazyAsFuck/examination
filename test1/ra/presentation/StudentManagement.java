package presentation;

import entity.Student;

import java.util.*;

public class StudentManagement{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Map<String, Student> students = new HashMap<>();
        int choice;
        while(true){
           displayMenu();
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1:
                    displayStudents(students);
                    break;
                case 2:
                    addStudent(input, students);
                    break;
                case 3:
                    deleteStudentById(input, students);
                    break;
                case 4:

                    break;
                case 7:
                    System.out.println("Good bye.");
                    System.exit(0);
                default:
                    System.out.println("Please choose between 1 to 7.");
            }
        }
    }

    public static void addStudent(Scanner input, Map<String, Student> students){
        int amountsStudent;
        while(true){
            System.out.print("Enter amount of students: ");
            amountsStudent = Integer.parseInt(input.nextLine());
            if(amountsStudent < 0){
                System.out.println("Please enter a positive number.");
                continue;
            }
            break;
        }
        String studentId;
        Student newStudent = new Student();
        for(int i = 0; i < amountsStudent; i++){
            while(true){
                System.out.print("Enter student ID: ");
                studentId = input.nextLine();
                if(!students.containsKey(studentId)){
                    newStudent.setStudentId(studentId);
                    break;
                }
                System.out.println("student id already exists!");
            }
            newStudent.inputData(input);
            students.put(studentId, newStudent);
        }
        System.out.println("Add students successfully!");
    }

    public static void displayStudents(Map<String, Student> students){
        for(Student student : students.values()){
            System.out.println(student);
            System.out.println("--------------------");
        }
    }

    public static void deleteStudentById(Scanner input, Map<String, Student> students){
        if(students.isEmpty()){
            System.out.println("students list is empty!");
            return;
        }
        System.out.print("Enter student ID: ");
        String studentId = input.nextLine();
        int found = -1;
        for(int i = 0; i < students.size(); i++){
            if(studentId.equals(students.get(i).getStudentId())){
                found = i;
            }
        }
        if(found == -1){
            System.out.println("student not found!");
            return;
        }
        students.remove(studentId);
        System.out.println("Student Deleted successfully!");
    }

    public static void displayMenu(){
        System.out.println("------- Menu ------");
        System.out.println("1. Display Students");
        System.out.println("2. Add Student");
        System.out.println("3. Delete Student By Student ID");
        System.out.println("4. Calculate All Student Average Score");
        System.out.println("5. Display Highest Student Average Score");
        System.out.println("6. Display The Student Have Lowest Age");
        System.out.println("7. Exit");
    }

    public static void calculateStudentsAverageScore(Scanner input, Map<String, Student> students){
        if(students.isEmpty()){
            System.out.println("students list is empty!");
            return;
        }
        float totalAvarageScore = 0;
        List<Student> studentList = new ArrayList<>(students.values());
        for(Student student : studentList){
            totalAvarageScore += student.getAverageScore();
        }
        System.out.println("Total Average Score: " + totalAvarageScore);
    }

    public static void FindHighestAverageScoreStudent(Scanner input, Map<String, Student> students){
        if(students.isEmpty()){
            System.out.println("students list is empty!");
            return;
        }
        int found = -1;
        List<Student> studentList = new ArrayList<>(students.values());
        
    }
}
