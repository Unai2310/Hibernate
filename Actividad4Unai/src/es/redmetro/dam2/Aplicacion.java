package es.redmetro.dam2;

import es.redmetro.dam2.dao.hibernate.AccesoHibernate;
import es.redmetro.dam2.dao.hibernate.CocheraHibernate;
import es.redmetro.dam2.dao.hibernate.ColorHibernate;
import es.redmetro.dam2.dao.hibernate.EstacionHibernate;
import es.redmetro.dam2.dao.hibernate.LineaHibernate;
import es.redmetro.dam2.dao.hibernate.TrenHibernate;

public class Aplicacion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccesoHibernate acceso = new AccesoHibernate();
		CocheraHibernate cochera = new CocheraHibernate();
		ColorHibernate color = new ColorHibernate();
		EstacionHibernate estacion = new EstacionHibernate();
		LineaHibernate linea = new LineaHibernate();
		TrenHibernate tren = new TrenHibernate();
	}
}
