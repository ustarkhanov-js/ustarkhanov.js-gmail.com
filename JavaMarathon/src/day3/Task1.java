package day3;

import java.util.Scanner;

public class Task1 {
    // 1. Реализовать программу, используя switch, которая в консоль выводит название страны, принимая на вход название города.
    // Программа должна работать до тех пор, пока не будет введено слово “Stop”.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        outerLoop:
        while (true) {
            String city = formatCityName(scanner.nextLine());
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                case "Stop":
                    System.out.println("Завершение программы");
                    break outerLoop;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
        scanner.close();
    }

    private static String formatCityName(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}
