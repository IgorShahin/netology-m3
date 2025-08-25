package ru.netology;

import ru.netology.service.YearService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        YearService yearService = new YearService();

        int score = 0;

        while (true) {
            System.out.println("Введите год:");
            int year = scanner.nextInt();

            System.out.println("Введите количество дней:");
            int userDays = scanner.nextInt();

            int correctDays = yearService.getDaysInYear(year);

            if (userDays == correctDays) {
                score++;
            } else {
                System.out.println("Неправильно! В этом году " + correctDays + " дней!");
                System.out.println("Набрано очков: " + score);
                break;
            }
        }
    }
}
