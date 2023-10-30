public class Main {
    public static void main(String[] args) {
        task1(17);
        task2(1);
        task3(61);
        task4(24);
        task5(14);
        task6(60);
        task7(60,62,61);

    }
    public static void task1(int age){
        if (age>=18){
            System.out.println("Если возраст человека равен "+age+", то он совершеннолетний");
        }else {
            System.out.println("Если возраст человека равен "+age+", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2(int temperature){
        if (temperature<5){
            System.out.println("На улице "+temperature+" градусов, нужно надеть шапку");
        }else if (temperature>5){
            System.out.println("На улице "+temperature+" градусов, можно идти без шапки");
        }else System.out.println("Условием не предусмотрено");
    }
    public static void task3(int speed){
        if (speed>60){
            System.out.println("Если скорость "+speed+", то придется заплатить штраф");
        }else if (speed<60){
            System.out.println("Если скорость "+speed+", то можно ездить спокойно");
        }else System.out.println("Условием не предусмотрено");
    }
    public static void task4(int age){
        boolean garten=age>=2 && age<=6;
        boolean scool=age>=7 && age<=17;
        boolean univer=age>=18 && age<=24;
        boolean work=age>24;
        if (garten){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад");
        }else if (scool){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу");
        }else if (univer){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в университет");
        }else if (work){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить на работу");
        }else System.out.println("Условием не предусмотрено");
    }
    public static void task5(int age){
        boolean soLittle=age<5;
        boolean withParents=age>=5 && age<14;
        boolean withoutParents=age>=14;
        if (soLittle){
            System.out.println("Если возраст ребенка равен "+age+", то ему нельзя кататься на аттракционе");
        }else if (withParents){
            System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (withoutParents) { //Можно было без if, но раз условие в задаче есть....
            System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6(int place){
        int availablePlaces=102;
        int availableSeatPlaces=60;
        if (place<=availableSeatPlaces && place>0){
            System.out.println("Предоставляется сидячее место");
        }else if (place>availableSeatPlaces && place<=availablePlaces){
            System.out.println("В связи с конфигурацией вагона, предоставляется стоячее место");
        } else if (place>availablePlaces) {
            System.out.println("Вагон переполнен");
        }else System.out.println("Введите положительное число больше \"0\"");
    }
    public static void task7(int one, int two, int three){
        boolean oneGreater=one>two && one>three;
        boolean twoGreater=two>one && two>three;
        boolean threeGreater=three>one && three>two;
        if (oneGreater){
            System.out.println("Большее из введенных "+one);
        }else if (twoGreater){
            System.out.println("Большее из введенных "+two);
        }else if (threeGreater){
            System.out.println("Большее из введенных "+three);
        }else System.out.println("Все, или некоторые веденные числа равны");
    }
}