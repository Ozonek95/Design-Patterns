package patterns.creator;

public class ServiceProposingAgreement {


    void signAgreement(Client client){
        Offer offer = createOffer(client);
        if(verify(offer)){
             offer.agreement();
        }
    }

    private Offer createOffer(Client client) {

        Offer offer;
        if(client.isNew()){
            offer = new NewAgreementCreator(client,2000,"Desc");
        }
        else {
            offer = new ContinueAgreementCreator(client,3000,"Desc");
        }


        return offer;
    }


    boolean verify(Offer offer){
        return true;
    }

}
