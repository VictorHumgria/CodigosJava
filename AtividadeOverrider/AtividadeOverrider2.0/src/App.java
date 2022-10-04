public class App {
    public static void main(String[] args) throws Exception {
        Calculadora casio = new Calculadora();
        CalculadoraMem x = new CalculadoraMem();
        System.out.println("Valor da soma de 5+5: "+casio.soma(5, 5));
        x.armazenarMem(casio.soma(5, 5));
        System.out.println("Valor da variavel v3: "+x.getValor3());
        System.out.println("Fazendo Limpeza!!!\n");
        x.RecuperarMemoria();
        System.out.println("Novo valor da variavel v3: "+x.getValor3());
    }
}
