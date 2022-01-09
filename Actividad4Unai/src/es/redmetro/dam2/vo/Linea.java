package es.redmetro.dam2.vo;

import java.util.List;

public class Linea {
	private int codLinea;
	private String nombreCorto;
	private String nombreLargo;
	private List<Estacion> estaciones;
	private Color color;
	private float kilometros;
	
	public Linea () {
		
	}
	
	public Linea(int codLinea, String nombreCorto, String nombreLargo, List<Estacion> estaciones, Color color,float kilometros) {
		this.codLinea = codLinea;
		this.nombreCorto = nombreCorto;
		this.nombreLargo = nombreLargo;
		this.estaciones = estaciones;
		this.color = color;
		this.kilometros = kilometros;
	}

	public int getCodLinea() {
		return codLinea;
	}
	public void setCodLinea(int codLinea) {
		this.codLinea = codLinea;
	}
	public String getNombreCorto() {
		return nombreCorto;
	}
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}
	public String getNombreLargo() {
		return nombreLargo;
	}
	public void setNombreLargo(String nombreLargo) {
		this.nombreLargo = nombreLargo;
	}
	public List<Estacion> getEstaciones() {
		return estaciones;
	}
	public void setEstaciones(List<Estacion> estaciones) {
		this.estaciones = estaciones;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public float getKilometros() {
		return kilometros;
	}
	public void setKilometros(float kilometros) {
		this.kilometros = kilometros;
	}
}
