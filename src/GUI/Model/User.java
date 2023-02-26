package GUI.Model;

public class User {
    private int userId;
    private String UserName;
    private String Password;
    private String Email;
    public User(){

    }
    public User(int userId, String UserName, String Password, String Email) {
        this.userId = userId;
        this.UserName = UserName;
        this.Password = Password;
        this.Email = Email;
    }
    public User(String UserName, String Password, String Email) {
        this.UserName = UserName;
        this.Password = Password;
        this.Email = Email;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
}