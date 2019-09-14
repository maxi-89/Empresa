package empresa;

import java.util.ArrayList;

public class TestEmpresa {
	

	public static void main(String[] args) {
		ArrayList <Empleado> ArrayL;
		Empresa empresa1=new Empresa("pizzeria gerli", 99845789);
		ArrayL=empresa1.cargarArray();
		
		
		empresa1.MontoTotal(ArrayL);
	}

}
