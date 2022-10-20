public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta(1, "Maria", 1200);
        Conta c2 = new Conta(2, "Joao", 1000);
        Conta c3 = new Conta(3, "Victor", 500);
        Conta c4 = new Conta(4, "Jose", 2000);
        ContaCorrente caixa = new ContaCorrente();
        caixa.adicionarConta(c1);
        caixa.adicionarConta(c2);
        caixa.adicionarConta(c3);
        caixa.adicionarConta(c4);
        caixa.transferencia(c4, c1, 500);
        c1.saque(500);
        c2.deposito(900);
        c3.deposito(800);
        c4.deposito(500);
        caixa.imprimir();
        
        
        
    }
}
