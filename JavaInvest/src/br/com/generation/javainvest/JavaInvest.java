package br.com.generation.javainvest;

import javax.swing.JOptionPane;

public class JavaInvest {

	public static void main(String[] args) {
		
		Calculos calc = new Calculos();
		Usuario user = new Usuario();
		
		int opcao;
		double despesaRenda, resto, rendaTotal, despesa, despesaTotal, lazer, investimento;
		
		/*System.out.println(calc.calcularRenda(300.45, 1200.45));
		
		System.out.println(desp.calcularDespesa(300.45, 1200.45));*/
		
		
		user.setNome(JOptionPane.showInputDialog("Informe seu nome: "));
		//System.out.println(user.getNome());
		
		user.setRendaFixa(Double.parseDouble(JOptionPane.showInputDialog("Informe sua renda fixa: ")));
		//System.out.println(user.getRendaFixa());
		
		user.setRendaVariavel(Double.parseDouble(JOptionPane.showInputDialog("Informe sua renda variável: ")));
		
		user.setDespesaFixa(Double.parseDouble(JOptionPane.showInputDialog("Informe sua despesa fixa: ")));
		
		user.setDespesaVariavel(Double.parseDouble(JOptionPane.showInputDialog("Informe sua despesa variável: ")));
		
		rendaTotal = calc.calcularRenda(user.getRendaFixa(), user.getRendaVariavel());
		
		despesaTotal = calc.calcularDespesa(user.getDespesaFixa(), user.getDespesaVariavel());
		
		despesaRenda = calc.despesaSobreRenda(rendaTotal, despesaTotal);
	
		
		
		
		//imprimir JOption
		//JOptionPane.showMessageDialog(null, desp);
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha um perfil de investimento: " + 
					"\n1 - Perfil investimento baixo" 
					+ "\n2 - Perfil investimento intermediário" 
					+ "\n3 - Perfil investimento alto" 
					+ "\n4 - Ajuda(?)"
					+ "\n5 - Sair" ));
			switch(opcao) {
				case 1: 
					System.out.println("Investimento baixo");
					if(despesaRenda >= 0 && despesaRenda < 50 ) {
						System.out.println("Porcentagem da despesa menor que 50%");
						resto = despesaRenda - 40;
						if(resto >= 0) {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, (50 - resto));
							investimento = calc.calcularValorRestante(rendaTotal, 10);
							JOptionPane.showMessageDialog(null, "R$ " + despesa + ", para destinar as despesas fixas." + "R$ " 
															+ lazer + ", para lazer e R$ " + investimento + " para investir.");
						}
						else {
							despesa = (despesaRenda/100) * rendaTotal;
							lazer = calc.calcularValorRestante(rendaTotal, 50);
							investimento = calc.calcularValorRestante(rendaTotal, (10 - resto));
							JOptionPane.showMessageDialog(null, "R$ " + despesa + ", para destinar as despesas fixas." + "R$ " 
															+ lazer + ", para lazer e R$ " + investimento + " para investir.");
						}
					}
					else if(despesaRenda > 50 && despesaRenda < 60) {
						System.out.println("Porcentagem da despesa entre 50% e 60%");
						resto = despesaRenda - 50;
						
					}
					else if(despesaRenda > 60 && despesaRenda < 65) {
						System.out.println("Porcentagem da despesa entre 60% e 65%");
						resto = despesaRenda - 60;
					}
					else {
						System.out.println("Desculpe, você não tem perfil para investir!");
					}
				break;
				case 2: 
					System.out.println("Investimento intermediário");
					if(despesaRenda >= 0 && despesaRenda < 50 ) {
						System.out.println("Porcentagem da despesa menor que 50%");
					}
					else if(despesaRenda > 50 && despesaRenda < 60) {
						System.out.println("Porcentagem da despesa entre 50% e 60%");
					}
					else if(despesaRenda > 60 && despesaRenda < 65) {
						System.out.println("Porcentagem da despesa entre 60% e 65%");
					}
					else {
						System.out.println("Desculpe, você não tem perfil para investir!");
					}
				break;
				case 3:
					System.out.println("Investimento alto");
					if(despesaRenda >= 0 && despesaRenda < 50 ) {
						System.out.println("Porcentagem da despesa menor que 50%");
					}
					else if(despesaRenda > 50 && despesaRenda < 60) {
						System.out.println("Porcentagem da despesa entre 50% e 60%");
					}
					else if(despesaRenda > 60 && despesaRenda < 65) {
						System.out.println("Porcentagem da despesa entre 60% e 65%");
					}
					else {
						System.out.println("Desculpe, você não tem perfil para investir!");
					}
				break;
				case 4: 
					
					JOptionPane.showMessageDialog(null,"O perfil moderado aceita assumir alguns riscos," + 
										"\nmesmo que esses sejam pequenos e esporádicos." 
										+ "\nPara ele, é importante pensar e procurar por segurança, por isso suas perdas são sempre controladas.");
				break;	
				default:
					System.out.println("Valor inválido.");
				break;
			}
			
		}while(opcao == 4);
		
	}

}
