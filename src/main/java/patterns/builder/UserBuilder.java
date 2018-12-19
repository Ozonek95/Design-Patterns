package patterns.builder;

class UserBuilder {

//    private String password;
//    private String login;
//    private String phoneNumber;
//    private String emailAdress;
//
//    public UserBuilder(String login, String password) {
//        this.login = login;
//        this.password = password;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public void setEmailAddress(String emailAdress) {
//        this.emailAdress = emailAdress;
//    }
//    public User build(){
//        User user = new User(login, password);
//
//        if (emailAdress != null) {
//            user.setEmailAdress(emailAdress);
//        }
//
//        return user;
//    }

    private User user;

    UserBuilder(String login, String password) {

        user = new User(login,password);
    }

    void setPhoneNumber(String phoneNumber) {

        user.setPhoneNumber(phoneNumber);
    }

    void setEmailAddress(String emailAdress) {

        user.setEmailAdress(emailAdress);
    }
    User build(){
       return user;
    }
}
