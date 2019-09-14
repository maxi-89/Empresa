package empresa;

public abstract class Empleado {
	private int hsTrabajadas;
	private double valorHora;
	private Persona empleado;
	private int antiguedad;
	
	public Empleado(int hsTrabajadas, double valorHora, Persona empleado, int antiguedad) {
		this.hsTrabajadas=hsTrabajadas;
		this.valorHora=valorHora;
		this.empleado=empleado;
		this.antiguedad=antiguedad;
		
	}
	


	public abstract double calcularSueldo();
	

}
