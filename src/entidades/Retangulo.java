package entidades;

public class Retangulo {

	public double altura;
	public double largura;
	
	public double Area(double largura, double altura) {
		return largura * altura;
	}
	
	public double Perimetro(double largura, double altura) {
		return (2*altura)+(2*largura);
	}
	
	public double Diagonal(double largura, double altura) {
		return Math.sqrt((largura * largura) + (altura * altura));
	}
}
