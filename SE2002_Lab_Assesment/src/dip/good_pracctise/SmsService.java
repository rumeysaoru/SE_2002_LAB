public class SmsService implements MessageService {

    @Override
    public void send(String msg) {
        System.out.println("SMS: " + msg);
    }
}