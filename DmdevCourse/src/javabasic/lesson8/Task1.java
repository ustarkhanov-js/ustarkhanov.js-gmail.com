package javabasic.lesson8;

public class Task1 {
  /* Задание 2
   *  Дано целое число. Определить, является ли последняя цифра этого числа - цифрой 3.
   * */
  public static void main(String[] args) {
    int value = 912313;
    if (getLastNumber(value) == 3) {
      System.out.println("Последняя цифра числа является 3");
    }
  }

  // Получаем последнюю цифру из числа
  public static int getLastNumber(int number) {
    return number % 10;
  }
}