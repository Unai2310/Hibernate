package es.redmetro.dam2.vo;

import java.sql.Date;

public class Tren {
	private int codTren;
	private String modelo;
	private Date incoporacion;
	private String constructora;
	private Linea linea;
	private Cochera cochera;
	
	public Tren() {
		
	}

	public Tren(int codTren, String modelo, Date incoporacion, String constructora, Linea linea, Cochera cochera) {
		this.codTren = codTren;
		this.modelo = modelo;
		this.incoporacion = incoporacion;
		this.constructora = constructora;
		this.linea = linea;
		this.cochera = cochera;
	}

	public int getCodTren() {
		return codTren;
	}
	public void setCodTren(int codTren) {
		this.codTren = codTren;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Date getIncoporacion() {
		return incoporacion;
	}
	public void setIncoporacion(Date incoporacion) {
		this.incoporacion = incoporacion;
	}
	public String getConstructora() {
		return constructora;
	}
	public void setConstructora(String constructora) {
		this.constructora = constructora;
	}
	public Linea getLinea() {
		return linea;
	}
	public void setLinea(Linea linea) {
		this.linea = linea;
	}
	public Cochera getCochera() {
		return cochera;
	}
	public void setCochera(Cochera cochera) {
		this.cochera = cochera;
	}
}
