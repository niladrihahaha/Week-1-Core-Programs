import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public void displayDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

class ShoppingCart {
    private ArrayList<CartItem> cart = new ArrayList<>();

    public void addItem(CartItem item) {
        cart.add(item);
        System.out.println("Item added to cart: " + item.itemName);
    }

    public void removeItem(String itemName) {
        for (CartItem item : cart) {
            if (item.itemName.equals(itemName)) {
                cart.remove(item);
                System.out.println("Item removed from cart: " + itemName);
                return;
            }
        }
        System.out.println("Item not found in cart: " + itemName);
    }

    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cart) {
            item.displayDetails();
            totalCost += item.calculateTotalCost();
        }
        System.out.println("Total Cart Cost: " + totalCost);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Item to Cart");
            System.out.println("2. Remove Item from Cart");
            System.out.println("3. Display Cart Details");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    CartItem item = new CartItem(itemName, price, quantity);
                    cart.addItem(item);
                    break;
                case 2:
                    System.out.print("Enter Item Name to remove: ");
                    String removeItemName = scanner.nextLine();
                    cart.removeItem(removeItemName);
                    break;
                case 3:
                    cart.displayTotalCost();
                    break;
                case 4:
                    scanner.close(); // Close the scanner
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}

