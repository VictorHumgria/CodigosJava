
public class PrincipalTeste {

	public static void main(String[] args) {
		Mamifero m1 = new Mamifero("Camelo", 160, 4, "Amarelo", "Terra", 2.2, "Plantas");
		Mamifero m2 = new Mamifero("Urso",185,4,"Marron","Terra",0.5,"Mel");
		Peixe p1 = new Peixe("Piranha", 200, 0, "Azul", "Água", 50, "Gente");
		m1.imprimirMamifero();
		System.out.println("----------------------------------");
		m2.imprimirMamifero();
		System.out.println("----------------------------------");
		p1.imprimirPeixa();
	}

}
