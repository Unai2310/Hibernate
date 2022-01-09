package es.redmetro.dam2.dao;

import java.util.List;

public interface IEntornoDeTrabajo <T> {
	public void añadir(T objeto);
	public void modificar(T objeto);
	public void eliminar(T objeto);
	public T consultarporId(int codEntidad);
	public List<T> consultarLista();
}
