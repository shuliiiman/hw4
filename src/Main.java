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
    public static void task1(){
        System.out.println("Задание номер 1 ");
        int human = 34;
        if (human>=18){
            System.out.println("Если возратс человека равен "+human+", то он совершенолетний");
        }
        int human2 = 12;
        if (human2<=18){
            System.out.println("Если возраст человека равен "+human2+", то нужно немного подождать");
        }
    }
        public static void task2(){
            System.out.println("Задание номер 2");
            int t=3;
            if(t<5){
                System.out.println("На улице "+t+" градусов, нужно надеть шапку");
            }
            int t2= 7;
            if(t2>5){
                System.out.println("На улице "+t2+" градусов, можно идти без шапки");
            }
        }
        public static void task3(){
            System.out.println("Задание номер 3");
            int speed= 180;
            if(speed>60){
                System.out.println("Если скорость "+speed+", то придётся заплатить штраф");
            }
            int speed2= 34;
            if (speed2<60){
                System.out.println("Если скорость "+speed2+", то можно ездить спокойно");
            }
        }
        public static void task4(){
            System.out.println("Задание номер 4");
            int human=1;
            if(human<2){
                System.out.println("Если возраст человека равен "+ human+" год, то ему пора спать");
            }
            int human2 =5;
            if (human2>2 && human2<7){
                System.out.println("Если возраст человека равен "+human2+" лет, то ему нужно ходить в детский сад");
            }
            else if(human2>=18 && human2<=24){
                System.out.println("Если возраст человека равен "+human2+" лет, то ему нужно ходть в университет");
            }
            else if(human2>=24 && human2<=60) {
                System.out.println("Если возраст человека равен " + human2 + " лет, то ему нужно ходть на работу");
            }
            else if(human2>60) {
                System.out.println("Если возраст человека равен " + human2 + " лет, то ему можно отдохнуть");
            }
    }
        public static void task5(){
            System.out.println("Задание номер 5");
            int children=13;
            if (children<5){
                System.out.println("Если ребенку "+children+", то он не может кататься на атракционе");
            }
            else if (children>=5 && children<14){
                System.out.println("Если ребёнку "+children+", то он может кататься в сопровождениии взрослого");
            }
            else if (children>14){
                System.out.println("Если ребёнку "+children+", то он может кататься один");
            }
    }
        public static void task6(){
            System.out.println("Задание номер 6 ");
            int train=102;
            int sittingPlacesOfTrain=60;
            if (train<103){
                System.out.println("В вагоне есть место");
            }
            else if (sittingPlacesOfTrain<=60 || train<102 ){
                System.out.println("Есть сидячее место");
            }
            else if(train>102){
                System.out.println("Вагон уже полностью забит");
            }




       }
        public static void task7(){
            System.out.println("Задание номер 7");
            int one = 32;
            int two = 43;
            int three = 47;
            if (one<two && one<three){


            }

        }
}