package day4;


import java.util.Random;
import java.util.Scanner;

public class Task1 {
    //1. С клавиатуры вводится число n - размер массива.
    // Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10 (включительно).
    // Используя цикл for each вывести содержимое массива в консоль, а также вывести в консоль информацию о:
    //а) Длине массива
    //б) Количестве чисел больше 8
    //в) Количестве чисел равных 1
    //г) Количестве четных чисел
    //д) Количестве нечетных чисел
    //е) Сумме всех элементов массива

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }

        for (int element: array) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Длина Массива: " + array.length);
        int count8 = 0;
        for (int number : array) {
            if (number > 8) {
                count8++;
            }
        }
        System.out.println("Количество чисел больше 8: " + count8);
        int count1 = 0;
        for (int number : array) {
            if (number == 1) {
                count1++;
            }
        }
        System.out.println("Количество чисел равных 1: " + count1);

        int countEven = 0;
        for (int element: array){
            if (element % 2 == 0) {
                countEven++;
                System.out.print(element + " , ");
            }
        }
        System.out.println("Количество чётных чисел: " + countEven);

        int countOdd = 0;
        for (int element: array){
            if (element % 2 != 0) {
                countOdd++;
                System.out.print(element + " , ");
            }
        }
        System.out.println("Количество нечётных чисел: " + countOdd);

        int sum = 0;
        for (int element : array){
            sum+= element;
        }

        System.out.println("Сумма всех элементов массива: " + sum);

        scanner.close();
    }
}

