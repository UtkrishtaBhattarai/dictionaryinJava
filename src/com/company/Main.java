package com.company;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initializing the variable user_option
        int user_option = 0;
        // While the user has not entered 7, go through the loop
        while (user_option != 7) {
            user_option = greet_user();
            System.out.println(map_dict_input(user_option));
            System.out.println("\n");
            continue;
        }
    }

    // Creating a Function greet_user
    public static int greet_user() {
        System.out.println("Welcome to the game \n 1. Card Wars \n 2. Farkle \n 3. Tic Tac Toe \n 4. Yahtzee \n 5. Parcheesi \n 6. Uno \n 7. Exit");
        System.out.println("Choose the number from the menu provided...");
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }

    // Creating a function to map the key and value and returning the string and displaying it.
    public static String map_dict_input(int parameter) {
        // Made a dictionary to maps keys and values
        Dictionary dict = new Hashtable();
        // Adding items to the dictionary
        dict.put(1, "Card Wars");
        dict.put(2, "Farkle");
        dict.put(3, "Tic Tac Toe");
        dict.put(4, "Yahtzee");
        dict.put(5, "Parcheesi");
        dict.put(6, "Uno");
        dict.put(7, "Exit");
        return "Your Input is " + dict.get(parameter);
    }
}
