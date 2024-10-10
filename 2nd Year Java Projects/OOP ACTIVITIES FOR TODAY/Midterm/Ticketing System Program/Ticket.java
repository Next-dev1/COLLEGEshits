public class Ticket {
    // Private fields for encapsulation
    private int ticketId;
    private String eventName;
    private String customerName;
    private boolean booked;

    // Constructor
    public Ticket(int ticketId, String eventName, String customerName, boolean booked) {
        this.ticketId = ticketId;
        this.eventName = eventName;
        this.customerName = customerName;
        this.booked = booked;
    }

    // Getters and Setters
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket(6969, "Concert", "Coco Martin", true);
        System.out.println("Ticket ID: " + ticket.getTicketId());
        System.out.println("Event Name: " + ticket.getEventName());
        System.out.println("Customer Name: " + ticket.getCustomerName());
        System.out.println("Booked: " + ticket.isBooked());
    }
}
