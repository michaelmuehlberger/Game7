/*
 * Project: Game
 * Math puzzles game - 7 questions
 * Author:  Michael Muehlberger
 * Last Change: 18.04.2023
 */


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        double time = 0;
        double avgTime = 0;
        int number1 = 0;
        int number2 = 0;
        double result = 0;
        double checkResult;
        int counter = 0;
        boolean validNum = false;
        String operator = "";
        Scanner scanner = new Scanner(System.in);



        for(int i = 0; i<7; i++){

            number1 = Calculation.getRandoNum();
            number2 = Calculation.getRandoNum();
            operator = Calculation.genOperation();

            time = System.currentTimeMillis();

            validNum = false;

            System.out.print("Please enter the result of: ");
            System.out.printf(number1 + " " + operator + " " + number2 + " = ");

            while(!validNum){
                try{
                    result = Double.parseDouble(scanner.nextLine());
                    validNum = true;
                } catch (NumberFormatException e){
                    System.out.println("Please enter a valid result!");
                    System.out.print("Result of: ");
                    System.out.printf(number1 + " " + operator + " " + number2 + " = ");
                }
            }

            time = ((System.currentTimeMillis() - time) / 1000.0);

            Participation.setNumbersArrays(i, 0, number1);
            Participation.setNumbersArrays(i, 1, number2);
            Participation.setOpArray(i, operator);
            Participation.setTimeArray(i, time);
            Participation.setResults(i, result);

        }

        System.out.println();

        for(int i=0; i<7; i++){

            counter++;
            System.out.printf("Calculation " + counter + ":\n  ");

            number1 = Participation.getNumbersArrays(i, 0);
            number2 = Participation.getNumbersArrays(i, 1);
            operator = Participation.getOpArray(i);
            result = Participation.getResults(i);

            System.out.printf(number1 + " " + operator + " " + number2 + " = " + result + "\n");

            checkResult = Calculation.calculateResult(number1,number2,operator);

            if (checkResult == result){
                Participation.setCorrectAnswers(Participation.getCorrectAnswers() + 1);

                System.out.println("  Correct: true");
            }
            else {
                System.out.println("  Correct: false");
            }

            time = Participation.getTimeArray(i);
            avgTime = avgTime + time;

            System.out.printf("  Time needed: %.2f sec\n\n", time);
        }

        avgTime = avgTime/7;
        System.out.printf("Average time needed: %.2f sec\n", avgTime);

        if(Participation.getCorrectAnswers() == 7){
            System.out.println("Congratulations - you answered all questions correctly!");
        }

    }
}
