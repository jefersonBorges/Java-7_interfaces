package geometric_shapes;

public class App {
	
	public static void main(String[]args) {
		
		Forma formas[] = new Forma[6];
		formas[0] = new Circulo("Circulo", 10);
		formas[1] = new Cubo("Cubo", 10);
		formas[2] = new Esfera("Esfera", 10);
		formas[3] = new Quadrado("Quadrado", 10);
		formas[4] = new Tetraedro("Tetraedro", 10);
		formas[5] = new Triangulo("Triangulo", 10, 10);
		
		for(Forma f : formas) {
			System.out.println(f.toString() + "Area : " + f.obterArea());
			if(f instanceof FormaTridimensional) {
				System.out.println("Volume: "+((FormaTridimensional)f).obterVolume());
			}
			System.out.println("\n");
		}
		
		//Utilizando ometodo para comparacao entre as areas do circulo e do quadrado
		switch(formas[0].compareTo(formas[3])) {
		case -1:
			System.out.println("O Quadrado eh maior");
			break;
		case 1:
			System.out.println("O Circulo eh maior");
			break;
		default:
			System.out.println("As duas formas tem o mesmo tamanho de area");
		};
		
	}

}