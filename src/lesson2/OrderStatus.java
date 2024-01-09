package lesson2;

public enum OrderStatus {
    ACTIVE("In progress"),
    PAYED("Successfully payed"),
    DELIVERED("Delivered");

    private final String messageForUser;

    OrderStatus(String messageForUser) {
        this.messageForUser = messageForUser;
    }

    public void printMessageForUser(){
        System.out.println("Order status: " + messageForUser );
    }
}
