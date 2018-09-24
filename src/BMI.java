import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        //declare
        String name;
        int heightFt, heightIn, heightSub, heightTotal, weight;
        float heightM, bmi;
        double  weightKg;
        Scanner keyboard;

//initializing
        keyboard = new

                Scanner(System.in);

        System.out.println("Hello! Welcome to the BMI Tester made by CarbonAkula. May I ask your name?");

        name = keyboard.nextLine();

        System.out.println("It's nice to meet you, " + name + ". Please enter how many whole feet you are tall:");

        heightFt = keyboard.nextInt();

        System.out.println("Please enter how many additional inches you are tall:");

        heightIn = keyboard.nextInt();

        System.out.println("Please enter how much you weigh in pounds:");

        weight = keyboard.nextInt();

        heightSub = heightFt * 12;
        heightTotal = heightSub + heightIn;
        heightM = heightTotal * 0.0254f;
        weightKg = weight * 0.453592f;
        bmi = (float) weightKg / (heightM * heightM);

        System.out.println("Your BMI is " + bmi +". Thank you, " + name + "!");


    }
}