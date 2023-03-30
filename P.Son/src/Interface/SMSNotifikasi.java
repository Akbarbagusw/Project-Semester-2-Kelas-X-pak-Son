package Interface;
public class SMSNotifikasi implements InterfaceNotifikasi{
    
    @Override
    public void sendMessage(String receiver, String content){
        System.out.println("Mengirim SMS ke " +receiver+ " dengan isi: ");
        System.out.println("content");
    }
}
