import ru.netology.sqr.javaqamvn.services.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.sqrQuantity( 200, 300));
    }
}
