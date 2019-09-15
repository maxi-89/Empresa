package empresa;

import java.util.ArrayList;


public class Empresa {
	private String razonSocial;
	private long cuit;
	private ArrayList <Empleado> ArrayEmpleado;
	int i;
	
	public Empresa(String razonSocial, long cuit) {
		
		
		this.cuit=cuit;
		this.razonSocial=razonSocial;
		
	}
	
	public ArrayList <Empleado> cargarArray() {
		ArrayEmpleado = new ArrayList<Empleado>();
		Persona p1=new Persona ("roberto gomez", 25, true, 2, 498, "permanente");
		Persona p2=new Persona ("gonzalo arias", 32, false,0, 512, "permanente");
		Persona p3=new Persona ("ignacio zabala", 25, true, 0, 589, "temporario");
		Persona p4=new Persona ("santino rodriguez",45, true, 1, 027, "gerente");
		
		//hsTrabajadas, valorHora,empleado,antiguedad,valorAntiguedad,salarioFamiliar,plusXesposa
		Empleado emp1=new EmpEfectivo(80, 300, p1, 6,100,200,100);
		Empleado emp2=new EmpEfectivo(160, 300, p2, 4,100,200,100);
		Empleado emp3=new EmpTemporario(80, 200, p3, 0,0,200,0);
		Empleado emp4=new EmpGerente(160, 300, p4, 10,150,200,100);
		
		ArrayEmpleado.add(0, emp1);
		ArrayEmpleado.add(1, emp2);
		ArrayEmpleado.add(2, emp3);
		ArrayEmpleado.add(3, emp4);
			
		return ArrayEmpleado;
		
	}

	public  void MontoTotal(ArrayList<Empleado>ArrayEmpleado ) {
	double sueldoTotal=0;
	int i;
	
	for(i=0;i<ArrayEmpleado.size();i++) {
		sueldoTotal=sueldoTotal+this.ArrayEmpleado.get(i).calcularSueldo(ArrayEmpleado.get(i));
		
	}
	
	System.out.println(sueldoTotal);
	
	
}}
