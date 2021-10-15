package br.com.generation.javainvest;

import javax.swing.JOptionPane;

public class JavaInvest {

	public static void main(String[] args) {
		
		Calculos calc = new Calculos();
		Usuario user = new Usuario();
		
		int opcao;
		double despesaRenda, resto, rendaTotal, despesa, despesaTotal, lazer, investimento;
		
		
		
		//Pegando entradas do usuário
		user.setNome(JOptionPane.showInputDialog("Informe seu nome: "));

		user.setRendaFixa(Double.parseDouble(JOptionPane.showInputDialog("Informe seus ganhos fixos: ")));
		
		user.setRendaVariavel(Double.parseDouble(JOptionPane.showInputDialog("Informe seus ganhos variáveis: ")));
		
		user.setDespesaFixa(Double.parseDouble(JOptionPane.showInputDialog("Informe suas despesas fixas: ")));
		
		user.setDespesaVariavel(Double.parseDouble(JOptionPane.showInputDialog("Informe suas despesas variáveis: ")));
		
		
		//Calculo do total da renda (fixa + variavel) - metodo na classe calculos
		rendaTotal = calc.calcularRenda(user.getRendaFixa(), user.getRendaVariavel());
		
		
		//Calculo do total das despesas (fixa + variavel)- metodo na classe calculos
		despesaTotal = calc.calcularDespesa(user.getDespesaFixa(), user.getDespesaVariavel());
		
		//Calculo das depesas sobre a renda (100 * despesa)/renda 
		despesaRenda = calc.despesaSobreRenda(rendaTotal, despesaTotal);
	
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha um perfil de investimento: " + 
					"\n1 - Perfil investimento baixo" 
					+ "\n2 - Perfil investimento intermediário" 
					+ "\n3 - Perfil investimento alto" 
					+ "\n4 - Ajuda(?)"));
			switch(opcao) {
				case 1: 
					System.out.println("Investimento baixo");
					if(despesaRenda >= 0 && despesaRenda < 50 ) {
						JOptionPane.showMessageDialog(null,"As suas despesas representam: " + despesaRenda + "% da sua renda");
						resto = despesaRenda - 40;
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (50 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 10);
							JOptionPane.showMessageDialog(null, "Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:" 
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 50);
							investimento = calc.calcularValorRestante(rendaTotal, (10 - resto));
							JOptionPane.showMessageDialog(null,"Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:"  
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
					}
					else if(despesaRenda >= 50 && despesaRenda < 60) {
						JOptionPane.showMessageDialog(null,"As suas despesas representam: " + despesaRenda + "% da sua renda");
						resto = despesaRenda - 50;
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (40 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 10);
							JOptionPane.showMessageDialog(null,"Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:"  
									+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
									+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 40);
							investimento = calc.calcularValorRestante(rendaTotal, (10 - resto));
							JOptionPane.showMessageDialog(null,"Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:"  
									+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
									+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
						
					}
					else if(despesaRenda >= 60 && despesaRenda <= 65) {
						JOptionPane.showMessageDialog(null,"As suas despesas representam: " + despesaRenda + "% da sua renda");
						resto = despesaRenda - 60;
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (37 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 3);
							JOptionPane.showMessageDialog(null,"Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:"  
									+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
									+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 37);
							investimento = calc.calcularValorRestante(rendaTotal, (3 - resto));
							JOptionPane.showMessageDialog(null,"Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:"  
									+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
									+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
					}
					else {
						JOptionPane.showMessageDialog(null,"Desculpe, você não tem perfil para investir!");
					}
				break;
				case 2: 
					JOptionPane.showMessageDialog(null,"Investimento intermediário");
					if(despesaRenda >= 0 && despesaRenda < 50 ) {
						JOptionPane.showMessageDialog(null,"Porcentagem da despesa: " + despesaRenda + "%");
						resto = despesaRenda - 40;	
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (45 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 15);
							JOptionPane.showMessageDialog(null, "Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:" 
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 45);
							investimento = calc.calcularValorRestante(rendaTotal, (15 - resto));
							JOptionPane.showMessageDialog(null,"Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:"  
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
					}
					else if(despesaRenda >= 50 && despesaRenda < 60) {
						JOptionPane.showMessageDialog(null,"Porcentagem da despesa: " + despesaRenda + "%");
						resto = despesaRenda - 50;	
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (30 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 20);
							JOptionPane.showMessageDialog(null, "Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:" 
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 30);
							investimento = calc.calcularValorRestante(rendaTotal, (20 - resto));
							JOptionPane.showMessageDialog(null,"Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:"  
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
					}
					else if(despesaRenda >= 60 && despesaRenda <= 65) {
						JOptionPane.showMessageDialog(null,"Porcentagem da despesa: " + despesaRenda + "%");
						resto = despesaRenda - 60;	
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (20 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 20);
							JOptionPane.showMessageDialog(null, "Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:" 
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 20);
							investimento = calc.calcularValorRestante(rendaTotal, (20 - resto));
							JOptionPane.showMessageDialog(null,"Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:"  
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
					}
					else {
						JOptionPane.showMessageDialog(null,"Desculpe, você não tem perfil para investir!");
					}
				break;
				case 3:
					System.out.println("Investimento alto");
					if(despesaRenda >= 0 && despesaRenda < 50 ) {
						JOptionPane.showMessageDialog(null,"Porcentagem da despesa: " + despesaRenda + "%");
						resto = despesaRenda - 40;	
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (35 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 25);
							JOptionPane.showMessageDialog(null, "Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:" 
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 35);
							investimento = calc.calcularValorRestante(rendaTotal, (25 - resto));
							JOptionPane.showMessageDialog(null,"Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:"  
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
					}
					else if(despesaRenda >= 50 && despesaRenda < 60) {
						JOptionPane.showMessageDialog(null,"Porcentagem da despesa: " + despesaRenda + "%");
						resto = despesaRenda - 50;	
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (20 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 30);
							JOptionPane.showMessageDialog(null, "Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:" 
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 20);
							investimento = calc.calcularValorRestante(rendaTotal, (30 - resto));
							JOptionPane.showMessageDialog(null,"Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:"  
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
					}
					else if(despesaRenda >= 60 && despesaRenda <= 65) {
						JOptionPane.showMessageDialog(null,"Porcentagem da despesa: " + despesaRenda + "%");
						resto = despesaRenda - 60;	
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (10 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 30);
							JOptionPane.showMessageDialog(null, "Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:" 
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 10);
							investimento = calc.calcularValorRestante(rendaTotal, (30 - resto));
							JOptionPane.showMessageDialog(null,"Com base nos seus ganhos, despesas e perfil de investimento escolhido, \nas indicações para gerenciamento financeiro são:"  
															+ "\n\nR$ " + Math.round(despesa) + ", para destinar as despesas fixas;" + "\nR$ " 
															+ Math.round(lazer) + ", para lazer; \nR$ " + Math.round(investimento) + " para investir.");
						}
					}
					else {
						JOptionPane.showMessageDialog(null,"Desculpe, você não tem perfil para investir!");
					}
				break;
				case 4: 
					
					JOptionPane.showMessageDialog(null, "O perfil moderado aceita assumir pequenos riscos,"
										+ "\nPara ele, é importante pensar e procurar por segurança, por isso suas perdas são sempre controladas.");
				break;	
				default:
					JOptionPane.showMessageDialog(null,"Valor inválido.");
				break;
			}
			
		}while(opcao == 4);
		
	}

}
