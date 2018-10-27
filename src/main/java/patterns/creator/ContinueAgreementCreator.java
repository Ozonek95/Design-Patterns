package patterns.creator;

public class ContinueAgreementCreator implements Offer {

    private Client client;
    private int price;
    private String details;

    public ContinueAgreementCreator(Client client, int price, String details) {
        this.client = client;
        this.price = price;
        this.details = details;
    }

    public Agreement agreement() {
        return new ContinueAgreement(client,price,details);
    }
}
