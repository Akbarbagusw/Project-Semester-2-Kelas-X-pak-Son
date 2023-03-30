package Constructor;

public class User {
    private String username;
    private String password;
    
    public User(){
        System.out.println("Eksekusi method construktor");
    }
}

class DemoConstruktor{
    public static void main(String[] args) {
        User petani = new User();
    }
}
