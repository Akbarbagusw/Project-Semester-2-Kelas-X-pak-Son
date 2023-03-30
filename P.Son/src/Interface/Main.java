package Interface;
public class Main {
    public static void main(String[] args) {
        String emailPenerima = "akbarbagus0107@gmail.com";
        String nomerHp = "+628111111111";
        String mobileId = "android-123456";

        EmailNotifikasi emailNotif = new EmailNotifikasi();
        SMSNotifikasi smsNotif = new SMSNotifikasi();
        PushNotifikasi pushNotif = new PushNotifikasi();

        String message = "HALLOOO NAURAAA ARNII PARAMITAA";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}
