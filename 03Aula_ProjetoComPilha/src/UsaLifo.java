import javax.swing.JOptionPane;

public class UsaLifo {

	public static void main(String[] args) {
		String entra;
		int idade, opcao, aux;

		Lifo minhaPilha;

		entra = JOptionPane.showInputDialog("Informe o Tamanho da Lista");
		aux = Integer.parseInt(entra);
		minhaPilha = new Lifo(aux);

		do {
			entra = JOptionPane.showInputDialog(
					"\n\n\nSistema Para Brincar com a Pilha" + "\n\n\t\t\tMenu\n\n\t1. Inserir\n\t2.Retirar"
							+ "\n\t3. Motrar\n\t4. Detonar\n\t9. Vazar\n\n\tDigite sua Opção");

			opcao = Integer.parseInt(entra);
			switch (opcao) {
			case 1:
				entra = JOptionPane.showInputDialog("Informe a idade:");
				idade = Integer.parseInt(entra);
				if (minhaPilha.Inserir(idade) == true)
					System.out.println("\nIdade inserida com sucesso");
				else
					System.out.println("\nImpossivel inserir - Overflow");
				break;

			case 2:
				if (minhaPilha.Retirar(0) == true)
					System.out.println("\nElemento retirado do topo");
				else
					System.out.println("\nImpossivel retirar - underflow");
				break;

			case 3:
				minhaPilha.Mostrar();
				break;

			case 4:
				minhaPilha.Detonar();
			}

		} while (opcao != 9);
		System.out.println("\nObrigado por usar o Sismin - Sistema Feito Por Mim Mesmo");
	}
}
