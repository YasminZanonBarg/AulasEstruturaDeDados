public class Retangulo {

	private int ladoMaior; //CaracterÝsticas-Atributo, geralmente "private"
	private int ladoMenor;
	private String cor;
	
	Retangulo(int Id1, int Id2, String cr){
		ladoMenor = Id1;
		ladoMaior = Id2;
		cor = cr;
	}
	
	public int calculaArea(){
		int result;
		result = ladoMenor * ladoMaior;
		return result;
	}
	
	public double calculaPerimetro() {
		double result;
		result = (ladoMenor * 2) + (ladoMaior * 2);
		return result;
	}
	
	public void repintar (String corNova) {
		 cor = corNova;
	}
	
	
	
}
