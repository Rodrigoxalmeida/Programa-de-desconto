package entities;

import javax.swing.JOptionPane;

public class Descontos {

	private int cod;
	private double valor;
	private double desc = 0;
			
	
	public void setValor(double valor) {
		this.valor = valor;
	}	
	public void setCod(int cod) {
		this.cod = cod;
	}
	public double calcDesc(double valor, int cod) {

		if (cod == 1) {
			desc = (valor * 5) / 100;
			desc = valor - desc;
		}
		if(cod == 2) {
			desc = (valor * 10)/ 100;
			desc = valor - desc;			
		}
		if(cod == 3) {
			desc = (valor * 20)/ 100;
			desc = valor - desc;
		}
		if(cod == 4) {
			desc = (valor * 50)/ 100;
			desc = valor - desc;
		}
		if(cod <= 0 || cod >= 5) {
			JOptionPane.showMessageDialog(null, "Codigo invalido !");
			desc = valor;
		}
		
		return desc;
	}
	
	@Override
	public String toString() {
		return "Valor do Produto: " + valor + "\nPoduto/Desconto: " + desc + "\nCodigo de desconto: " + cod;
	}
	
}
