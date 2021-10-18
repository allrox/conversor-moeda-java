import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) /*throws InterruptedException*/ {
		
		// Instanciando variável de entrada de dados
		Scanner scan = new Scanner(System.in);
		
		// Declaração das variáveis
		double entrada, cotacao;
		int selecao = 0;
				
		// Instanciando objeto de conversão
		Conversao conversao1 = new Conversao();

		// Exibindo mensagem para a entrada da cotação atual
		System.out.println("Para começar, informe a cotaçao atual do Dólar:");
		cotacao = Double.parseDouble(scan.next());
		Conversao.setUSD(cotacao);
		
		// Laço para execução contínua até que a seleção seja 0
		do {
		
			// Exibindo mensagem para seleção do tipo de conversão
			System.out.println("\nEscolha o tipo de conversão");
			System.out.println("---------------------------");
			System.out.println("[1] Real >> Dólar\n[2] Dólar >> Real\n[0] Sair");
			selecao = scan.nextInt();
			
			// Estrutura condicional para seleção do tipo de conversão
			if(selecao == 1) {
				System.out.println("Conversão BRL -> USD\nInforme o valor em Reais para conversão em Dólares:");
				entrada = Double.parseDouble(scan.next());
				double resultado = conversao1.realDolar(entrada);
				System.out.println("\nA quantia de R$ " + entrada + " equivale a US$ " + resultado);
				// Thread.sleep(2000);
				
			// Bloco carregado caso a entrada de dados receba 2
			} else if(selecao == 2) {
				System.out.println("Conversão USD -> BRL\nInforme o valor em Dólares para conversão em Reais:");
				entrada = Double.parseDouble(scan.next());
				double resultado = conversao1.dolarReal(entrada);
				System.out.println("\nA quantia de US$ " + entrada + " equivale a R$ " + resultado);
				// Thread.sleep(2000);
				
			// Bloco executado caso a entrada de dados receba 0
			} else {
				System.out.println("Encerrando aplicação...");
				System.exit(0);
			}
			
		} while (selecao !=0);
		
		// Encerramento da entrada de dados inicializada com o Scanner
		scan.close();

	}

}
