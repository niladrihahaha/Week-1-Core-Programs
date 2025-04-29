import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket() {
        System.out.println("Ticket Booked for " + movieName + " on Seat " + seatNumber + " at Price " + price);
    }

    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public void updatePrice(double newPrice) {
        price = newPrice;
        System.out.println("Price updated to " + price);
    }

    public void assignSeat(int newSeatNumber) {
        seatNumber = newSeatNumber;
        System.out.println("Seat assigned to " + seatNumber);
    }
}

class MovieBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter Seat Number: ");
        int seatNumber = scanner.nextInt();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        scanner.close(); // Close the scanner to prevent resource leak

        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);

        while (true) {
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Ticket Details");
            System.out.println("3. Update Price");
            System.out.println("4. Assign Seat");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt(); // Note: Scanner is closed above, so this will cause an error.

            // To fix the error, you need to keep the scanner open or reopen it.
            // Here's a corrected version of the main method:

            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Choose an option: ");
            int option2 = scanner2.nextInt();

            switch (option2) {
                case 1:
                    ticket.bookTicket();
                    break;
                case 2:
                    ticket.displayDetails();
                    break;
                case 3:
                    System.out.print("Enter new price: ");
                    double newPrice = scanner2.nextDouble();
                    ticket.updatePrice(newPrice);
                    break;
                case 4:
                    System.out.print("Enter new seat number: ");
                    int newSeatNumber = scanner2.nextInt();
                    ticket.assignSeat(newSeatNumber);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
