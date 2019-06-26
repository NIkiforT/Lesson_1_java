package com.company;

public class Main {
    public static void main(String[] args) {
        // Пункт_2
        byte numByte = 12;
        short numShort = 3453;
        char numChar = 'f';
        int numInt = 23457;
        long numLong = 234567898876L;
        float numFloat = 123.3f;
        double numDouble = 1241.54;
        boolean isTrue = true;
        String str = "string";

        // Пункт_3
        int x = getNum(2, 3, 4, 5);

        // Пункт_4
        boolean punkt4 = sumNum(23, -5);
        System.out.println(punkt4);

    }

    // Пункт_3
    static int getNum(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    // Пункт_4
    public static boolean sumNum(int numFirst, int numSecond) {
        int sumNumFirstNumSecond;
        sumNumFirstNumSecond = numFirst + numSecond;
        if ((sumNumFirstNumSecond > 10) && (sumNumFirstNumSecond <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    // Пункт_5
    static void punkt5(int numPunkt5) {
        if (numPunkt5 >= 0) {
            System.out.println("Число поожительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // Пункт_6
    static boolean punkt6(int numPunkt6) {
        if (numPunkt6 < 0) {
            return true;
        }
        return false;
    }

    // Пункт_7
    static void punkt7 (String Name){
        System.out.println("Привет, " + Name);
    }

    // Пункт_8
    static void punkt8 (int Year){
        if ((Year % 4 == 0) && !(Year % 100 == 0) || (Year % 400 == 0) ){
            System.out.println("Год високосный");
        }else {
            System.out.println("Год не високосный");
        }
    }
}





