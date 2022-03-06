//tipo primitivo = variaveis
//tipo abstratos = objetos

import javax.swing.JOptionPane;

public class UsaFiguras {

	public static void main(String[] args) {
		int num1, num2, volta;
		String entra;
		Retangulo meu, teu, feio, bonito;
		Quadrado nosso;
		
		entra = JOptionPane.showInputDialog("Informe o lado menor");
		num1 = Integer.parseInt(entra);
		entra = JOptionPane.showInputDialog("Informe o lado maior");
		num2 = Integer.parseInt(entra);
		entra = JOptionPane.showInputDialog("Informe uma cor");
		meu = new Retangulo();
		volta = meu.calculaArea();
		System.out.println("Area do retangulo meu =" + volta);

	}

}
