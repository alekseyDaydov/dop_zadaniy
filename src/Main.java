//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        repcace();
        task2_2();
        task2_3();
    }

    public static void repcace() {
        //        2.1 Память
//        Напишите программу,  которая меняет местами значения, хранящиеся в двух
//        целочисленных переменных,  без использования третьей переменной.
        int a = 4;
        int b = 7;
        System.out.println("a = " + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Поменял местами a = " + a + " b = " + b);
    }

    public static void task2_2() {
//        В одной компании друзей принято считать вечеринку успешной,
//        когда съедено от 15 до 20 пачек чипсов. Если вечеринка проходит в выходные,
//                то верхней границы количества съеденных пачек чипсов нет.
//                Напишите программу, которая возвращает  true, если переменная
//        с заданными значениями успешна, или false в противном случае.

        System.out.println(chipsParty(3, false));   //        → false

        System.out.println(chipsParty(15, false));// → true

        System.out.println(chipsParty(70, true));// → true
    }

    public static boolean chipsParty(int countChips, boolean isWeekend) {
        if (isWeekend) {
            return countChips >= 15;
        } else {
            return countChips >= 15 && countChips <= 20;
        }
    }

    public static void task2_3() {
//        Число 6 поистине великое число.
//        Для двух значений int, a и b, вернуть true, если одно из них равно 6.
//        Или если их сумма или разность равна 6.
        System.out.println(great6(6, 4));// → true
        System.out.println(great6(4, 5));// → false
        System.out.println(great6(1, 5));// → true
    }

    public static boolean great6(int a, int b) {
        return (a + b == 6) || (a - b == 6) || (b - a == 6) || (a == 6) || (b == 6);
    }
}