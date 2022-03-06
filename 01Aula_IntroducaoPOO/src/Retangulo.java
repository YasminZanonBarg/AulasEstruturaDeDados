//Modelo

public class Retangulo{
	private int ladoMenor;
	private int ladoMaior;
	private String cor;
	
	public int calculaArea() {
		int result;
		result = ladoMenor * ladoMaior;
		return result;
	}
	
	public int calculaPerimetro() {
		int calcula;
		calcula = 2 * ladoMenor + 2 * ladoMaior;
		return calcula;
	}
	
	public void repintar(String corNova) {
		cor = corNova;
	}
}
