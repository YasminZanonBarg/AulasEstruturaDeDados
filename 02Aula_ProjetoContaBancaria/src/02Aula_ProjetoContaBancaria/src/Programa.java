public class Programa {

	public static void main(String[] args) {
		int x;
		String w;
		Contas funca = new Contas(54123, "will");

		System.out.println("Saldo = " + funca.Consultar());
		System.out.println("depositar = " + funca.Depositar(500));
		System.out.println("Saldo = " + funca.Consultar());

		if (funca.Sacar(800))
			System.out.println("saque efetuado com sucesso");

		else
			System.out.println("saldo insuficiente");

		if (funca.Sacar(300))
			System.out.println("saque efetuado");
		else
			System.out.println("saque nao efetuado");

		System.out.println("Saldo = " + funca.Consultar());
	}
}

