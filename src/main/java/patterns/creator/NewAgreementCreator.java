package patterns.creator;

public class NewAgreementCreator implements Offer{

    private Client client;
    private int price;
    private String details;

    public NewAgreementCreator(Client client, int price, String details) {
        this.client = client;
        this.price = price;
        this.details = details;
    }

    public Agreement agreement() {
       return new NewAgreement(client,price,details);
    }
}
