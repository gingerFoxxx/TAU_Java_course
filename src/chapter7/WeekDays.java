package chapter7;

import java.util.Scanner;

/**
 * HOMEWORK
 * Make an array that holds its actual values of the days of the week,
 * and then have the user input a number corresponding to some day of the week. And assume that the week starts on Monday.
 * Your program should output the String that represents the day of the week
 * that corresponds to the number that the user input.
 * For example, if the user inputs the number 1, your program should print “Monday”.
 *
 */

public class WeekDays {


    public static void main(String[] args) {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday","Sunday"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of day: ");
        int index = scanner.nextInt();
        scanner.close();
        System.out.println("Today is " + weekDays[index-1]);
    }
}
