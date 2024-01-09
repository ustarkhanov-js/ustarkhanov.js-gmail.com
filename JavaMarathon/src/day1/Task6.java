package day1;

public class Task6 {
    // 6. Объявите переменную типа int, имя переменной - k.
    // Присвойте этой переменной какую-нибудь цифру от 1 до 9.
    // Используя цикл на ваше усмотрение (for или while),
    // выведите в консоль таблицу умножения для этой цифры в следующем формате:
    //1 x k = …
    //2 x k = …
    //3 x k = …
    public static void main(String[] args) {
        int k = 3;
        int result;
        for (int i = 1; i < 10; i++) {
            result = i * k;
            System.out.println(i + " x " + k + " = " + result);
        }
    }
}
