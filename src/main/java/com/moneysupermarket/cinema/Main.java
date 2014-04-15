package com.moneysupermarket.cinema;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: danfaulkner
 * Date: 15/04/2014
 * Time: 10:38
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    static Scanner in = new Scanner(System.in);
    static boolean running = true;
    static Calculator calculator = new Calculator();

    public static void main (String[] args)

    {
        while(running) {
            Movie threePM = new Movie("Gladiator", 1, "3pm");
            Movie sixPM = new Movie("Finding Nemo", 1, "6pm");
            Movie ninePM = new Movie("Gladiator", 1, "9pm");

            System.out.println("###################++WELCOME TO DAN'S CINEMA++###################");
            System.out.println("SELECT VIEWING");
            System.out.println("\nEnter number corresponding with the option below:");
            System.out.println("Option 1." + threePM.getTitle() + " at " + threePM.getStartTime());
            System.out.println("Option 2." + sixPM.getTitle() + " at " + sixPM.getStartTime());
            System.out.println("Option 3." + ninePM.getTitle() + " at " + ninePM.getStartTime());
            System.out.println("#################################################################");

            int movieOption = in.nextInt();
            Movie movieChoice = threePM;
            switch(movieOption) {
                case 1:
                    movieChoice = threePM;
                    break;
                case 2:
                    movieChoice = sixPM;
                    break;
                case 3:
                    movieChoice = ninePM;
                    break;
                default:
                    System.out.println("Invalid. Please Try Again");
                    running = false;
                    break;
            }

            System.out.println("###################++WELCOME TO DAN'S CINEMA++###################");
            System.out.println("HOW MANY STUDENT TICKETS?");
            System.out.println("\n\n\n#################################################################");

            int students = in.nextInt();

            System.out.println("###################++WELCOME TO DAN'S CINEMA++###################");
            System.out.println("HOW MANY CONCESSION TICKETS?");
            System.out.println("\n\n\n#################################################################");

            int concessions = in.nextInt();

            System.out.println("###################++WELCOME TO DAN'S CINEMA++###################");
            System.out.println("HOW MANY UNDER 15 TICKETS?");
            System.out.println("\n\n\n#################################################################");

            int under15s = in.nextInt();

            System.out.println("###################++WELCOME TO DAN'S CINEMA++###################");
            System.out.println("HOW MANY ADULT TICKETS?");
            System.out.println("\n\n\n#################################################################");

            int adults = in.nextInt();

            System.out.println("###################++WELCOME TO DAN'S CINEMA++###################");
            System.out.println("YOUR TICKET");
            System.out.println("FILM: " + movieChoice.getTitle());
            System.out.println("TIME: " + movieChoice.getStartTime());
            System.out.println("SCREEN: " + movieChoice.getScreenNumber());
            System.out.println("\n" + students + " student tickets: £" + calculator.totalPriceOfStudentTickets(students));
            System.out.println(concessions + " concession tickets: £" + calculator.totalPriceConcessionTickets(concessions));
            System.out.println(under15s + " Under 15 tickets: £" + calculator.totalPriceUnder15Tickets(under15s));
            System.out.println(adults + " adults tickets: £" + calculator.totalPriceFullPriceTickets(adults));
            System.out.println("\nTOTAL TO PAY ON ARRIVAL: £" + calculator.totalPriceOfAllTickets(students,concessions,under15s,adults));
            System.out.println("\n\n\n#################################################################");
            System.out.println("Press \"e\" to exit");
            if (in.next()=="e") {
                running = false;
            }
        }
    }

}
