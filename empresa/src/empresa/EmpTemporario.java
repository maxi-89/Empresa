package empresa;

public class EmpTemporario extends Empleado {
	
	public EmpTemporario(int hsTrabajadas, double valorHora, Persona empleado, int antiguedad,double valorAntiguedad,double salarioFamiliar, double plusXesposa) {
		super(hsTrabajadas, valorHora,empleado,antiguedad,valorAntiguedad,salarioFamiliar,plusXesposa);
		
	}
	
	

	@Override
	public double calcularSueldo(Empleado x) {
		double sueldo;
	
		
		sueldo=(this.hsTrabajadas*this.valorHora)+(empleado.getCantHijos()*this.salarioFamiliar);
		if(empleado.isEstadoCivil()==true) {
			sueldo=sueldo+this.plusXesposa;
			
		}
		return sueldo;
		
	}
	
	

}
