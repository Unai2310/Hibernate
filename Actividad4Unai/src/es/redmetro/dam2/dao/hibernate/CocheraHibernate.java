package es.redmetro.dam2.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.redmetro.dam2.dao.IEntornoDeTrabajo;
import es.redmetro.dam2.utilidades.UtilidadHibernate;
import es.redmetro.dam2.vo.Cochera;

public class CocheraHibernate implements IEntornoDeTrabajo<Cochera> {

	@Override
	public void añadir(Cochera objeto) {
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
	public void modificar(Cochera objeto) {
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
	public void eliminar(Cochera objeto) {
		// TODO Auto-generated method stub
		Session session = UtilidadHibernate.getSession();
		Transaction tx = session.beginTransaction();
		Cochera cochera = session.find(Cochera.class, objeto.getCodCochera());
		if(cochera!=null) {
			session.delete(objeto);
			tx.commit();
		}
		else {
			System.out.println("No existe la cochera indicada");
		}
		session.close();
	}

	@Override
	public Cochera consultarporId(int codEntidad) {
		// TODO Auto-generated method stub
		Session session = UtilidadHibernate.getSession();	
		Cochera cochera = session.find(Cochera.class, codEntidad);
		if(cochera==null) {
			System.out.println("No existe la cochera");
		}	
		session.close();
		return cochera;
	}

	@Override
	public List<Cochera> consultarLista() {
		// TODO Auto-generated method stub
		List<Cochera> listaCocheras = null;
		Session session = UtilidadHibernate.getSession();
		listaCocheras = session.createNativeQuery("SELECT * FROM T_COCHERA", Cochera.class).list();
		return listaCocheras;
	}

}
