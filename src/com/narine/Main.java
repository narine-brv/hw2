package com.narine;

public class Main {

    public static void main(String[] args) {
        System.out.println(instruction(generateRandomAge(0,130),15));
        System.out.println(generateRandomAge(0, 130));

    }

    public static String instruction (int ageOfPerson, int temperature) {
        //возвращаемый с входящими параметрами
        if (ageOfPerson > 20 && ageOfPerson < 45 && temperature > -20 && temperature < 30)
            return "Можно идти гулять";
        else if (ageOfPerson < 20 && temperature > 0 && temperature < 28)
            return "Можно идти гулять";
        else if (ageOfPerson > 45 && temperature > -10 && temperature < 25)
            return "Можно идти гулять";
        else return "Оставайтесь дома";
    }
        /* Создать возвращаемый метод который будет принимать 2 входящих параметра -
	возраст человека и температуру на улице, и возвращать результат в виде строки */
        /* Алгоритм метода должен работать следующим образом:
         ○ если возраст человека от 20 до 45 лет и температура на улице от -20 до 30
        градусов, то возвращаемый результат - “Можно идти гулять”;
         ○ eсли же человеку меньше 20 лет и температура на улице в диапазоне от 0
        до 28 градусов, то результат снова - “Можно идти гулять”;
         ○ а если человеку больше 45 лет, то результат “Можно идти гулять” формируется
        только тогда когда на улице температура в диапазоне от -10 до 25 градусов;
         ○ В остальных случаях метод должен возвращать результат - “Оставайтесь дома”; */

    public static int generateRandomAge (int min, int max) {
        int result = (int)(Math.random()*((max-min)+1))+min;
        return result;
        /* Написать метод в котором генерируется случайный возраст
        public static int generateRandomAge(){........}
        ● При вызове метода, который формирует результат “можно ли идти гулять” использовать
        генерирование случайного возраста с помощью метода “generateRandomAge” */

    }
}
