package geometric_shapes;

//implementando a interface Comparable
public abstract class Forma implements Comparable <Forma>{
	
	private String nome;	
	public Forma(String nome) {
		super();
		this.nome = nome;
	}
	
	public abstract double obterArea();

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//implementando o metodo compareTo()
	public int compareTo(Forma f) {
		if (this.obterArea()<f.obterArea()) {
			return -1;
		}
		if (this.obterArea()>f.obterArea()) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Forma [nome=" + nome + "] ";
	}
	
}
