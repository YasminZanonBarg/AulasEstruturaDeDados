public class Lifo {
	private int topo;
	private int lista [];
	
	Lifo(int tamanho){
		topo = -1;
		lista = new int [tamanho];
	}
	
	public boolean Inserir(int num) {
		if (topo < (lista.length -1)) {
			topo ++;
			lista[topo] = num;
			return true;
		}
		System.out.println("Já passou o limite de números");
		return false;
	}
	
	public boolean Retirar(int num) {
		if (topo >= 0) {
			topo--;
			return true;
		}
		return false;
	}
	
	public void Detonar() {
		topo = -1;
	}
	
	public void Mostrar() {
		int aux;
		if (topo >= 0) {
			System.out.println("\nVeja a lista LIFO:");
			for (aux = topo; aux >= 0; aux--) {
				System.out.println(""  + lista[aux]);
			}
		}else {
				System.out.println("Lista vazia");
		}
	}
}

