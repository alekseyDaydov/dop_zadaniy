package part1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class UslovOperat_3 {
    public static void main(String[] args) {


        //    1 задание
//
//    Напишите программу, которая проверяет и выводит на экран, является ли целое число записанное в переменную p,
//    чётным или нечётным. Ноль является нечетным числом.
        int p = 4;
        if (p % 2 != 0 || p == 0) {
            System.out.println("Число не четное");
        } else {
            System.out.println("Число четное");
        }

//
//        2 задание
//
//        Напишите программу, которая выводит на экран ближайшее к 10 из двух чисел, записанных в переменные p и d.
//        Например, среди чисел 7.3 и 11.13 ближайшее к десяти 11.13.
        double p1 = 7.3;
        double d = 11.13;

        if (Math.abs(p1 - 10) < Math.abs(d - 10)) {
            System.out.println("p1 ближе к 10");
        } else {
            System.out.println("d ближе к 10");
        }
//      3 **задание**
//     Напишите программу, которая проверяет, попало ли случайно выбранное из отрезка [3;158] целое число
//     (его нужно сгенерировать с помощью класса Random) в интервал (22;99) и выводить результат в консоль.
        Random random = new Random();
        int min = 3;
        int max = 158;
        int randomInRange = random.nextInt(max - min + 1) + min; // От 50 до 100
        System.out.println("randomInRange " + randomInRange);
        if (randomInRange >= 22 && randomInRange <= 99) {
            System.out.println("число попало в промежуток от 22 до 99");
        } else {
            System.out.println("число не попало в промежуток от 22 до 99");
        }

//     4 **задание**
//     Напишите программу, которая генерирует случайное трехзначное число (воспользоваться классом Random),
//     а затем находит и выводит в консоль наибольшего его члена.
//     Например, в числа 586 наибольшим членом является 8, т.к. это число больше 5 и больше 6.

        min = 100;
        max = 999;
        randomInRange = random.nextInt(max - min + 1) + min; // От 100 до 999
        System.out.println(randomInRange);
        int num1 = randomInRange / 100;
        System.out.println("num1= " + num1);
        int num2 = randomInRange / 10 % 10;
        System.out.println("num2 = " + num2);
        int num3 = randomInRange % 10;
        System.out.println("num3 = " + num3);
        if (num1 > num2 && num1 > num3) {
            System.out.println("num1- самое большое число " + num1);
        } else if (num2 > num3) {
            System.out.println("num2- самое большое число " + num2);
        } else {
            System.out.println("num3- самое большое число " + num3);
        }
//     5 задание
//     Даны три переменные a, b и c, которые содержат целочисленные значение и не равны между собой.
//     Напишите программу, которая выводит в консоль в качестве результата последовательность из трех значений
//     данных переменных от самой меньшего значения к самому большему.
//     Важно: учитывайте, что значения могут быть отрицательными.
        int a = -5;
        int b = 7;
        int c = -7;
        if ((a < b && a < c)) {
            System.out.println("a самое маленькое число " + a);
            if (b < c) {
                System.out.println("b 2 маленькое число " + b);
                System.out.println("c 3 маленькое число " + c);
            } else {
                System.out.println("c 2 маленькое число " + c);
                System.out.println("b 3 маленькое число " + b);
            }
        } else if (b < a && b < c) {
            System.out.println("b самое маленькое число " + b);
            if (a < c) {
                System.out.println("a 2 маленькое число " + a);
                System.out.println("c 3 маленькое число " + c);
            } else {
                System.out.println("c 2 маленькое число " + c);
                System.out.println("a 3 маленькое число " + a);
            }
        } else {
            System.out.println("c самое маленькое число " + c);
            if (b < a) {
                System.out.println("b 2 маленькое число " + b);
                System.out.println("a 3 маленькое число " + a);
            } else {
                System.out.println("a 2 маленькое число " + a);
                System.out.println("b 3 маленькое число " + b);
            }
        }

//     6 задание
//     На одном предприятии инженер Иванов придумал и сделал устройство, которое показывает количество секунд до конца рабочего дня.
//     Ровно в 8 часов утра инструмент показывает на экране «28800»
//     Когда на часах 13:30, то на экране «9000»
//     Когда наступает 16 часов, то инструмент показывает «0» (так как рабочий день закончен).
//     Программист Петров обратил внимание, что офисным сотрудникам неудобно пользоваться инструментов,
//     так как они не оценивают свой рабочий день в секундах. Им было бы куда удобнее, если бы на экране отображалось,
//     сколько часов рабочего дня осталось.
//     Напишите программу, которая высчитает из исходного количества секунд, сколько целых рабочих часов осталось.
//     Программа должна выводить в консоль на одной строке количество секунд до конца рабочего дня,
//     а на другой –  количество часов  до конца рабочего дня.
//     Для записи исходного значения секунд используйте целочисленную переменную из интервала [0;28800]
//        int chas = 8;
        int sek = 28800;
        int minut = sek / 60;
        int chas = minut / 60;
        System.out.println("До конца дня: секунд " + sek + " часов " + chas);
        sek = 17180;
        minut = sek / 60;
        chas = minut / 60 + 1;
        System.out.println("До конца дня: секунд " + sek + " часов " + chas);
        int currentTime = ThreadLocalRandom.current().nextInt(28001);
        int workday = 28800;
        int secondsLeft = workday - currentTime;
        float hoursLeft = Math.round(secondsLeft / (60.0f * 60f));
        System.out.println("До конца рабочего дня осталось " + secondsLeft + " секунд");
        System.out.println("До конца рабочего дня осталось " + hoursLeft + " час(а/ов)");
    }
}