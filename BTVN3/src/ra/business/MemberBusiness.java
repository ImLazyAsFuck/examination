package ra.business;

import ra.enity.Member;
import ra.presentation.LibraryManagement;

import java.util.Scanner;

public class MemberBusiness{

    public void addMember(Scanner input){
        System.out.print("Enter amounts of members: ");
        int amounts = Integer.parseInt(input.nextLine());
        for(int i = 0; i < amounts; i++){
            Member newMember = new Member();
            System.out.println("Member " + newMember.getId());
            LibraryManagement.members.add(newMember);
        }
        System.out.println("Books added successfully");
    }

    public void displayMembers(){
        if(LibraryManagement.members.isEmpty()){
            System.out.println("Book list is empty");
            return;
        }
        LibraryManagement.members.forEach(System.out::println);
    }
}
