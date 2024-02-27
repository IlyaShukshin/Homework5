public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
         int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");}
        else if (clientOs == 1 ) {
            System.out.println("Установите версию приложения для Android по ссылке");}

        System.out.println("Задача №2");
        int clientDeviceYear = 2014;
       clientOs = 0;
       if (clientOs == 0 && clientDeviceYear < 2015) {
           System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
       else if (clientOs == 0 && clientDeviceYear >= 2015) {
           System.out.println("Установите версию приложения для iOS по ссылке");}
       else if (clientOs == 1 && clientDeviceYear < 2015) {
           System.out.println("Установите облегченную версию приложения для Android по ссылке");}
       else if (clientOs == 1 && clientDeviceYear >=2015) {
           System.out.println("Установите версию приложения для Android по ссылке");}

        System.out.println("Задача №3");
       int year = 2024;
       if (year > 1584 && year % 4 == 0 && year % 100 !=0) {
           System.out.println(year + " Год является високосным");}
       else {
           System.out.println(year + " Год не является високосным");}

        System.out.println("Задача №4");
       int deliveryDistance = 95;
       int deliveryTime = 0;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else {
            System.out.println("Свыше 100 км доставки нет");}

        System.out.println("Задача № 5");
        int monthNumber = 7;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
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
                System.out.println("Неверное значение");
        }
    }
}