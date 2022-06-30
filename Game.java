import javax.naming.PartialResultException;
import java.util.Objects;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("The game is about to start...");
        System.out.println("Booting up...");
        Thread.sleep(500);
        System.out.println("...");
        Thread.sleep(500);
        System.out.println("...");
        Thread.sleep(500);
        System.out.println("...");
        Thread.sleep(500);
        System.out.println("Game ready.");

        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Hi there. Please enter your name below?");
        String name = input.nextLine();
        Thread.sleep(500);
        System.out.println();
        System.out.println("Hi, " + name + " --- Welcome to The Mars Adventure Game!");
        Thread.sleep(500);
        System.out.println();
        System.out.println("Yesterday, you received a call from your good friend at NASA.");
        Thread.sleep(500);
        System.out.println();
        System.out.println("They need someone to go to Mars this weekend, and you've been chosen.");
        Thread.sleep(500);
        System.out.println();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Are you excited? Type Yes or No");
        Thread.sleep(500);
        String yes = input2.nextLine().toUpperCase();
        System.out.println();
        System.out.println(name + ", I knew you'd say " + yes + "! It's cool that you're going to Mars!");
        Thread.sleep(500);
        System.out.println();
        System.out.println("It's time to pack for your trip to Mars!");
        Thread.sleep(500);
        System.out.println();
        Scanner input3 = new Scanner(System.in);
        System.out.println("How many suitcases do you plan to bring?");
        int num = Integer.parseInt(input3.nextLine());

            if (num > 2) {
                Thread.sleep(500);
                System.out.println();
                System.out.println("That's way too many. You'll have to pack more lightly.");
            } else{
                Thread.sleep(500);
                System.out.println();
                System.out.println("Let's go!");
            }

        Thread.sleep(500);
        System.out.println();

        System.out.println("You're allowed to bring one companion animal with you.\n" +
                "What kind of companion animal would you like to bring?");
        Scanner input4 = new Scanner(System.in);
        String animal = input4.nextLine();
        System.out.println("What is your companion's name?");
        Scanner input5 = new Scanner(System.in);
        String animalName = input5.nextLine();
        Thread.sleep(500);
        System.out.println();
        System.out.println("Cool, so you're bringing " + animalName + " the " + animal + "!");

        Thread.sleep(500);
        System.out.println();
        System.out.println("NASA has a interior design team offering to outfit your space ship.\n" +
                "You have a couple of options for the interior decor of your ship.");
        Thread.sleep(500);
        System.out.println();
        System.out.println("Your options are:\n" +
                " A  Sleek, modern minimalism\n" +
                " B  Retro/vintage space age\n" +
                " C  SF Hippie chic\n" +
                "Which decor would you like? Choose A, B, or C.");

        Scanner input6 = new Scanner(System.in);
        String answer = input6.nextLine().toUpperCase();

        if (Objects.equals(answer, "A")) {
            Thread.sleep(500);
            System.out.println();
            System.out.println("I can see it now:\n" +
                    name + " and " + animalName + " the " + animal + " will be surfing the celestial abyss ...\n" +
                    "in a sleek modern minimalism spaceship.");
        } else if (Objects.equals(answer, "B")) {
            Thread.sleep(500);
            System.out.println();
            System.out.println("I can see it now:\n" +
                    name + " and " + animalName + " the " + animal + " will be surfing the celestial abyss ...\n" +
                    "in a retro/vintage spaceship.");
        } else if (Objects.equals(answer, "C")) {
            Thread.sleep(500);
            System.out.println();
            System.out.println("I can see it now:\n" +
                    name + " and " + animalName + " the " + animal + " will be surfing the celestial abyss ...\n" +
                    "in a SF hippie chic spaceship.");
        }

        Thread.sleep(2000);
        System.out.println();
        System.out.println(name + " -- " + "the day is here!\n" +
                "You crawl into the spaceship with " + animalName);
        Thread.sleep(2000);
        System.out.println("Brace for take off!");
        System.out.println();
        Thread.sleep(1500);
        System.out.println("5 ...");
        System.out.println();
        Thread.sleep(1500);
        System.out.println("4 ...");
        System.out.println();
        Thread.sleep(1500);
        System.out.println("3 ...");
        System.out.println();
        Thread.sleep(1500);
        System.out.println("2 ...");
        System.out.println();
        Thread.sleep(1500);
        System.out.println("1 ...");
        System.out.println();
        Thread.sleep(1500);
        System.out.println("*** LIFTOFF ***");

    }
}
