package net.uimi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] planningSchedule = new String[7][2];
        planningSchedule[0][0] = "Sunday";
        planningSchedule[0][1] = "do home work";
        planningSchedule[1][0] = "Monday";
        planningSchedule[1][1] = "go to courses; watch a film";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please, input the day of the week:");
            String userInput = scanner.nextLine().trim().toLowerCase();
            if ("exit".equals(userInput)) {
                break;
            }
            boolean inputDay = false;
            for (String[] day: planningSchedule) {
                if (day[0] != null && day[0].toLowerCase().equals(userInput)) {
                    System.out.println("Your tasks for " + day[0] + ": " + day[1]);
                    inputDay = true;
                    break;
                }
            }
            if (!inputDay) {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}