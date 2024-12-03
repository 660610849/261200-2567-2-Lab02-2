public class Book {
    String title;
    String author;
    Double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, Double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Update the price of the book
    public void updatePrice(double newPrice) {
        if (newPrice < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        price = newPrice;
    }

    // Apply a discount to the price
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage <= 0.0 || discountPercentage >= 100.0) {
            System.out.println("Error: Discount percentage must be greater than 0.0 and less than 100.0.");
            return;
        }
        double discountAmount = price * (discountPercentage / 100);
        price -= discountAmount; // Update the price with the discounted value
        System.out.printf("Discount of %.2f%% applied. Updated price: %.2f%n", discountPercentage, price);
    }
    }
