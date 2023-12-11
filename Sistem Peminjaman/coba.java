import java.util.Scanner;

public class coba {

    static class Playstation {
        String model;
        String status;

        public Playstation(String model, String status) {
            this.model = model;
            this.status = status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }

        public String getModel() {
            return model;
        }
    }

    static class Rental {
        String customerName;
        Playstation playstation;
        String rentalDate;
        String returnDate;

        public Rental(String customerName, Playstation playstation, String rentalDate, String returnDate) {
            this.customerName = customerName;
            this.playstation = playstation;
            this.rentalDate = rentalDate;
            this.returnDate = returnDate;
        }

        public String getCustomerName() {
            return customerName;
        }

        public Playstation getPlaystation() {
            return playstation;
        }

        public String getRentalDate() {
            return rentalDate;
        }

        public String getReturnDate() {
            return returnDate;
        }
    }

    public static void main(String[] args) {
        Playstation ps4 = new Playstation("PS4", "Available");
        Playstation ps5 = new Playstation("PS5", "Available");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Rent Playstation");
            System.out.println("2. Return Playstation");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Playstations:");
                    System.out.println("PS4 - " + ps4.getStatus());
                    System.out.println("PS5 - " + ps5.getStatus());

                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.next();

                    System.out.print("Enter Playstation Model: ");
                    String playstationModel = scanner.next();

                    Playstation selectedPlaystation = null;
                    if (playstationModel.equalsIgnoreCase("PS4") && ps4.getStatus().equalsIgnoreCase("Available")) {
                        selectedPlaystation = ps4;
                        selectedPlaystation.setStatus("Rented");
                    } else if (playstationModel.equalsIgnoreCase("PS5") && ps5.getStatus().equalsIgnoreCase("Available")) {
                        selectedPlaystation = ps5;
                        selectedPlaystation.setStatus("Rented");
                    } else {
                        System.out.println("Selected Playstation is not available.");
                        break;
                    }

                    System.out.print("Enter Rental Date (dd/MM/yyyy): ");
                    String rentalDate = scanner.next();

                    System.out.print("Enter Return Date (dd/MM/yyyy): ");
                    String returnDate = scanner.next();

                    Rental rental = new Rental(customerName, selectedPlaystation, rentalDate, returnDate);
                    System.out.println("Playstation Rented Successfully.");
                    System.out.println("Rental Details:");
                    System.out.println("Customer Name: " + rental.getCustomerName());
                    System.out.println("Playstation Model: " + rental.getPlaystation().getModel());
                    System.out.println("Rental Date: " + rental.getRentalDate());
                    System.out.println("Return Date: " + rental.getReturnDate());
                    break;
                case 2:
                    System.out.println("Available Playstations:");
                    System.out.println("PS4 - " + ps4.getStatus());
                    System.out.println("PS5 - " + ps5.getStatus());

                    System.out.print("Enter Playstation Model: ");
                    playstationModel = scanner.next();

                    if (playstationModel.equalsIgnoreCase("PS4") && ps4.getStatus().equalsIgnoreCase("Rented")) {
                        ps4.setStatus("Available");
                        System.out.println("Playstation Returned Successfully.");
                    } else if (playstationModel.equalsIgnoreCase("PS5") && ps5.getStatus().equalsIgnoreCase("Rented")) {
                        ps5.setStatus("Available");
                        System.out.println("Playstation Returned Successfully.");
                    } else {
                        System.out.println("Selected Playstation is not rented.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }
}