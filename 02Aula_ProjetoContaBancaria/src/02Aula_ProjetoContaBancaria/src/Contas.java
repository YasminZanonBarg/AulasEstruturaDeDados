public class Contas {
	private int numcont;
	private int saldo;
	private String titular;

	Contas(int nc, String tlr) {
		numcont = nc;
		saldo = 0;
		titular = tlr;

	}

	public int Depositar(int quanto) {
		saldo = saldo + quanto;
		return saldo;

	}

	public boolean Sacar(int valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;

		}
		return false;

	}

	public int Consultar() {
		return saldo;
	}
}