package ra.validate;

import ra.enity.Length;

import java.util.Scanner;

public class IntegerValidator{
    public static int validateInteger(Scanner input, String message, int min){
        while(true){
            System.out.print(message);
            String integer = input.nextLine();
            if(!integer.matches("^\\d+$")){
                System.out.println("Please enter a valid integer");
                continue;
            }
            if(integer.length() < min){
                System.out.println("Must greater than " + min);
                continue;
            }
            return Integer.parseInt(integer);
        }
    }
}
