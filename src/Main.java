public class Main {
    public static void main(String[] args) {
        //Task 1
        var age = 18;
        if (age < 18) {
            System.out.println("Вы не достигли совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Вы совершеннолетний");
        }

        //Task 2
        var temperature = 7;
        if (temperature < 5) {
            System.out.println("\nНа улице холодно, нужно надеть шапку");
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("\nСегодня тепло, можно идти без шапки");
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }


        //Task 3
        var speed = 52;
        if (speed < 60) {
            System.out.println("\nЕсли скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("\nЕсли скорость " + speed + ", то придется заплатить штраф");
        }

        //Task 4
        age = 6;
        if (age >= 2 && age <= 6) {
            System.out.println("\nЕсли возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 17){
            System.out.println("\nЕсли возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24){
            System.out.println("\nЕсли возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age >= 25){
            System.out.println("\nЕсли возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        //Task 5
        age = 4;
        if (age < 5) {
            System.out.println("\nЕсли возраст человека равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age <= 14){
            System.out.println("\nЕсли возраст человека равен " + age + ", то ему можно кататься только в сопровождении взрослого");
        }  else if (age > 14){
            System.out.println("\nЕсли возраст человека равен " + age + ", то ему можно кататься без сопровождения взрослого");
        }

        //Task 6
        var place = 23;
        if (place < 60) {
            System.out.println("\nВ вагоне есть сидячие места");
        } else if (place >= 60 && place <= 101) {
            System.out.println("\nВ вагоне нет сидячих мест");
        } else {
            System.out.println("\nВагон полностью забит");
        }

        //Task 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("\nПервое число наибольшее");
        } else if (two >= one && two >= three) {
            System.out.println("\nВторое число наибольшее");
        } else {
            System.out.println("\nТретье число наибольшее");
        }
    }
}