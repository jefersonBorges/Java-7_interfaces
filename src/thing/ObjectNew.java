package thing;

public class ObjectNew implements Movimenta {
	
	private String propriedade;
	private String valor;
	private int posicaoX;
	private int posicaoY;
	
	public ObjectNew() {
		
	};
	
	public void setPropriedade(String propriedade) {
		this.propriedade = propriedade;
	}
	
	public String getPropriedade() {
		return propriedade;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
	
	public int getPosicaoX() {
		return posicaoX;
	}
	
	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}
	
	public int getPosicaoY() {
		return posicaoY;
	}
	
	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}	
	
	public void sobe() {
		this.posicaoY++;
	}
	
	public void desce () {
		this.posicaoY--;
	}

	public static void main( String [] args) {
		System.out.println("Hello...");
		ObjectNew on = new ObjectNew();
		on.setPropriedade("p1");
		on.setValor("1");
		on.setPosicaoX(0);
		on.setPosicaoY(0);
		on.sobe();
		on.desce();
	}
}
