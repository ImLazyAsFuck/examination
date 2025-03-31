package ra.validate;

import ra.enity.Book;
import ra.enity.Length;

import java.util.Scanner;

public class StringValidator{
    public static String validateString(Scanner input, String message, Length length){
        while(true){
            System.out.println("Enter a string: ");
            String newString = input.nextLine();
            if(newString.length() < length.getMinLength() && newString.length() > length.getMaxLength()){
                System.out.println("The string must between " + length.getMinLength() + " and " + length.getMaxLength());
                continue;
            }
            return newString;
        }
    }
}
