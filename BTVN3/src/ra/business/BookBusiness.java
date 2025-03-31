package ra.business;

import ra.enity.Member;
import ra.presentation.LibraryManagement;

import java.util.Scanner;

public class BookBusiness{
    public static void addMember(Scanner input){
        System.out.print("Enter amounts of Members: ");
        int amounts = Integer.parseInt(input.nextLine());
        for(int i = 0; i < amounts; i++){
            Member member = new Member();
            System.out.println("Member " + member.getId());
            LibraryManagement.members.add(member);
        }
        System.out.println("Member added successfully");
    }
}
