package patterns.builder;

public class UserCrudController {

    void create(ClientData clientData){

        if(makeLoginAndPasswordAreSent(clientData)){
            User user = createUser(clientData);
            user.persist();
        }else {
            informThisIsBad();
        }

    }

    private void informThisIsBad() {
        throw new BadDataException();
    }

    private boolean makeLoginAndPasswordAreSent(ClientData clientData) {
        return true;
    }

    private User createUser(ClientData clientData) {

        UserBuilder builder = new UserBuilder(clientData.login,clientData.password);

        if(hasPhoneNumber(clientData)){
            builder.setPhoneNumber(clientData.phoneNumber);
        }
        if(hasEmailAddress(clientData)){
            builder.setEmailAddress(clientData.emailAdress);
        }

        return builder.build();
    }

    private boolean hasEmailAddress(ClientData clientData) {
        return true;
    }

    private boolean hasPhoneNumber(ClientData clientData) {
        return true;
    }


}
