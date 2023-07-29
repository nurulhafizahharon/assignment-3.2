public class ControlAssignment {
    public static void main(String args[]) {
        // Task 1. Determine if a number is divisible by 3, 5 or both.
        int numToTest = 995;
        boolean isDivisible;
        // Add code here
        if (numToTest % 15 == 0) {
            System.out.println(numToTest + " is divisible by 3 and 5");
        } else if (numToTest % 5 == 0) {
            System.out.println(numToTest + " is divisible by 5");
        } else if (numToTest % 3 == 0) {
            System.out.println(numToTest + " is divisible by 3");
        } else {
            System.out.println(numToTest + " is not divisible by 3 or 5");
        }

        /*
         * Task 2. Given a sample budget, determine what to ride given the following
         * conditions:
         * - if budget is greater than 100, ride a taxi
         * - if budget is between 50 to 100, ride train
         * - if budget is between 20 to 49, ride bus
         * - if budget is between 0 to 19, walk
         * 
         * Reference: What is enum? https://www.w3schools.com/java/java_enums.asp
         */
        float budget = 72.7f;
        enum TransportMode {
            TAXI,
            TRAIN,
            BUS,
            WALK
        }

        TransportMode mode = TransportMode.WALK;
        // Add code here
        if (budget > 100) {
            mode = TransportMode.TAXI;
            System.out.println("Your budget is " + budget + ".\nYou got to ride a " + mode);
        } else if (budget >= 50 && budget <= 100) {
            mode = TransportMode.TRAIN;
            System.out.println("Your budget is " + budget + ".\nYou got to ride a " + mode);
        } else if (budget >= 20 && budget <= 49) {
            mode = TransportMode.BUS;
            System.out.println("Your budget is " + budget + ".\nYou got to ride a " + mode);
        } else if (budget >= 0 && budget <= 19) {
            mode = TransportMode.WALK;
            System.out.println("Your budget is " + budget + ".\nYou got to " + mode);
        }

        /*
         * Task 3. Use a switch case to determine the zodiac animal given a number from
         * 1 to 12. (1 - rat, 2 - ox, 3 - tiger, etc.)
         * 
         * Code Challenge: Delcare and use enum for your zodiac
         * 
         */

        int animalNumber = 7;

        // Add code here
        enum Zodiac {
            RAT, OX, TIGER, RABBIT, DRAGON, SNAKE, HORSE, GOAT, MONKEY, ROOSTER, DOG, PIG
        }

        Zodiac zodiacAnimal = switch (animalNumber) {
            case 1 -> Zodiac.RAT;
            case 2 -> Zodiac.OX;
            case 3 -> Zodiac.TIGER;
            case 4 -> Zodiac.RABBIT;
            case 5 -> Zodiac.DRAGON;
            case 6 -> Zodiac.SNAKE;
            case 7 -> Zodiac.HORSE;
            case 8 -> Zodiac.GOAT;
            case 9 -> Zodiac.MONKEY;
            case 10 -> Zodiac.ROOSTER;
            case 11 -> Zodiac.DOG;
            case 12 -> Zodiac.PIG;
            default -> null;
        };

        System.out.println("The zodiac animal is " + zodiacAnimal);
    }

}
