package es.redmetro.dam2.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.redmetro.dam2.dao.IEntornoDeTrabajo;
import es.redmetro.dam2.utilidades.UtilidadHibernate;
import es.redmetro.dam2.vo.Tren;

public class TrenHibernate implements IEntornoDeTrabajo<Tren> {

	@Override
	public void añadir(Tren objeto) {
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
	public void modificar(Tren objeto) {
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
	public void eliminar(Tren objeto) {
		// TODO Auto-generated method stub
		Session session = UtilidadHibernate.getSession();
		Transaction tx = session.beginTransaction();
		Tren tren = session.find(Tren.class, objeto.getCodTren());
		if(tren!=null) {
			session.delete(objeto);
			tx.commit();
		}
		else {
			System.out.println("No existe el tren a borrar");
		}
		session.close();
	}

	@Override
	public Tren consultarporId(int codEntidad) {
		// TODO Auto-generated method stub
		Session session = UtilidadHibernate.getSession();
		Tren tren = session.find(Tren.class, codEntidad);
		if(tren==null) {
			System.out.println("No existe el tren");
		}
		session.close();
		return tren;
	}

	@Override
	public List<Tren> consultarLista() {
		// TODO Auto-generated method stub
		List<Tren> listaTrenes = null;
		Session session = UtilidadHibernate.getSession();
		listaTrenes = session.createNativeQuery("SELECT * FROM T_TREN", Tren.class).list();
		return listaTrenes;
	}

}
