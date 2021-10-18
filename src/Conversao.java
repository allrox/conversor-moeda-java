
public class Conversao {
	
	/*
	 * Definindo uma vari�vel est�tica
	 * ser� sempre atualizada para todos
	 * os pontos em que � utilizada.
	 */
	static double USD;
	static double EUR;
	double valor;
	
	/**
	 * M�todo para convers�o no sentido BRL > USD
	 * @param brl
	 * @return
	 */
	public double realDolar(double brl) {
		this.valor = brl / USD;
		return this.valor;		
	}
	
	/**
	 * M�todo para convers�o no sentido USD > BRL
	 * @param brl
	 * @return
	 */
	public double dolarReal(double brl) {
		this.valor = brl * USD;
		return this.valor;		
	}
	
	/**
	 * Setter para defini��o da cota��o atual do D�lar
	 * @param USD
	 */
	public static void setUSD(double USD) {
		if(USD > 0) {
			Conversao.USD = USD;
		}
	}
	
}
