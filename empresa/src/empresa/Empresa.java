package empresa;

import java.util.ArrayList;


public class Empresa {
	private String razonSocial;
	private long cuit;
	private ArrayList <Empleado> ArrayEmpleado;
	int i;
	
	public Empresa(String razonSocial, long cuit) {
		
		ArrayEmpleado = new ArrayList<Empleado>();
		this.cuit=cuit;
		this.razonSocial=razonSocial;
		
	}
	
	public void cargarArray() {
		Persona p1=new Persona ("roberto", 25, true, 2, 498, "vendedor");
		Empleado emp1=new EmpEfectivo(48, 360, p1, 5);
		
		ArrayEmpleado.add(0, emp1);
		
			
		
	}

	public  double MontoTotal(ArrayList<Empleado>ArrayEmpleado ) {
	double sueldoTotal=0;
	int i;
	
	for(i=0;i<=ArrayEmpleado.size();i++) {
		sueldoTotal=sueldoTotal+ArrayEmpleado
		
	}
	
	
	
	return sueldoTotal;
}}
