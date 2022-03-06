
public class Fifo {
	
	private int comeco, fim;
	private int fila [];
	
	public Fifo() {
		fila = new int[20];
		comeco = -1;
		fim = -1;
	}
	
	public boolean Inserir(int num) {
		int aux;
		aux = (fim + 1) % fila.length;
		if (aux != comeco) {
			fim = aux;
			fila[aux] = num;
			if(comeco < 0) {
				comeco = 0;
				return true;
			}
		return false;
		}
	}

	
	public void Retirar() {
		if (fim != 0) {
			
		}
	}
	
	public void Detonar() {
		comeco = -1;
		fim = -1;
	}
	
	public void Mostrar() {
		
	}
}
