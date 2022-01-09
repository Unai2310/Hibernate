package es.redmetro.dam2.vo;

public class Color {
	private int codColor;
	private String nombre;
	private String codHex;
	
	public Color () {
		
	}

	public Color(int codColor, String nombre, String codHex) {
		this.codColor = codColor;
		this.nombre = nombre;
		this.codHex = codHex;
	}

	public int getCodColor() {
		return codColor;
	}
	public void setCodColor(int codColor) {
		this.codColor = codColor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodHex() {
		return codHex;
	}
	public void setCodHex(String codHex) {
		this.codHex = codHex;
	}
}
