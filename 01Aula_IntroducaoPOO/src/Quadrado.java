public class Quadrado {
	private int lados;
	private String cor;
	
	public int CalculaArea() {
		int result;
		result = lados * lados;
		return result;
	}
	
	public int calculaPerimetro() {
		int result;
		result = 4 * lados;
		return result;
	}
	
	public void repintar(String cr) {
			cor = cr;
	}
}
