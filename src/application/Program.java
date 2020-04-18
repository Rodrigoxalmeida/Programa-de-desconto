package application;

import javax.swing.JOptionPane;

import entities.Descontos;

public class Program {

	public static void main(String[] args) {
		
		Descontos desc = new Descontos();
		
		String valor = JOptionPane.showInputDialog(null,"Valor do produto: ");
		String cod = JOptionPane.showInputDialog(null,"Codigo de desconto: ");
		
		desc.setValor(Double.parseDouble(valor));
		desc.setCod(Integer.parseInt(cod));
		
		desc.calcDesc(Double.parseDouble(valor),Integer.parseInt(cod));
				
		JOptionPane.showMessageDialog(null, desc);
		
	}

}
