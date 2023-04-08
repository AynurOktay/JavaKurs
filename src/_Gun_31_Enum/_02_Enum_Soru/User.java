package _Gun_31_Enum._02_Enum_Soru;

public class User {

   String username;
   Role role;
   Statu statu;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }

    public User(String username, Role role, Statu statu) {
        this.username = username;
        this.role = role;
        this.statu = statu;


    }
}

