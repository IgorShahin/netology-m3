package ru.netology;

import ru.netology.service.YearService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        YearService service = new YearService();

        System.out.println("Введите год в формате yyyy");
        int year = scanner.nextInt();

        int days = service.getDaysInYear(year);
        System.out.println("Количество дней " + days);
    }
}
