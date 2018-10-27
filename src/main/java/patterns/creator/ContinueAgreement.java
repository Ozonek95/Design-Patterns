package patterns.creator;

public class ContinueAgreement implements Agreement {

    private Client client;
    private int price;
    private String details;


    public ContinueAgreement(Client client, int price, String details) {
        this.client = client;
        this.price = price;
        this.details = details;
    }

}
