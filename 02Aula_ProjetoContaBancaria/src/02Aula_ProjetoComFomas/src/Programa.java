public class Programa {

	public static void main(String[] args) {
		int x;
		String w;
		
		Quadrado bonito = new Quadrado(2,"Amarelo"); //A palavra new instância um objeto
		System.out.println("AREA = " + bonito.calculaArea());
		System.out.println("PERIMETRO = " + bonito.calculePerimetro());
		
		
		Retangulo legal = new Retangulo(3, 4, "verde");
		System.out.println("AREA = " + legal.calculaArea());
		System.out.println("PERIMETRO = " + legal.calculaPerimetro());
	}

}
