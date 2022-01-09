package es.redmetro.dam2.vo;

public class Acceso {
	private int codAcceso;
	private String nombre;
	private boolean accesoDiscapacidad;
	private Estacion estacion;
	
	public Acceso() {
		
	}

	public Acceso(int codAcceso, String nombre, boolean accesoDiscapacidad, Estacion estacion) {
		this.codAcceso = codAcceso;
		this.nombre = nombre;
		this.accesoDiscapacidad = accesoDiscapacidad;
		this.estacion = estacion;
	}

	public int getCodAcceso() {
		return codAcceso;
	}

	public void setCodAcceso(int codAcceso) {
		this.codAcceso = codAcceso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isAccesoDiscapacidad() {
		return accesoDiscapacidad;
	}

	public void setAccesoDiscapacidad(boolean accesoDiscapacidad) {
		this.accesoDiscapacidad = accesoDiscapacidad;
	}

	public Estacion getEstacion() {
		return estacion;
	}

	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}

	@Override
	public String toString() {
		return "Acceso [codAcceso=" + codAcceso + ", nombre=" + nombre + ", accesoDiscapacidad=" + accesoDiscapacidad
				+ ", estacion=" + estacion + "]";
	}
	
	
	
}
