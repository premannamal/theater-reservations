import java.util.*;
public class TheaterReservations {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
                System.out.println("Please enter the date on which you want to go for the movie:");
                String movie_date = scanner.nextLine();
                System.out.println("Please enter the number of tickets you need:");
                int number_of_tickets = scanner.nextInt();

                //System.out.println(number_of_tickets+" "+ "ticket(s) reserved for "+ movie_date + " under " + name);
                String[] name_array = name.split("\\ ");

                if ( number_of_tickets > 1 )
                {System.out.println(number_of_tickets+" "+ "ticket(s) reserved for "+ movie_date + " under " + name_array[1] + ", " + name_array[0]);         }
                else {System.out.println(number_of_tickets+" "+ "ticket reserved for "+ movie_date + " under " + name_array[1] + ", " + name_array[0]);}
}}

//
//        System.out.println(billingStreet);
//        System.out.println(billingCity + * , * + billingState + * * + shippingZipCode );
//
//public static String formatAddress(String street, String city, String state, String zip);
//    return String.format("ks, ks ks/n", street, city, state, zip);
//
//        }
//
//        public static String formatAdd