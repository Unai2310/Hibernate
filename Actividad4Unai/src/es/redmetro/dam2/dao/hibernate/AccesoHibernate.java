package es.redmetro.dam2.dao.hibernate;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import es.redmetro.dam2.dao.IEntornoDeTrabajo;
import es.redmetro.dam2.utilidades.UtilidadHibernate;
import es.redmetro.dam2.vo.Acceso;

public class AccesoHibernate implements IEntornoDeTrabajo<Acceso> {

	@Override
	public void añadir(Acceso objeto) {
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
	public void modificar(Acceso objeto) {
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
	public void eliminar(Acceso objeto) {
		// TODO Auto-generated method stub
		Session session = UtilidadHibernate.getSession();
		Transaction tx = session.beginTransaction();
		Acceso acceso = session.find(Acceso.class, objeto.getCodAcceso());
		if(acceso!=null) {
			session.delete(objeto);
			tx.commit();
		}
		else {
			System.out.println("No existe el acceso indicado");
		}
		session.close();
	}

	@Override
	public Acceso consultarporId(int codEntidad) {
		// TODO Auto-generated method stub
		Session session = UtilidadHibernate.getSession();
		Acceso acceso = session.find(Acceso.class, codEntidad);
		if(acceso==null) {
			System.out.println("No existe el acceso");
		}
		session.close();
		return acceso;
	}

	@Override
	public List<Acceso> consultarLista() {
		// TODO Auto-generated method stub
		List<Acceso> listaAccesos = null;
		Session session = UtilidadHibernate.getSession();
		listaAccesos = session.createNativeQuery("SELECT * FROM T_ACCESO", Acceso.class).list();
		return listaAccesos;
	}

}
