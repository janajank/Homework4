public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();


    }

    public static void task1() {
        System.out.println("Задача1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Он совершенолетний");
        } else {
            System.out.println("Он не достиг совершеннолетия,нужно немного подождать. ");
        }
    }

    public static void task2() {
        System.out.println("Задача2");
        int t = 0;
        if (t <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку.");
        }
        if (t > 5) {
            System.out.println("Сегодня тепло,можно идти без шапки.");
        }
    }
    public static void task3 () {
        System.out.println("Задача3");
        int v = 70;
        if (v > 60) {
            System.out.println("Скорость превышенна, придется заплатить штраф.");
        }
        if (v <= 60 ) {
            System.out.println("Превышенния скорости нет, можно ездить спокойно.");
        }

    }

    public static void task4 () {
        System.out.println("Задача4");
        int age = 15;
        if (age > 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age  +",нужно ходить в детский сад!");}
        if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age +",то нужно ходить в школу!");}
        if (age >=18 && age < 24) {
            System.out.println("Если возраст человека равен " + age +",то место в университете!");}
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age+",то пора ходить на работу!");}
    }

    public static void task5 () {
        System.out.println("Задача5");
        int age = 15;

        if (age < 5) {
            System.out.println("Если возраст ребенка равен "+age+", то он не может кататься на аттракционе.");}
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен "+age+",то он может кататься только в" +
                    " сопровождении взрослого. Если взрослого нет, то кататься нельзя.");}
        if (age >= 14) {
            System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.");}
    }
    public static void task6 () {
        System.out.println("Задача6");
        int passengerN = 66;
        int capacity = 102;
        int seats = 60;
        if (passengerN <= 60) {
            System.out.println("В вагоне будут сидячие места.");}
        if (passengerN > 60 && passengerN <= 102) {
                System.out.println("В вагоне будут стоячие места.");}
        if (passengerN > 102) {
                System.out.println("Свободных мест в вагоне нет.");}
        }
    public static void task7 () {
        System.out.println("Задача7");
        int one = 31;
        int two = 32;
        int three = 33;
        if (three > one && three > two) {
            System.out.println( three + " самое большое число.");
        } else {
            System.out.println("Это самое маленькое число.");
        }
    }
}








