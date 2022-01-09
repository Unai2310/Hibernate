package es.redmetro.dam2.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.redmetro.dam2.dao.IEntornoDeTrabajo;
import es.redmetro.dam2.utilidades.UtilidadHibernate;
import es.redmetro.dam2.vo.Estacion;

public class EstacionHibernate implements IEntornoDeTrabajo<Estacion> {

	@Override
	public void añadir(Estacion objeto) {
		// TODO Auto-generated method stub
		Session session = UtilidadHibernate.getSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(objeto);
			tx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void modificar(Estacion objeto) {
		// TODO Auto-generated method stub
		Session session = UtilidadHibernate.getSession();
		Transaction tx = session.beginTransaction();
		try {
			session.update(objeto);
			tx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void eliminar(Estacion objeto) {
		// TODO Auto-generated method stub
		Session session = UtilidadHibernate.getSession();
		Transaction tx = session.beginTransaction();
		Estacion estacion = session.find(Estacion.class, objeto.getCodEstacion());
		if(estacion!=null) {
			session.delete(objeto);
			tx.commit();
		}
		else {
			System.out.println("No existe la estacion a borrar");
		}
		session.close();
	}

	@Override
	public Estacion consultarporId(int codEntidad) {
		// TODO Auto-generated method stub
		Session session = UtilidadHibernate.getSession();
		Estacion estacion = session.find(Estacion.class, codEntidad);
		if(estacion==null) { 
			System.out.println("No existe el tren");
		}
		session.close();
		return estacion;
	}

	@Override
	public List<Estacion> consultarLista() {
		// TODO Auto-generated method stub
		List<Estacion> listaEstaciones = null;
		Session session = UtilidadHibernate.getSession();
		listaEstaciones = session.createNativeQuery("SELECT * FROM T_TREN", Estacion.class).list();
		return listaEstaciones;
	}

}
