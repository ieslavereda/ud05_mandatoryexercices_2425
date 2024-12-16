package bingo;

import java.util.Scanner;

public class Input {
    private static final String YES = "Y";
    private static final String NO = "N";

    public static int getInteger(String message){
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while(!sc.hasNextInt()){
            System.err.print(message);
            sc.next();
        }
        return sc.nextInt();
    }

    public static String getString(String message){
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.next();
    }

    }