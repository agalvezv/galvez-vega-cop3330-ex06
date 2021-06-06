package challenge6;

import java.util.Scanner;
//import java.util.Date;
import java.util.Calendar;

public class Challenge6 {

    public static void main(String[] args) {
        System.out.println("What is your current age?");
        Scanner inputs = new Scanner(System.in);
        String currentAgeS = inputs.nextLine();
        int currentage = Integer.parseInt(currentAgeS);

        System.out.println("At what age would you like to retire?");
        String retireAgeS = inputs.nextLine();
        int retireage = Integer.parseInt(retireAgeS);

        System.out.println("You have " + (retireage-currentage) + " years until you can retire.");

        //Date now = new Date();
        //int year = (now.getYear()+1900);
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        //System.out.println(year);

        System.out.println("It's " + year + ", so you can retire in " + ((retireage-currentage)+year) + ".");


    }
}
