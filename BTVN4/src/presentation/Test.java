package presentation;

import util.Validator;

import java.util.Scanner;

public class Test{
    public static int MIN_LENGTH = 5;
    public static int MAX_LENGTH = 50;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = Validator.integerValidator(sc);
        float floatNumber = Validator.floatValidator(sc);
        double doubleNumber = Validator.doubleValidator(sc);
        boolean bool = Validator.booleanValidator(sc);
        String string = Validator.stringValidator(sc, MIN_LENGTH, MAX_LENGTH);
        String email = Validator.emailValidator(sc);
        String phoneNumber = Validator.phoneNumberValidator(sc);
    }
}
