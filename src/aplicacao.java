import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) /*throws InterruptedException*/ {
		
		// Instanciando vari�vel de entrada de dados
		Scanner scan = new Scanner(System.in);
		
		// Declara��o das vari�veis
		double entrada, cotacao;
		int selecao = 0;
				
		// Instanciando objeto de convers�o
		Conversao conversao1 = new Conversao();

		// Exibindo mensagem para a entrada da cota��o atual
		System.out.println("Para come�ar, informe a cota�ao atual do D�lar:");
		cotacao = Double.parseDouble(scan.next());
		Conversao.setUSD(cotacao);
		
		// La�o para execu��o cont�nua at� que a sele��o seja 0
		do {
		
			// Exibindo mensagem para sele��o do tipo de convers�o
			System.out.println("\nEscolha o tipo de convers�o");
			System.out.println("---------------------------");
			System.out.println("[1] Real >> D�lar\n[2] D�lar >> Real\n[0] Sair");
			selecao = scan.nextInt();
			
			// Estrutura condicional para sele��o do tipo de convers�o
			if(selecao == 1) {
				System.out.println("Convers�o BRL -> USD\nInforme o valor em Reais para convers�o em D�lares:");
				entrada = Double.parseDouble(scan.next());
				double resultado = conversao1.realDolar(entrada);
				System.out.println("\nA quantia de R$ " + entrada + " equivale a US$ " + resultado);
				// Thread.sleep(2000);
				
			// Bloco carregado caso a entrada de dados receba 2
			} else if(selecao == 2) {
				System.out.println("Convers�o USD -> BRL\nInforme o valor em D�lares para convers�o em Reais:");
				entrada = Double.parseDouble(scan.next());
				double resultado = conversao1.dolarReal(entrada);
				System.out.println("\nA quantia de US$ " + entrada + " equivale a R$ " + resultado);
				// Thread.sleep(2000);
				
			// Bloco executado caso a entrada de dados receba 0
			} else {
				System.out.println("Encerrando aplica��o...");
				System.exit(0);
			}
			
		} while (selecao !=0);
		
		// Encerramento da entrada de dados inicializada com o Scanner
		scan.close();

	}

}
