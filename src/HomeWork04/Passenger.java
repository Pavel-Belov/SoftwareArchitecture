package HomeWork04;

public class Passenger {
    private int id;
    private String fio;
    private Long cardNumber;
    private Long hashPassword;
    private String login;

    public Passenger(int id, String fio, Long cardNumber, Long hashPassword, String login) {
        this.id = id;
        this.fio = fio;
        this.cardNumber = cardNumber;
        this.hashPassword = hashPassword;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public String getLogin() {
        return login;
    }

    public Long getHashPassword() {
        return hashPassword;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setHashPassword(Long hashPassword) {
        this.hashPassword = hashPassword;
    }
}
