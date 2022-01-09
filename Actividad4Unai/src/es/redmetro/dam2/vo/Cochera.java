package es.redmetro.dam2.vo;

public class Cochera {
	private int codCochera;
	private String nombre;
	private String direccion;
	private int deposito;
	
	public Cochera(){
		
	}
	
	public Cochera (int codCochera, String nombre, String direccion, int deposito){
		this.codCochera=codCochera;
		this.nombre=nombre;
		this.direccion=direccion;
		this.deposito=deposito;
	}
	
	public int getCodCochera() {
		return codCochera;
	}
	public void setCodCochera(int codigoCochera) {
		this.codCochera = codigoCochera;
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
	public int getDeposito() {
		return deposito;
	}
	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}
	
	public String toString() {
		return "Cochera [codigoCochera=" + codCochera + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", deposito=" + deposito + "]";
	}
}
