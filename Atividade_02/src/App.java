public class App {
    public static void main(String[] args){
        Conta c1 = new Conta(122234, "Alex", 1500);
        //c1.deposito(50);
        //c1.deposito(55);
        Conta c2 = new Conta(666, "victorios", 50000);
        c2.getSaldoAtual();
        c1.getSaldoAtual();
        try {
            c2.transferencia(c1, 6);
        } catch (SaldoException e) {
            System.out.println("ERROR::"+e.mensagem);
            e.printStackTrace();
        } catch (ContaInexistenteException e) {
            System.out.println("ERROR::"+e.mensagem);
            e.printStackTrace();
        }
    }
}
