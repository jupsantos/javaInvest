package br.com.generation.javainvest;

import javax.swing.JOptionPane;

public class PerfilBaixo implements PerfilInvestimento{
	

	public static void perfil(Usuario user, Calculos calc, double despesaRenda, double rendaTotal) {
		double resto, despesa, lazer, investimento;
		
		if(despesaRenda >= 0 && despesaRenda < 50 ) {
			JOptionPane.showMessageDialog(null,"As suas despesas representam: " + Math.round(despesaRenda)  + "% da sua renda", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
			resto = despesaRenda - 40;
			if(resto >= 0) {
				despesa = (despesaRenda/100) * rendaTotal;
				lazer = calc.calcularValorRestante(rendaTotal, (50 - resto));
				investimento = calc.calcularValorRestante(rendaTotal, 10);
				JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento baixo, \nas indicações para gerenciamento financeiro são:" 
												+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
												+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				despesa = (despesaRenda/100) * rendaTotal;
				lazer = calc.calcularValorRestante(rendaTotal, 50);
				investimento = calc.calcularValorRestante(rendaTotal, (10 - resto));
				JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento baixo, \nas indicações para gerenciamento financeiro são:"  
												+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
												+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else if(despesaRenda >= 50 && despesaRenda < 60) {
			JOptionPane.showMessageDialog(null,"As suas despesas representam: " + Math.round(despesaRenda) + "% da sua renda");
			resto = despesaRenda - 50;
			if(resto >= 0) {
				despesa = (despesaRenda/100) * rendaTotal;
				lazer = calc.calcularValorRestante(rendaTotal, (40 - resto));
				investimento = calc.calcularValorRestante(rendaTotal, 10);
				JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento baixo, \nas indicações para gerenciamento financeiro são:"  
						+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
						+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				despesa = (despesaRenda/100) * rendaTotal;
				lazer = calc.calcularValorRestante(rendaTotal, 40);
				investimento = calc.calcularValorRestante(rendaTotal, (10 - resto));
				JOptionPane.showMessageDialog(null, user.getNome() + ". com base nos seus ganhos, despesas e perfil de investimento baixo, \nas indicações para gerenciamento financeiro são:"  
						+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
						+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		else if(despesaRenda >= 60 && despesaRenda <= 65) {
			JOptionPane.showMessageDialog(null,"As suas despesas representam: " + Math.round(despesaRenda) + "% da sua renda");
			resto = despesaRenda - 60;
			if(resto >= 0) {
				despesa = (despesaRenda/100) * rendaTotal;
				lazer = calc.calcularValorRestante(rendaTotal, (37 - resto));
				investimento = calc.calcularValorRestante(rendaTotal, 3);
				JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento baixo, \nas indicações para gerenciamento financeiro são:"  
						+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
						+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				despesa = (despesaRenda/100) * rendaTotal;
				lazer = calc.calcularValorRestante(rendaTotal, 37);
				investimento = calc.calcularValorRestante(rendaTotal, (3 - resto));
				JOptionPane.showMessageDialog(null, user.getNome() + ", com base nos seus ganhos, despesas e perfil de investimento baixo, \nas indicações para gerenciamento financeiro são:"  
						+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
						+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Oops! " + user.getNome() + ", parece que você ainda não tem perfil para investir!", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
}
