package br.com.generation.javainvest;

import javax.swing.JOptionPane;

public class JavaInvest {

	public static void main(String[] args) {
		
		Calculos calc = new Calculos();
		Usuario user = new Usuario();
		
		int opcao;
		double despesaRenda, rendaTotal, despesaTotal;
		
		
		
		//Pegando entradas do usuário
		user.setNome(JOptionPane.showInputDialog(null, "Informe seu nome: ", "Java Invest", JOptionPane.INFORMATION_MESSAGE));

		user.setRendaFixa(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seus ganhos fixos: ", "Java Invest", JOptionPane.INFORMATION_MESSAGE)));
		
		user.setRendaVariavel(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seus ganhos variáveis: ", "Java Invest", JOptionPane.INFORMATION_MESSAGE)));
		
		user.setDespesaFixa(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe suas despesas fixas: ", "Java Invest", JOptionPane.INFORMATION_MESSAGE)));
		
		user.setDespesaVariavel(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe suas despesas variáveis: ", "Java Invest", JOptionPane.INFORMATION_MESSAGE)));
		
		
		//Calculo do total da renda (fixa + variavel) - metodo na classe calculos
		rendaTotal = calc.calcularRenda(user.getRendaFixa(), user.getRendaVariavel());
		
		
		//Calculo do total das despesas (fixa + variavel)- metodo na classe calculos
		despesaTotal = calc.calcularDespesa(user.getDespesaFixa(), user.getDespesaVariavel());
		
		//Calculo das depesas sobre a renda (100 * despesa)/renda 
		despesaRenda = calc.despesaSobreRenda(rendaTotal, despesaTotal);
	
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha um perfil de investimento: " + 
					"\n1 - Perfil investimento baixo" 
					+ "\n2 - Perfil investimento intermediário" 
					+ "\n3 - Perfil investimento alto" 
					+ "\n4 - Ajuda(?)", "Java Invest", JOptionPane.INFORMATION_MESSAGE));
			switch(opcao) {
				case 1: 
					PerfilBaixo.perfil(user, calc, despesaRenda, rendaTotal);
				break;
				case 2: 
					PerfilIntermediario.perfil(user, calc, despesaRenda, rendaTotal);
				break;
				case 3:
					PerfilAlto.perfil(user, calc, despesaRenda, rendaTotal);
				break;
				case 4: 
					
					JOptionPane.showMessageDialog(null, "\n1- O perfil de baixo investimento se adequa a pessoas"
							+ "que estao dispostas a destinar\n uma pequena parcela dos seus ganhos para investimento." +
							"\n\n2- O perfil de moderado investimento se adequa a pessoas que buscam um equilibrio\n entre os investimentos e os gastos com lazer." + 
							"\n\n3- O perfil de alto investimento se adequa a pessoas que estao dispostas a destinar\n grande parte dos seus ganhos" + 
							" para investimentos.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
				break;	
				default:
					JOptionPane.showMessageDialog(null,"Valor inválido.", "Java Invest", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
		}while(opcao == 4);
		
	}

}
