import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) {
		
		// Instanciando variável de entrada de dados
		Scanner scan = new Scanner(System.in);
		
		// Declaração das variáveis
		double entrada, cotacao;
		int selecao;
		
		// Instanciando objeto de conversão
		Conversao conversao1 = new Conversao();

		// Exibindo mensagem para a entrada da cotação atual
		System.out.println("Informe a cotaçao atual do Dólar");
		cotacao = Double.parseDouble(scan.next());
		Conversao.setUSD(cotacao);
		
		// Exibindo mensagem para seleção do tipo de conversão
		System.out.println("\nEscolha o tipo de conversão");
		System.out.println("---------------------------");
		System.out.println("[1] Real >> Dólar\n[2] Dólar >> Real");
		selecao = scan.nextInt();
		
		// Estrutura condicional para seleção do tipo de conversão
		if(selecao == 1) {
			System.out.println("BRL -> USD\nInforme um valor em Reais para conversão em Dólares:");
			entrada = Double.parseDouble(scan.next());
			double resultado = conversao1.realDolar(entrada);
			System.out.println("\nA quantia de R$ " + entrada + " equivale a US$ " + resultado);
			
		} else if(selecao == 2) {
			System.out.println("USD -> BRL\nInforme um valor em Dólares para conversão em Reais:");
			entrada = Double.parseDouble(scan.next());
			double resultado = conversao1.dolarReal(entrada);
			System.out.println("\nA quantia de US$ " + entrada + " equivale a R$ " + resultado);
			
		} else {
			System.out.println("Entrada inválida. Você precisa selecionar entre 1 ou 2.");
		}
		
		// Encerramento da entrada de dados inicializada com o Scanner
		scan.close();

	}

}
