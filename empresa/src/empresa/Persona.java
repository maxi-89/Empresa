package empresa;

public class Persona {
	private String nombre;
	private int edad;
	private boolean estadoCivil;
	private int cantHijos;
	private int legajo;
	private String cargo;
	
	public Persona(String nombre, int edad, boolean estadoCivil, int cantHijos, int legajo, String cargo) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setEstadoCivil(estadoCivil);
		this.setCantHijos(cantHijos);
		this.setLegajo(legajo);
		this.setCargo(cargo);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(boolean estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
