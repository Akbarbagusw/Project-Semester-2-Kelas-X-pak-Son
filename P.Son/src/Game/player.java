package Game;

public class player {
    //definisi atribut / variable
    String name;
    int speed;
    int healthPoin;
    
    //definisi method / fungsi run
    void run(){
        System.out.println(name+ " is running....");
        System.out.println("Speed : "+speed);
    }
    
    //definisi method / fungsi isDead untuk mengecek nilai kesehatan (healthPoin)
    boolean isDead(){
        if(healthPoin <= 0)return true;
        return false;
    }
}
