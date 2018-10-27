package patterns.creator;

public class NewAgreement implements Agreement{
    private Client client;
    private int price;
    private String details;


    public NewAgreement(Client client, int price, String details) {
        this.client = client;
        this.price = price;
        this.details = details;
    }


}
