package es.redmetro.dam2.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.redmetro.dam2.dao.IEntornoDeTrabajo;
import es.redmetro.dam2.utilidades.UtilidadHibernate;
import es.redmetro.dam2.vo.Color;

public class ColorHibernate implements IEntornoDeTrabajo<Color> {

	@Override
	public void añadir(Color objeto) {
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
	public void modificar(Color objeto) {
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
	public void eliminar(Color objeto) {
		// TODO Auto-generated method stub
		Session session = UtilidadHibernate.getSession();
		Transaction tx = session.beginTransaction();
		Color color = session.find(Color.class, objeto.getCodColor());
		if(color!=null) {
			session.delete(objeto);
			tx.commit();
		}
		else {
			System.out.println("No existe el color indicado");
		}
		session.close();
	}

	@Override
	public Color consultarporId(int codEntidad) {
		// TODO Auto-generated method stub
		Session session = UtilidadHibernate.getSession();
		Color color = session.find(Color.class, codEntidad);
		if(color==null) 
			System.out.println("No existe el color");
		
		session.close();
		return color;
	}

	@Override
	public List<Color> consultarLista() {
		// TODO Auto-generated method stub
		List<Color> listaColores = null;
		Session session = UtilidadHibernate.getSession();
		listaColores = session.createNativeQuery("SELECT * FROM T_COLOR", Color.class).list();
		return listaColores;
	}

}
