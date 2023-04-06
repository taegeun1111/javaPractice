package memberShip;

public class user {
    private String user;
    private String id;
    private String pw;

    public user(String user, String id, String pw) {
        this.user = user;
        this.id = id;
        this.pw = pw;
    }

    public user() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
