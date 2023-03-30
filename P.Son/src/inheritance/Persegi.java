package inheritance;

public class Persegi extends BangunDatar {
    float sisi;
    
    @Override
    float luas(){
    float luas = sisi * sisi;
    System.out.println("Luas Persegi: " + luas);
    return luas;
    }
    
    @Override 
    float keliling(){
        float kll = 4 * sisi;
        System.out.println("Keliling persegi: " +kll);
        return kll;
    }
}

