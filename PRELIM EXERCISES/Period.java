// Enum declaration
public enum Period {
    PRELIM, MIDTERM, PREFINAL, FINAL;
}

// Enum usage
Period p;

// Assigning enum constant to variable
p = Period.MIDTERM;

// Nested class declaration
public class RealEstateListing {
    private int listingNumber;
    private double price;
    private HouseData hData;

    // Constructor
    public RealEstateListing(int num, double price, String address, int sqFt) {
        listingNumber = num;
        this.price = price;
        hData = new HouseData(address, sqFt);
    }

    // Display method
    public void display() {
        System.out.println("Listing number #" + listingNumber + " Selling for Php" + price);
        System.out.println("Address: " + hData.streetAddress);
        System.out.println(hData.squareFeet + " square feet");
    }

    // Nested class declaration
    private class HouseData {
        private String streetAddress;
        private int squareFeet;

        // Constructor
        public HouseData(String address, int sqFt) {
            streetAddress = address;
            squareFeet = sqFt;
        }
    }
}

// Regular expression pattern declaration
Pattern p = Pattern.compile("[A-F]{5,}.*");

// Regular expression matcher initialization
String str = "AAAAAhhh";
Matcher match = p.matcher(str);

// Check if pattern matches string
System.out.println(match.matches()); // Returns true
