package Game;

public class game {
    public static void main(String[] args) {
        
        //membuat object player
        player petani = new player();
        
       //mengisi atribut player
       petani.name = "Akbar";
       petani.speed = 90;
       petani.healthPoin = 1;
       
       //menjalankan method / fungsi
       petani.run();
       
       if(petani.isDead()){
           System.out.println("Game Over!");
       }
    }
}
