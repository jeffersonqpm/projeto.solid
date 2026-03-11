package srp;

/**
 * Cudiar da criação de uma order
 */
public class OrderService {
//SRP - CADA CLASSE OU MÓDULO DEVE TER APENAS UMA RESPONSABILIDADE E, PORTANDO UMA ÚNICA RAZÃO PARA MUDAR.

    public void processOrder(Order order) {

        // 1. Validação
        if (order.items() <= 0) {
            throw new IllegalArgumentException("O pedido não pode ser vazio");

        } else if (order.email().isEmpty()) {
            throw new IllegalArgumentException("O e-mail não pode ser vazio");

        }

        //2. Processar o pagamento
        double calculateTotal = order.items() * order.total();
        System.out.println("O valor a ser pago será " + calculateTotal);

        // Chamar API de pagamento
        // Validar o retorno
        // Validar se o pagamento foi feito
        // Reprocessar o pagemento em caso de erro
        
        // 3. Calcular frete
        double shipping = calculateTotal > 100 ? 0 : 20;
        System.out.println();
        // Chama API da transportadora
        // Envia o pedido

        System.out.println("O valor total de frete " + shipping);

        // 4. Envio de e-mail
        // Criar a função de envio de email
        // Validar o conteúdo
        // Validar o email
        System.out.println("Envaiando o e-mail " + order.email());
    }

}

record Order(String id, String email, int items, double total) {

}
