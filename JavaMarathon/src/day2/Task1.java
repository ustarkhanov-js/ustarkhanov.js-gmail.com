package day2;

import java.util.Scanner;

public class Task1 {

    // 1. Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner,
    // число, соответствующее количеству этажей в здании. Используя условный оператор if,
    // необходимо вывести в консоль сообщение о типе такого дома

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floors = scan.nextInt();

        if (floors >= 1 && floors <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (floors >= 5 && floors <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (floors >= 9) {
            System.out.println("Многоэтажный дом");
        } else{
            System.out.println("Ошибка ввода");
        }

    }
}
