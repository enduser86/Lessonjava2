package Lesson2;
public class Lesson2 {

    public static void main(String[] args) {
        System.out.println(doTask1(1, 25)); //1
        doTask2(15); //2
        System.out.println(doTask3(13));//3
        doTask4("Evgeniy is learning programming language java", 10);//4

    }
    // 1. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
    // от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean doTask1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }
    //    2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
    //    в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static void doTask2(int x) {
        if (x >= 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
    //3.Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
    // отрицательное, и вернуть false если положительное.
    public static boolean doTask3(int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }
   // 4.Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
   // указанную строку, указанное количество раз;
    public static void doTask4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }




    }
