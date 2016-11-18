package dataInputStream;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ContaBancaria {
	
	
	
	
	 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Débito ou crédito");
		
		JOptionPane.showInputDialog("Entre com a nota 2");
		
		JComboBox<Operacaoes> combobox = new JComboBox<>();
		combobox.setModel(new DefaultComboBoxModel<>(Operacaoes.values()));
		
		
		 Operacaoes choice =(Operacaoes) JOptionPane.showInputDialog(null, 
			      "Operacoes em conta bancaria", 
			      "Qual operacao deseja fazer?", 
			      JOptionPane.PLAIN_MESSAGE, 
			      null, 
			      Operacaoes.values(), "DEBITO");

			  // interpret the user's choice
			  if ((choice != null) &&(choice.toString().length() > 0))
			  {
			    System.out.println("funcionou " + choice.toString());
			    return;
			  }
			
		
				
		
	}
}
