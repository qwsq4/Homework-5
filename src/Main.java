public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("   Задание 1");
        var clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2
        System.out.println("   Задание 2");
        var clientDeviceYear = 2014;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else System.out.println("Установите облегченную версию приложения для Android по ссылке");

        //Задание 3
        System.out.println("   Задание 3");
        int year = 2021;
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println(year + " год является високосным");
            } else if (year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }else System.out.println(year + " год не является високосным");
        }else System.out.println(year + " год не является високосным");

        //Задание 4
        System.out.println("   Задание 4");
        int deliveryDistance = 95;
        if (deliveryDistance <=20) {
            System.out.println("Потребуется дней: 1");
        } else if ((deliveryDistance > 20) && (deliveryDistance <= 60)) {
            System.out.println("Потребуется дней: 2");
        } else if ((deliveryDistance > 60) && (deliveryDistance <= 100)) {
            System.out.println("Потребуется дней: 3");
        }

        //Задание 5
        System.out.println("   Задание 5");
        var mounthNumder = 12;
        switch (mounthNumder) {
            case 12:
            case 1:
            case 2:
                System.out.println(mounthNumder + "-й месяц является зимним");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(mounthNumder + "-й месяц является весенним");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(mounthNumder + "-й месяц является летним");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(mounthNumder + "-й месяц является осенним");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}