public class Quadrado {
	private int lado;
	private String cor;

	Quadrado(int Id,String cr){
		lado = Id;
		cor = cr;
	}

	public int calculaArea() {
		int result;
		result = lado * lado;
		return result;
	}
	
	public int calculePerimetro() {
		int result;
		result = 4 * lado;
		return result;
	}
 
	public void repintar (String novaCor) {
		cor = novaCor;
	}
 
}


// Quando eu crio um tipo novo, um objetivo, eu tenho que criar um "Construtor", a cara do método
// O método construtor sempre tem o mesmo nome da classe