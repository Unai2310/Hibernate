package es.redmetro.dam2.vo;

public class LineaEstacion {
	private Linea linea;
	private Estacion estacion;
	private int ordenM;
	
	public LineaEstacion () {
		
	}
	
	public LineaEstacion(Linea linea, Estacion estacion, int ordenM) {
		super();
		this.linea = linea;
		this.estacion = estacion;
		this.ordenM = ordenM;
	}

	public Linea getLinea() {
		return linea;
	}
	public void setLinea(Linea linea) {
		this.linea = linea;
	}
	public Estacion getEstacion() {
		return estacion;
	}
	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}
	public int getOrdenM() {
		return ordenM;
	}
	public void setOrdenM(int ordenM) {
		this.ordenM = ordenM;
	}	
}
