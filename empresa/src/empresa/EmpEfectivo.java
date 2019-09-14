package empresa;

public class EmpEfectivo extends Empleado {

	
	public EmpEfectivo(int hsTrabajadas, double valorHora, Persona empleado, int antiguedad,double valorAntiguedad,double salarioFamiliar, double plusXesposa) {
		super(hsTrabajadas, valorHora,empleado,antiguedad,valorAntiguedad,salarioFamiliar,plusXesposa);
		
	}
	
	
	
	
	
	public double calcularSueldo(Empleado x) {
		double sueldo;
	
		
		sueldo=(this.hsTrabajadas*this.valorHora)+(this.antiguedad*this.valorAntiguedad)+(empleado.getCantHijos()*this.salarioFamiliar);
		if(empleado.isEstadoCivil()==true) {
			sueldo=sueldo+this.plusXesposa;
			
		}
		return sueldo;
	}


	
	
	

}
