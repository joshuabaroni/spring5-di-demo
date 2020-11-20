package guru.springframework.examplebeans;

public class FakeJMSBroker {

    private String user;
    private String password;
    private String url;

    public String getUser() {
        return user;
    }

    public FakeJMSBroker setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public FakeJMSBroker setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public FakeJMSBroker setUrl(String url) {
        this.url = url;
        return this;
    }
}
