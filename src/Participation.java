/*
 * Project: Game
 * Math puzzles game - 7 questions
 * Author:  Michael Muehlberger
 * Last Change: 18.04.2023
 */


public class Participation {
    
    private static int[][] numbersArrays = new int[7][2];

    private static double[] resultsArray = new double[7];
    private static String[] opArray = new String[7];
    private static double[] timeArray = new double[7];
    private static int correctAnswers = 0;

    //GETTERS
    public static int getNumbersArrays(int index1, int index2) {
        return numbersArrays[index1][index2];
    }

    public static String getOpArray(int index) {
        return opArray[index];
    }

    public static double getTimeArray(int index) {
        return timeArray[index];
    }

    public static double getResults(int index) {
        return resultsArray[index];
    }

    public static int getCorrectAnswers() {
        return correctAnswers;
    }


    //SETTERS

    public static void setNumbersArrays(int index1, int index2, int num) {
        numbersArrays[index1][index2] = num;
    }

    public static void setOpArray(int index, String setString) {
        opArray[index] = setString;
    }

    public static void setTimeArray(int index, double time) {
        timeArray[index] = time;
    }

    public static void setResults(int index, double result) {
        resultsArray[index] = result;
    }

    public static void setCorrectAnswers(int correctAnswers) {
        Participation.correctAnswers = correctAnswers;
    }

}

