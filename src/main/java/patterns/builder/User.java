package patterns.builder;

public class User {
    public String password;

    public String login;

    public String phoneNumber;
    public String emailAdress;

    User(String password, String login) {
        this.password = password;
        this.login = login;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public void persist() {

    }

    public static class UserBuilder {

        User user;

        public UserBuilder(String login, String password) {

            user = new User(login,password);
        }

        public void setPhoneNumber(String phoneNumber) {

            user.phoneNumber = phoneNumber;
        }

        public void setEmailAddress(String emailAdress) {

            user.setEmailAdress(emailAdress);
        }
        public User build(){
            return user;
        }
    }
}
