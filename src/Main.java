public class Main {

    public static void main(String[] args) {

        // task 1
        byte age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно " +
                    "немного подождать");
        }

        // task 2
        byte temperature = 15;
        boolean isTodayAWarmDay = temperature >= 5;
        if (isTodayAWarmDay) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }

        // task 3
        byte speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        // task 4
        age = 1;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему никуда не нужно ходить");
        }

        // task 5
        age = 5;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе" +
                    " в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе" +
                    " без сопровождения взрослого");
        }

        // task 6
        byte seatsAll = 102;
        byte seatingPlace = 60;
        byte ticketsSold = 101;
        if (ticketsSold < seatingPlace) {
            System.out.println("В вагоне есть еще " + (seatingPlace - ticketsSold) + " сидячих мест");
        } else if (ticketsSold >= seatingPlace && ticketsSold < seatsAll) {
            System.out.println("В вагоне есть еще " + (seatsAll - ticketsSold) + " стоячих мест");
        } else {
            System.out.println("Вагон уже полностью забит");
        }

        // task 7
        int one = 5;
        int two = 80;
        int three = 13;
        if (one > two && one > three) {
            System.out.println("Число " + one + " самое большое");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " самое большое");
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " самое большое");
        }

    }
}
