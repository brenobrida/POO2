package Aula_02;

public class Operacao {

	private double a, b, resultado = 1;

	public Operacao(double a, double b) {
		this.a = a;
		this.b = b;
	}

	void soma() {
		this.resultado = this.a + this.b;
	}

	void med(double a, double b) {
		this.resultado = (a + b) / 2;
	}

	double medp(int p1, int p2) {

		return ((a * p1) + (b * p2)) / (p1 + p2);
	}

	double mult() {
		return this.a * this.b;
	}

	double div(double a, double b) {
		return a / b;
	}

	void sub() {
		this.resultado = this.a - this.b;
	}

	double pot() {

		resultado = 1;

		for (int x = 1; x <= b; x++) {
			this.resultado *= a;
		}

		return this.resultado;
	}

	void fat(int a) {

		resultado = 1;

		for (int x = 1; x <= a; x++) {
			resultado *= x;
		}

	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
}
