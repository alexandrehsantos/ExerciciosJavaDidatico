package dataInputStream;

import javax.swing.JOptionPane;

public class EntradaComJOption {
	public static void main(String[] args) {
		String aux="";
		float nota1 =0, nota2=0, trabalho=0, media=0;
		
		aux = c
		nota1 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Entre com a nota 2");
		nota2 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Entre com a nota do trabalho");
		trabalho = Float.parseFloat(aux);
		
		media = (nota1 + nota2 + trabalho) /3;
		JOptionPane.showMessageDialog(null, "Media : " + media);
		
	}
}
