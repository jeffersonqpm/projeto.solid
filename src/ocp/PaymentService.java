// https://www.youtube.com/watch?v=oyKVLCO1wJ0

/*2 - OCP - Open-closed principle: Principio aberto-fechado
O código deve estar aberto para extensão(pode adicionar novas funcionalidade), mas fechado para 
modificação(Não precisa alterar o que já funciona)*/
package ocp;

public class PaymentService {

    public void processPayment(Order order, String method) {

        if ("card".equalsIgnoreCase(method)) {
            // solicitar autorização na bandeira do cartão
            // recuperar info da autorização
            // salvar no banco de dados
            System.out.println("pagamento via cartão");
        } else if ("pix".equalsIgnoreCase(method)) {
            // solicitar autorização junto ao banco para verificar o saldo do cliente
            // recuperar info da autorização
            // salvar no banco de dados
            System.out.println("pagamento com PIX");

        } else if ("BOLETO".equalsIgnoreCase(method)) {
            // Toda regra de negocio de pagamento via boleto
            System.out.println("Pagamento com boleto");
        }

    }
}

record Order(String id, String email, int items, double total) {

}
