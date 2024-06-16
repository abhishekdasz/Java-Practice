// Class AD with a property and a method
public class AD {
    // Property
    private String message;

    // Constructor to initialize the property
    public AD(String message) {
        this.message = message;
    }

    // Method to get the message
    public String getMessage() {
        return message;
    }

    // Method to set a new message
    public void setMessage(String message) {
        this.message = message;
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println("Message: " + message);
    }
}

// Main class Pr1
public class Pr1 {
    public static void main(String[] args) {
        // Creating an instance of AD and initializing it with a message
        AD ad = new AD("Hello, World!");

        // Displaying the message using the method of AD class
        ad.displayMessage();

        // Setting a new message
        ad.setMessage("Goodbye, World!");

        // Displaying the updated message
        ad.displayMessage();
    }    
}
