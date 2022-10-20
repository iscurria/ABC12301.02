import java.util.Scanner;

/**
 * Document this class
 * @version 10.03.2022
 * @author 24scurria
 */

public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    /**
     * Asking the user for some information
     */
    public void promptUser() {
        System.out.println("* Sit yourself down, take a seat *\n" +
                "* All you gotta do is repeat after me *");
       Scanner in = new Scanner(System.in);
        System.out.print("Question 1: What is your name? ");
        name = in.nextLine();
        System.out.print("Question 2: How old are you? ");
        age = in.nextInt();
        System.out.print("Question 3: What is your favorite number? ");
        favNumber = in.nextInt();
        System.out.println("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
    }


    /**
     * Reprinting and modifying the info the user supplied the program
     */
    public void printInfo() {
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("At your next birthday, you will be: " + (age+1));
        System.out.println("The first prime factor of " + age + " is: " + smallestPrimeFactor(age));
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: " + (favNumber * favNumber));
        System.out.println("* end of program *");
    }


    private boolean isPrime(int num)    {
        for(int i = 2; i <= Math.sqrt(num); i++)  {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    private int smallestPrimeFactor(int num) {
        for(int i = 2; i < Math.sqrt(num)+1; i++) {
            if(isPrime(i)) {
                if(num % i == 0)
                    return i;
            }
        }
        return num;
    }

    /**
     * main method for class SimpleIOMath
     * @param args command-line arguments, if needed
     */
    public static void main(String[] args) {
        SimpleIOMath app = new SimpleIOMath();
        app.promptUser();
        app.printInfo();
    }
}
