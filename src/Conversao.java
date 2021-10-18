
public class Conversao {
	
	/*
	 * Definindo uma variável estática
	 * será sempre atualizada para todos
	 * os pontos em que é utilizada.
	 */
	static double USD;
	static double EUR;
	double valor;
	
	/**
	 * Método para conversão no sentido BRL > USD
	 * @param brl
	 * @return
	 */
	public double realDolar(double brl) {
		this.valor = brl / USD;
		return this.valor;		
	}
	
	/**
	 * Método para conversão no sentido USD > BRL
	 * @param brl
	 * @return
	 */
	public double dolarReal(double brl) {
		this.valor = brl * USD;
		return this.valor;		
	}
	
	/**
	 * Setter para definição da cotação atual do Dólar
	 * @param USD
	 */
	public static void setUSD(double USD) {
		if(USD > 0) {
			Conversao.USD = USD;
		}
	}
	
}
