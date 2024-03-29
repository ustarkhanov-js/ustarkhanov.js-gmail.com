package day4;

import java.util.Random;

public class Task3 {
    //3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
    // Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
    // В консоль вывести индекс строки, сумма чисел в которой максимальна.
    // Если таких строк несколько, вывести индекс последней из них.
    //Пример сгенерированной матрицы (для простоты m=3, n=5):
    public static void main(String[] args) {
    int[][] matrice = new int[12][8];
    Random random = new Random();


    for (int i = 0; i < matrice.length; i++) {
        for (int j = 0; j < matrice[i].length; j++) {
            matrice[i][j] = random.nextInt(50);
            System.out.print(matrice[i][j] + " ");
        }
        System.out.println();
    }
        int count = 0;
        int max = 0;
        int idOfMax = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                    count += matrice[i][j];
            }
            if (count >= max) {
                idOfMax = i;
                max = count;
            }
            count = 0;
        }

        System.out.println("Номер строки с наибольшей суммой: " + idOfMax);
        System.out.println("Сумма наибольшей строки: " + max);
    }
}
