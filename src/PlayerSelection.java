import java.util.Scanner;

public class PlayerSelection {
    private static Object jersey_number;

    //input details

    public static void main(String[] args) {
        System.out.println("Enter the details:");
        Scanner details = new Scanner(System.in);

        System.out.println("Enter name");
        String name = details.nextLine();

        System.out.println("Enter age");
        int age = details.nextInt();

        System.out.println("Enter height");
        float height = details.nextFloat();

        System.out.println("Enter weight");
        int weight = details.nextInt();

        System.out.println("Enter jersey number");
        int jersey_number = details.nextInt();

        //conversion

        final float pound = 0.45359237f;
        final int  meter = 100;
        float kilograms = weight * pound;
        float centimeters = height * meter;

        //eligibility check
        String eligibility;
        if ((age>= 18 && age<= 35) && ( weight> 0 && weight < 90)){
             eligibility = "Eligible" ;
        }

        else {
            eligibility = "Not eligible";
        }

        //player category identification

        String category;

        if(age < 20){
            category = "Rising Star";
        }
        else if(age >= 20 && age <= 30){
            category = "Prime Player";
        }
        else{
            category = "Veteran";
        }


        //attacker
        String attacker;
        switch(jersey_number){
            case 7,9,10,11:
                attacker = "Yes";
                break;
            default:
                attacker = "No";
                break;
        }


        //player position
        String position;
        switch(jersey_number){
            case 1:
                position = "Goalkeeper";
                break;

            case 2:
            case 5:
                position = "Defender";
                break;


            case 6:
            case 8:
                position = "Midfielder";
                break;

            case 7:
            case 11:
                position = "Winger";
                break;


            case 9:
                position = "Striker";
                break;

            case 10:
                position = "Playmaker";
                break;


            default:
                position = "Player position not known";
        }

        //lineup decision
        String decision;

        if(category == "Prime player") {
            if (weight < 80) ;
            decision = "Start lineup";
        }

        else{
            decision = "Bench";

        }

        String finaldecision;
        if ((age >= 18 && age <= 35) && weight < 90){
            finaldecision = "Play";
        }
        else {
            finaldecision = "Rest";
        }




        //Report
        System.out.println("PLAYER REPORT");
        System.out.println("Player name: " + name);
        System.out.println("Age - " + age + " ( " + category + " )");
        System.out.println("Height: " + centimeters + " cm");
        System.out.println("Weight in kilograms: " + weight +" kg");
        System.out.println("Jersey Number: " + jersey_number);
        System.out.println("Position: " +position);
        System.out.println("Attacker jersey: " + attacker);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Lineup Decision: " + decision);
        System.out.println("Final Decision: " + finaldecision);




}}
