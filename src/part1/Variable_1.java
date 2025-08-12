package part1;

public class Variable_1 {
    public static void main(String[] args) {
//        1
//        У вас есть две переменных, в которых хранятся два целочисленных числа. Напишите программу, которая выводит
//        в консоль результат деления первого числа на второе с остатком.
//        В качестве исходных данных используйте значения для первого числа *– 47, для второго – 13):*
//        В результате деления 47 */ 13*
//        Выходит *3 и 8 в остатке*

        int a = 47;
        int b = 13;
        System.out.println("a/b " + a / b + " остаток " + a % b);

//        2
//        Напишите программу, которая вычисляет сумму цифр двухзначного числа.
//        Программа должна работать с любым значением числа. В качестве исходных данных используйте число 44.
        a = 44;
        b = a / 10 + a % 10;
        System.out.println("b = " + b);
//      3 задание
//     Напишите программу, которая вычисляет сумму цифр трехзначного числа.
//     Программа должна работать с любым значением числа. В качестве исходных данных используйте число 345.
        a = 345;
        int a1 = a / 100;
        System.out.println("a1 = " + a1);
        int a2 = a / 10 % 10;  // a / 10 - a1 * 10;
        System.out.println("a2 = " + a2);
        int a3 = a % 10;
        System.out.println("a3 = " + a3);
        System.out.println(a1 + a2 + a3);
//     4 задание
//     Коля пришел в цветочный магазин и решил купить букет цветов своей подруге. Букет стоит ромашек 4899 рублей.
//     К цветам он купил открытку, которая стоит 157 рублей.
//     При покупке Коле дали скидку в 10% на сумму двух покупок.
//     Вычислите и выведите в консоль сумму двух покупок с учетом скидки.
//     Отдельно выведите сумму скидки двух покупок.
        int buket = 4899;
        int otkr = 157;
        double skidka = (buket + otkr) * (double) 0.1;
        double summaPokupokSoSkidkoy = (buket + otkr) - skidka;
        System.out.println("skidka = " + skidka);
        System.out.println("summaPokupokSoSkidkoy = " + summaPokupokSoSkidkoy);
//        reshebnik
        int flowersPrice = 4899;
        int postcardPrice = 157;
        int totalSum = flowersPrice + postcardPrice;
        int discount = 10;
        double discountSum = totalSum * (discount / 100f);
        double resultSum = totalSum - discountSum;
        System.out.println("Сумма скидки: " + discountSum);
        System.out.println("Cумма покупки со скидкой: " + resultSum);
//     5 задание
//     Сделайте расчет товаров со скидками.
//     а) Апельсины стоят 73 руб/кг и на них действует скидка 15%, а товар бананы стоят 95 руб/кг. Клиент взял 10 кг апельсинов и 2кг бананов.
//     Вычислите и выведите в консоль сумму  покупки с учетом скидки.
//     б) Шампанское стоит 2870 руб и на него действует скидка 50%, а товар хлеб стоит 27 руб. Клиент взял 7 бутылок шампанского и 1 батон хлеба.
//     Вычислите и выведите в консоль сумму покупки с учетом скидки.
//     в) Шампиньоны стоят 436 руб/кг, а белые грибы стоят 578 руб/кг и на них действует скидка 5%. Клиент взял 2,5 кг шампиньонов и 3,75 кг белых грибов.
//     Вычислите и выведите в консоль сумму покупки с учетом скидки.
        int orange = 73;
        double discountOrange = 0.15;
        int banana = 95;
        double summa = (orange * 10) * (double) (1 - discountOrange) + banana * 2;
        System.out.println("summa = " + summa);
        System.out.println("---------------------------");
        int orangesPrice = 73;
        int orangesDiscount = 15;
        double newOrangesPrice = orangesPrice - (orangesPrice * (orangesDiscount / 100f));
        int bananasPrice = 95;

        int orangesCount = 10;
        int bananasCount = 2;

        double resultSu1 = newOrangesPrice * orangesCount + bananasCount * bananasPrice;
        System.out.println("Сумма покупки: " + resultSu1);
        System.out.println("---------------------------------------");
        int shampan = 2870;
        double dixcountShampan = .5;
        int bread = 27;
        double summa2 = (shampan * 7) * (double) (1 - dixcountShampan) + bread * 1;
        System.out.println("summa2 = " + summa2);
//    6 задание
//      Объявите 2 переменных типа double ****со значениями
//      x = 0.40,
//      y = 0.87;
//      Посчитайте следующие выражения и выведите результат программы в консоль после каждого подсчета:
//      11*x + y
//      (x+10*y)- 15*(x/y)
       double x = 0.40d;
       double y = 0.87d;
        System.out.println( 11 * x + y);
        System.out.println((x + 10 * y) - 15 * (x / y));
    }
}
