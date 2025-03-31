package ra.validate;

import ra.enity.Book;
import ra.enity.Length;

import java.util.Scanner;

public class BookValidator{
    public static String validateId(Scanner input, String message, String regex){
        while(true){
            System.out.print(message);
            String id = input.nextLine();
            if(id.matches(regex)){
                return id;
            }
            System.out.println("Please enter a valid ID");
        }
    }

    public static String validateName(Scanner input, String message, Length length){
        while(true){
            System.out.println("Enter a string: ");
            String newString = input.nextLine();
            if(newString.length() < length.getMinLength() && newString.length() > length.getMaxLength()){
                System.out.println("The string must between " + length.getMinLength() + " and " + length.getMaxLength());
                continue;
            }
            if(Book.uniqueName.contains(newString)){
                System.out.println("The string " + newString + " is already in use");
                continue;
            }
            return newString;
        }
    }
}
