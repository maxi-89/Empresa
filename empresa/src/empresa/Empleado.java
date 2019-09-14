package empresa;

public abstract class Empleado {
	protected int hsTrabajadas;
	protected double valorHora;
	protected Persona empleado;
	protected int antiguedad;
	protected double valorAntiguedad;
	protected double salarioFamiliar;
	protected double plusXesposa;
	
	public Empleado(int hsTrabajadas, double valorHora, Persona empleado, int antiguedad, double valorAntiguedad,double salarioFamiliar, double plusXesposa) {
		this.hsTrabajadas=hsTrabajadas;
		this.valorHora=valorHora;
		this.empleado=empleado;
		this.antiguedad=antiguedad;
		this.valorAntiguedad=valorAntiguedad;
		this.salarioFamiliar=salarioFamiliar;
		this.plusXesposa=plusXesposa;
		
	}
	


	public abstract  double calcularSueldo(Empleado x);
	

}
