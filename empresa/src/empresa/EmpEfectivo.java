package empresa;

public class EmpEfectivo extends Empleado {

	
	public EmpEfectivo(int hsTrabajadas, double valorHora, Persona empleado, int antiguedad) {
		super(hsTrabajadas, valorHora,empleado,antiguedad);
		
	}
	
	
	
	
	
	@Override
	public double calcularSueldo() {
		
		
		
		return sueldo;
		
	}


	
	
	

}
