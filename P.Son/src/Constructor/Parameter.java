package Constructor;

public class Parameter {
    public String username;
    public String password;
    
    public Parameter (String username, String password){
        this.username = username;
        this.password = password;
    }
}


class RunConstruktor{
    public static void main(String[] args) {
        Parameter petani = new Parameter("akbar", "oppo");
        System.out.println("Username: " + petani.username);
        System.out.println("Password: " + petani.password);
    }
}