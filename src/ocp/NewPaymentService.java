package ocp;
// 27:49
public class NewPaymentService {

}
//#region - INTERFACE
interface PaymentProcess {

    void pay(Order order);
}

//#endregion - FIM INTERFACE

class CardPayment implements PaymentProcess {

    @Override
    public void pay(Order order) {
        // solicitar autorização na bandeira do cartão
        // recuperar info da autorização
        // salvar no banco de dados
        System.out.println("pagamento via cartão");
    }
}

class PixPayment implements PaymentProcess {

    @Override
    public void pay(Order order) {

        // solicitar autorização junto ao banco para verificar o saldo do cliente
        // recuperar info da autorização
        // salvar no banco de dados
        System.out.println("pagamento com PIX");
    }
}

class BoletoPayment implements PaymentProcess {

    @Override
    public void pay(Order order) {
        // Toda regra de negocio de pagamento via boleto
        System.out.println("Pagamento com boleto");
    }

}
