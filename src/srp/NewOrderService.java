package srp;

public class NewOrderService {

    public void processOrder(NewOrder order) {

        boolean isValid = ValidatorOrder.isValid(order);
        if(!isValid) throw new IllegalArgumentException("Erro no processamento do order");

        PaymentOrder.processePay(order);
        ShippigOrder.calculateShipping(order.total());
        SendNotification.sendEmail(order);
        

    }

}

class ValidatorOrder {// Classe

    public static boolean isValid(NewOrder order) {
        if (order.items() <= 0) {
            return false;

        } else if (order.email().isEmpty()) {
            return false;

        }
        return true;
    }
}

class PaymentOrder {

    static double processePay(NewOrder order) {
        return order.items() * order.total();
    }
}

class ShippigOrder {

    static double calculateShipping(double total) {
        return total > 100 ? 0 : 20;
    }
}

class SendNotification {

    static void sendEmail(NewOrder order) {
        System.out.println("Enviando e-mail " + order.email());

    }
}

record NewOrder(String email, int items, double total) {

}
