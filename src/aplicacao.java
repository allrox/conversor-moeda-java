import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) {
		
		// Instanciando vari�vel de entrada de dados
		Scanner scan = new Scanner(System.in);
		
		// Declara��o das vari�veis
		double entrada, cotacao;
		int selecao;
		
		// Instanciando objeto de convers�o
		Conversao conversao1 = new Conversao();

		// Exibindo mensagem para a entrada da cota��o atual
		System.out.println("Informe a cota�ao atual do D�lar");
		cotacao = Double.parseDouble(scan.next());
		Conversao.setUSD(cotacao);
		
		// Exibindo mensagem para sele��o do tipo de convers�o
		System.out.println("\nEscolha o tipo de convers�o");
		System.out.println("---------------------------");
		System.out.println("[1] Real >> D�lar\n[2] D�lar >> Real");
		selecao = scan.nextInt();
		
		// Estrutura condicional para sele��o do tipo de convers�o
		if(selecao == 1) {
			System.out.println("BRL -> USD\nInforme um valor em Reais para convers�o em D�lares:");
			entrada = Double.parseDouble(scan.next());
			double resultado = conversao1.realDolar(entrada);
			System.out.println("\nA quantia de R$ " + entrada + " equivale a US$ " + resultado);
			
		} else if(selecao == 2) {
			System.out.println("USD -> BRL\nInforme um valor em D�lares para convers�o em Reais:");
			entrada = Double.parseDouble(scan.next());
			double resultado = conversao1.dolarReal(entrada);
			System.out.println("\nA quantia de US$ " + entrada + " equivale a R$ " + resultado);
			
		} else {
			System.out.println("Entrada inv�lida. Voc� precisa selecionar entre 1 ou 2.");
		}
		
		// Encerramento da entrada de dados inicializada com o Scanner
		scan.close();

	}

}
