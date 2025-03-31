package ra.enity;

import java.util.Optional;
import java.util.Scanner;

public class Member implements IApp{
    private static int idSequence = 0;
    private int id;
    private String name;
    private Optional<String> email;

    public Member(int id, String name, String email){
        this.id = ++idSequence;
        this.name = name;
        this.email = Optional.ofNullable(email);
    }

    public Member(){
        this.id = ++idSequence;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Optional<String> getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = Optional.ofNullable(email);
    }


    @Override
    public void inputData(Scanner input){
        this.name = inputMemberName(input);
        this.email = Optional.ofNullable(inputMemberEmail(input));
    }

    private String inputMemberName(Scanner input){
        System.out.print("Enter member name: ");
        return input.nextLine();
    }

    private String inputMemberEmail(Scanner input){
        System.out.print("Enter member email: ");
        return input.nextLine();
    }

    @Override
    public String toString(){
        return "ID: " + id + "\nName: " + name + "\nEmail: " + email;
    }
}
