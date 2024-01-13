package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    //4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
    //Найти максимум среди сумм трех соседних элементов.
    // Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 0; i < array.length - 2; i++){
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIdx = i;
            }


        }
        System.out.println(Arrays.toString(array));
        System.out.println("Индекс первого элемента тройки: " + maxSumIdx);
        System.out.println("Сумма максимальной тройки: " + maxSum);

    }
}
