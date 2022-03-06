public class Lifo {
	private Nodo topo;

	Lifo() {
		topo = null;
	}

	public void inserir(int quem) {
		Nodo aux;
		aux = new Nodo(quem);
		aux.vizinho = topo;
		topo = aux;
	}

	public void Detonar() {
		topo = null;
	}

	public void Mostrar() {
		Nodo aux;
		if (topo == null) {
			System.out.println("LISTA VAZIA");
			return;
		}
		System.out.println("\nVEJA A LISTA:");
		aux = topo;
		while (aux != null) {
			System.out.println(" " + aux.matricula);
			aux = aux.vizinho;
		}
	}
	
	public int retirar() {
		int aux = -999;
		if(topo != null) {
			aux = topo.matricula;
			topo = topo.vizinho;
		}
		return aux;
	}

}
