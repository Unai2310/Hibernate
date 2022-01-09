package es.redmetro.dam2.utilidades;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FicConfiguracion {
	public static String getValor(String clave) throws IOException {
		Properties config = new Properties();
		InputStream Entrada = new FileInputStream("config.properties");
		config.load(Entrada);
		return config.getProperty(clave);
	}
}