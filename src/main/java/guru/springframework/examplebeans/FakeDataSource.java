package guru.springframework.examplebeans;

public class FakeDataSource {

    private String user;
    private String password;
    private String url;

    public String getUser() {
        return user;
    }

    public FakeDataSource setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public FakeDataSource setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public FakeDataSource setUrl(String url) {
        this.url = url;
        return this;
    }
}
