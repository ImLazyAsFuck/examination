package util;

import java.util.Scanner;

public class Validator{
    public static int integerValidator(Scanner input){
            while(true){
                try{
                    System.out.print("Enter the number: ");
                    int number = Integer.parseInt(input.nextLine());
                    return number;
                }catch(NumberFormatException e){
                    System.out.println("Invalid number");
                }
            }
    }

    public static double doubleValidator(Scanner input){
        while(true){
            try{
                System.out.print("Enter the double number: ");
                double number = Double.parseDouble(input.nextLine());
                return number;
            }catch(Exception e){
                System.out.println("Invalid double number");
            }
        }
    }

    public static float floatValidator(Scanner input){
        while(true){
            try{
                System.out.print("Enter the float number: ");
                float number = Float.parseFloat(input.nextLine());
                return number;
            }catch(Exception e){
                System.out.println("Invalid float number");
            }
        }
    }

    public static String stringValidator(Scanner input, int min, int max){
        while(true){
            try{
                System.out.print("Enter the string: ");
                String string = input.nextLine();
                if(string.trim().isEmpty()){
                    throw new IllegalArgumentException("Empty string");
                }
                if(string.trim().length() < min){
                    throw new IllegalArgumentException("String too short");
                }
                if(string.trim().length() > max){
                    throw new IllegalArgumentException("String too long");
                }
                return string.trim();
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static Boolean booleanValidator(Scanner input){
        while(true){
            try{
                System.out.print("Enter the boolean: ");
                String bool = input.nextLine();
                if(bool.trim().equalsIgnoreCase("true") || bool.trim().equalsIgnoreCase("false")){
                    return Boolean.parseBoolean(bool);
                }
                throw new IllegalArgumentException("Invalid boolean");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static String emailValidator(Scanner input){
        while(true){
            try{
                System.out.print("Enter the email: ");
                String email = input.nextLine();
                if(email.isEmpty()){
                    throw new IllegalArgumentException("Empty email");
                }
                if(!email.matches("\\w+@\\w+\\.\\w+")){
                    throw new IllegalArgumentException("Invalid email");
                }
                return email;
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static String phoneNumberValidator(Scanner input){
        while(true){
            try{
                System.out.print("Enter the phone number: ");
                String phone = input.nextLine();
                if(phone.isEmpty()){
                    throw new IllegalArgumentException("Empty phone number");
                }
                if(!phone.matches("\\[086|096|097|098|032|033|034|035|036|037|038|039]d{10}")){
                    throw new IllegalArgumentException("Invalid phone number");
                }
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
