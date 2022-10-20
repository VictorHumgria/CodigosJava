public class App {
    public static void main(String[] args){
        Agenda ag = new Agenda(3);
        Compromisso c1 = new Compromisso("Escola 1", 7, 4);
        Compromisso c2 = new Compromisso("Jovem Aprendiz", 13, 4);
        Compromisso c3 = new Compromisso("PréUni", 17, 3);
        try {
            ag.marcarCompromisso(c1);
        } catch (MaximoCompromissoException e) {
            System.out.println("ERROR:"+e.getMessage());
        } catch (ChoqueException e) {
            System.out.println("ERROR:"+e.getMessage());
        }

        try {
            ag.marcarCompromisso(c2);
        } catch (MaximoCompromissoException e) {
            
            System.out.println("ERROR:"+e.getMessage());
        } catch (ChoqueException e) {
            System.out.println("ERROR:"+e.getMessage());
        }


        try {
            ag.marcarCompromisso(c3);
        } catch (MaximoCompromissoException e) {
            
            System.out.println("ERROR:"+e.getMessage());
        } catch (ChoqueException e) {
            System.out.println("ERROR:"+e.getMessage());
        }
        ag.desmarcarCompromisso("Escola");
        ag.imprimir();


    }
    
}
