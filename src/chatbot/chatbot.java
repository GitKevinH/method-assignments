package chatbot;

import java.util.Scanner;

public class chatbot {
    public static void main(String[] args) {
        greeting();
        repeatName();
        guessAge();
        testKnowledge();
    }
    public static void greeting(){
        System.out.println("Hello User!");

    }
    public static void repeatName(){
        System.out.println("Can you repeat to me your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Thanks, "+name);
    }

    public static void guessAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's try to guess your age range!");
        //75+
        System.out.println("Were you alive during Franklin Roosevelt's presidency? Enter y for yes, or n for no.");
        String inputOne = scanner.nextLine();
        while (!inputOne.equalsIgnoreCase("y") && !inputOne.equalsIgnoreCase("n")){
            System.out.println("enter y or n");
            inputOne = scanner.nextLine();
        }
        //60-75
        System.out.println("Were you living through the Vietnam war? Enter y for yes, or n for no.");
        String inputTwo = scanner.nextLine();
        while (!inputTwo.equalsIgnoreCase("y") && !inputTwo.equalsIgnoreCase("n")){
            System.out.println("enter y or n");
            inputTwo = scanner.nextLine();
        }
        //50-60
        System.out.println("Were you alive during the Watergate scandal? Enter y for yes, or n for no.");
        String inputThree = scanner.nextLine();
        while (!inputThree.equalsIgnoreCase("y") && !inputThree.equalsIgnoreCase("n")){
            System.out.println("enter y or n");
            inputThree = scanner.nextLine();
        }
        //40-50
        System.out.println("Were you alive when Michael Jackson's Thriller album was taking over? Enter y for yes, or n for no.");
        String inputFour = scanner.nextLine();
        while (!inputFour.equalsIgnoreCase("y") && !inputFour.equalsIgnoreCase("n")){
            System.out.println("enter y or n");
            inputFour = scanner.nextLine();
        }
        //30-40
        System.out.println("Were you alive when the internet was just picking up steam? Enter y for yes, or n for no.");
        String inputFive = scanner.nextLine();
        while (!inputFive.equalsIgnoreCase("y") && !inputFive.equalsIgnoreCase("n")){
            System.out.println("enter y or n");
            inputFive = scanner.nextLine();
        }
        //20-30
        System.out.println("Were you alive during 9-11? Enter y for yes, or n for no.");
        String inputSix = scanner.nextLine();
        while (!inputSix.equalsIgnoreCase("y") && !inputSix.equalsIgnoreCase("n")){
            System.out.println("enter y or n");
            inputSix = scanner.nextLine();
        }
        //under 20
        System.out.println("Did COVID hit while you were in grade school? Enter y for yes, or n for no.");
        String inputSeven = scanner.nextLine();
        while (!inputSeven.equalsIgnoreCase("y") && !inputSeven.equalsIgnoreCase("n")){
            System.out.println("enter y or n");
            inputSeven = scanner.nextLine();
        }
            if (inputOne.equals("y")){
                System.out.println("I'm guessing you're 75+ years old!");
            }
            else if (inputTwo.equals("y")) {
                System.out.println("I'm guessing you're 60-75 years old!");
            }
            else if (inputThree.equals("y")){
                System.out.println("I'm guessing you're 50-60 years old!");
            }
            else if (inputFour.equals("y")){
                System.out.println("I'm guessing you're 40-50 years old!");
            }
            else if (inputFive.equals("y")){
                System.out.println("I'm guessing you're 30-40 years old!");
            }
            else if (inputSix.equals("y")){
                System.out.println("I'm guessing you're 20-30 years old!");
            }
            else if (inputSeven.equals("y")){
                System.out.println("I'm guessing you're under 20 years old!");
            }


        //75+
        //60-75
        //50-60
        //40-50
        //30-40
        //20-30

        //under 20
    }

    public static void countingTo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number do you want to count to?");
        int num = scanner.nextInt();
        int counter = 1;
        while (counter<=num){
            System.out.println(counter);
            counter++;
        }

    }

    public static void testKnowledge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer this question by entering the letter to the corresponding answer below: " +
                "Which of one of these are considered a primitive data type?");

        System.out.println("A: String");
        System.out.println("B: Array");
        System.out.println("C: Class");
        System.out.println("D: int");

        String input = scanner.nextLine();

        while (true){

            if ( !input.equalsIgnoreCase("d")){
                System.out.println("Wrong answer! Please try again.");
                input = scanner.nextLine();
            }
            else {
                System.out.println("You're right! The answer is 'D: int' ");
                return;
            }

        }
    }

}
