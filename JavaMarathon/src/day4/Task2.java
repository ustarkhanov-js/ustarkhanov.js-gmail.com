package day4;

import java.util.Random;

public class Task2 {
    // 2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
    //Затем, используя цикл for each вывести в консоль:
    //-	наибольший элемент массива
    //-	наименьший элемент массива
    //-	количество элементов массива, оканчивающихся на 0
    //-	сумму элементов массива, оканчивающихся на 0

    //Использовать сортировку запрещено.
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int max = Integer.MIN_VALUE;
        for (int element: array){
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);

        int min = Integer.MAX_VALUE;
        for (int element: array) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("Наименьший элемент массива: " + min);

        int count0 = 0;
        for (int element: array) {
            if (element % 10 == 0) {
                count0++;
                System.out.print(element + " , ");
            }
        }
        System.out.println("Элементов массива оканчивающихся на ноль: " + count0);

        int sumOfCount0 = 0;
        for (int element : array) {
            if (element % 10 == 0 ){
                sumOfCount0 = sumOfCount0 + element;
            }
        }
        System.out.println("Сумма элементов оканчивающихся на ноль: " + sumOfCount0);
    }
}
