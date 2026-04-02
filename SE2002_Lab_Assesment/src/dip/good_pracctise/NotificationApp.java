public class NotificationApp {

    private MessageService service;

    // Dependency injection
    public NotificationApp(MessageService service) {
        this.service = service;
    }

    public void notify(String message) {
        service.send(message);
    }
}