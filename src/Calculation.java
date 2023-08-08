/*
 * Project: Game
 * Math puzzles game - 7 questions
 * Author:  Michael Muehlberger
 * Last Change: 18.04.2023
 */

import java.util.Random;
import java.lang.Math;

public class Calculation {

    private static Random randomgen = new Random();
    private static int randomNum = 0;

    public static int getRandoNum(){

        final int UPPER_BOUND = 500;
        final int LOWER_BOUND = -100;

        randomNum = randomgen.nextInt(UPPER_BOUND + 1 - LOWER_BOUND) + LOWER_BOUND;

        return randomNum;
    }

    public static String genOperation(){

        Random randomgen = new Random();

        randomNum = randomgen.nextInt(4) + 1;

        switch(randomNum){
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "*";
            case 4:
                return "/";
        }

        return "+";
    }

    public static double  calculateResult(double num1, double num2, String operator){

        double res = 1;

        switch (operator){

            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                res = num1/num2;
                res = 100*res;
                res = Math.round(res);
                res = res / 100;
                return res;

        }

        return 1.0;

    }



}
