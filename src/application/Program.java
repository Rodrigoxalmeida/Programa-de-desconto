package application;

import javax.swing.JOptionPane;

import entities.Descontos;

public class Program {

	public static void main(String[] args) {
		
		Descontos desc = new Descontos();
		
		for(int i = 0; i <=10; i++) {
		try {
		String valor = JOptionPane.showInputDialog(null,"Valor do produto: ");
		String cod = JOptionPane.showInputDialog(null,"Codigo de desconto: ");
				
		desc.setValor(Double.parseDouble(valor));
		desc.setCod(Integer.parseInt(cod));
		desc.calcDesc(Double.parseDouble(valor),Integer.parseInt(cod));
		
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite somente numeros","Erro",JOptionPane.ERROR_MESSAGE);
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null,"Valor/codigo nulo","Erro",JOptionPane.ERROR_MESSAGE);
		}
		
		JOptionPane.showMessageDialog(null, desc);
		}
	}

}
