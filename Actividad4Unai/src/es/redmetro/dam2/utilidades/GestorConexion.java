package es.redmetro.dam2.utilidades;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestorConexion {
	public static Connection getConexion() throws IOException {
		Connection conexion=null;
		try {
			String driver=FicConfiguracion.getValor("driver").trim();
		    Class.forName(driver);

		    String sgbd=FicConfiguracion.getValor("sgbd").trim();
			String servidor=FicConfiguracion.getValor("servidor").trim();
			String puerto=FicConfiguracion.getValor("puerto").trim();
			String nombreBBDD=FicConfiguracion.getValor("nombreBBDD").trim();
			String usuarioBBDD=FicConfiguracion.getValor("usuarioBBDD").trim();
			String clave=FicConfiguracion.getValor("clave").trim();
			
			String urlConexionBBDD="jdbc:" + sgbd + "://"+ servidor + ":" + puerto + "/" + nombreBBDD;
			System.out.println(urlConexionBBDD);

			conexion = DriverManager.getConnection(urlConexionBBDD, usuarioBBDD, clave);
		} catch (ClassNotFoundException ex) {
			System.out.println("No se encontro el Driver MySQL para JDBC.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conexion;
	}
}