package es.redmetro.dam2.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.redmetro.dam2.dao.IEntornoDeTrabajo;
import es.redmetro.dam2.utilidades.UtilidadHibernate;
import es.redmetro.dam2.vo.Linea;

public class LineaHibernate implements IEntornoDeTrabajo<Linea> {

	@Override
	public void añadir(Linea objeto) {
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
	public void modificar(Linea objeto) {
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
	public void eliminar(Linea objeto) {
		// TODO Auto-generated method stub
		Session session = UtilidadHibernate.getSession();
		Transaction tx = session.beginTransaction();
		Linea linea = session.find(Linea.class, objeto.getCodLinea());
		if(linea!=null) {
			session.delete(objeto);
			tx.commit();
		}
		else {
			System.out.println("No existe la linea a borrar");
		}
		session.close();
	}

	@Override
	public Linea consultarporId(int codEntidad) {
		// TODO Auto-generated method stub
		Session session = UtilidadHibernate.getSession();
		Linea linea = session.find(Linea.class, codEntidad);
		if(linea==null) {
			System.out.println("No existe el tren");
		}
		session.close();
		return linea;
	}

	@Override
	public List<Linea> consultarLista() {
		// TODO Auto-generated method stub
		List<Linea> listaLineas = null;
		Session session = UtilidadHibernate.getSession();
		listaLineas = session.createNativeQuery("SELECT * FROM T_LINEA", Linea.class).list();
		return listaLineas;
	}

}
