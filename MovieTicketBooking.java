import java.util.Scanner;
class MovieTicket {
    private String movieName;
    private int ticketPrice;
    private int numberOfTickets;
    MovieTicket(String movieName, int ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public int calculateAmount() {
        return ticketPrice * numberOfTickets;
    }

    public void displayTicket() {
        System.out.println("\n----- BOOKING DETAILS -----");
        System.out.println("Movie Name      : " + movieName);
        System.out.println("Ticket Price    : ₹" + ticketPrice);
        System.out.println("No. of Tickets  : " + numberOfTickets);
        System.out.println("Total Amount    : ₹" + calculateAmount());
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== MOVIE LIST =====");
        System.out.println("1. Pushpa 2 - ₹200");
        System.out.println("2. Kalki - ₹250");
        System.out.println("3. Salaar - ₹180");

        System.out.print("Choose Movie (1-3): ");
        int choice = sc.nextInt();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        MovieTicket booking = null;

        if (choice == 1) {
            booking = new MovieTicket("Pushpa 2", 200, tickets);
        } else if (choice == 2) {
            booking = new MovieTicket("Kalki", 250, tickets);
        } else if (choice == 3) {
            booking = new MovieTicket("Salaar", 180, tickets);
        } else {
            System.out.println("Invalid Movie Selection!");
            sc.close();
            return;
        }
        booking.displayTicket();
        sc.close();
    }
}
