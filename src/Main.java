public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Человек совершеннолетний");
        }
        else {
            System.out.println("Человек не достиг совершеннолетия, нужно немного подождать");
        }

        int weather = 4;
        if (weather < 5) {
            System.out.println("На улице " + weather + " градуса, нужно надеть шапку");
        }
        if (weather >= 5) {
            System.out.println("На улице " + weather + " градусов, можно идти без шапки");
        }

        int normSpeed = 60;
        int driverSpeed = 65;
        boolean driverSpeedMoreThenNorm = driverSpeed > normSpeed;
        if (driverSpeedMoreThenNorm) {
            System.out.println("Если скорость " + driverSpeed + ", то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + driverSpeed + ", то можно ездить спокойно");
        }

        int vozrast = 25;
        if (vozrast >= 2 && vozrast <= 6) {
            System.out.println("Если возраст человека равен " + vozrast + ", то ему нужно ходить в детский сад");
        }
        if (vozrast >= 7 && vozrast <=17) {
            System.out.println("Если возраст человека равен " + vozrast + ", то ему нужно ходить в школу");
        }
        if (vozrast >= 18 && vozrast <= 24) {
            System.out.println("Если возраст человека равен " + vozrast + ", то его место в университете");
        }
        else  {
            System.out.println("Если возраст человека равен " + vozrast + ", то ему то ему пора ходить на работу");
        }

        int age2 = 14;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе");
        }
        if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int capacity = 102;
        int seats = 60;
        int occupancy = 103;
        if (occupancy <= seats) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (occupancy > seats && occupancy <= capacity) {
            System.out.println("В вагоне есть стоячие места");
        }
        else {
            System.out.println("Вагон уже забит полностью.");
        }

        int one = 36;
        int two = 170;
        int three = 5;
        if (one > two && one > three) {
            System.out.println(one);
        }
        if (two > one && two > three) {
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }
    }
}