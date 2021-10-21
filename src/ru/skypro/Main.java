package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задание №1
        System.out.println("Задание №1");
        System.out.println("");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание №2
        System.out.println();
        System.out.println("Задание №2");
        int clientDeviceYear = 2015;
        if (clientOS ==0)
        {
            if (clientDeviceYear <2015) {
                System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear <2015)
            {
                System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
            }
            else
            {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        // Задание №3
        System.out.println();
        System.out.println("Задание №3");
        ////////////////////////////////////////////////////////////////////////////////////
        int year = 1902;
        if (year % 400 == 0) {
            System.out.println(year + " Год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " Год не является високосным");
        }
        else if (year % 4 == 0 )
            System.out.println(year + " Год является високосным");
        else
            System.out.println(year + " Год не является високосным");

        // Задание №4

        System.out.println();
        System.out.println("Задание №4");
        /*int deliveryDistance = 95;
        int timeDelivery = ((deliveryDistance + 19) / 40) + 1;
        System.out.println("Потребуется дней: " + timeDelivery);
        */
        var deliveryDistance = 95;
        var time = 0;
        if (deliveryDistance <=20) {
            time = 1;
        }
        else if (deliveryDistance>20 && deliveryDistance<=60) {
            time += 1;
        }
        else if (deliveryDistance<=100) {
            time += 2;
        }
        System.out.println("Потребуется дней "+ time);

        System.out.println();
        System.out.println("Задание №5");
        var monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяцев только 12");
        }
        // Задание №6
        System.out.println();
        System.out.println("Задание №6");
        // Переделать ............if..............
        var age = 19;
        int salary = 58_000;
        var k = 0;
        if ( age>= 23 ){
            k = 3;
        }
        else if (age < 23){
            k=2;
        }
        if (salary >= 50_000 && salary < 80_000) {
            salary = salary * k + salary * 6 / 5;
        }
        else if (salary >= 80_000){
            salary = salary * k + salary * 3 / 2;
        }
        else {
            salary = salary * 3;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");

        // Задача №7
        System.out.println();
        System.out.println("Задача №7");
        var age7 = 25;
        var salary7 = 60_000;
        double wantedSum7 = 330_000;
        double iniSum7 = wantedSum7;
        double bid7 = 10;
        var time7 = 12;
        var maxBid7 = salary7 / 2;
        if (age7 < 23)
        {
            bid7+= 1;
            // System.out.println(2);
        } else if (age7> 23 && age7 <30)
        {
            bid7+=0.5;
            // System.out.println(1);
        }
        if (salary7 > 80_000)
            bid7 -= 0.7;


        wantedSum7= wantedSum7 * (100+bid7) / 100;
        // System.out.println(bid7);
        // System.out.println(wantedSum7);

        if (wantedSum7 / 12 < maxBid7) {
            System.out.println("Максимальный платеж при ЗП " + salary7 + " равен " + maxBid7 + " рублей. Платеж по кредиту " + iniSum7 + " рублей. Одобрено");
        }
            else {
            System.out.println("Максимальный платеж при ЗП " + salary7 + " равен " + maxBid7 + " рублей. Платеж по кредиту " + iniSum7 + " рублей. Отказано");
        }
    }
}
