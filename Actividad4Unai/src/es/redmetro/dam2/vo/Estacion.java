package es.redmetro.dam2.vo;

import java.util.List;

public class Estacion {
	private int codEstacion;
	private String nombre;
	private String direccion;
	private List<Linea> lineas;
	
	public Estacion () {
		
	}
	
	public Estacion(int codEstacion, String nombre, String direccion, List<Linea> lineas) {
		super();
		this.codEstacion = codEstacion;
		this.nombre = nombre;
		this.direccion = direccion;
		this.lineas = lineas;
	}

	public int getCodEstacion() {
		return codEstacion;
	}
	public void setCodEstacion(int codEstacion) {
		this.codEstacion = codEstacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Linea> getLineas() {
		return lineas;
	}
	public void setLineas(List<Linea> lineas) {
		this.lineas = lineas;
	}
}
