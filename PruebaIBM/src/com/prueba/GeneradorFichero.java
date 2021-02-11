package com.prueba;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneradorFichero {
	private GeneradorFichero() {
	}

	public static void generadorFichero(String id) {

		try (FileWriter file = new FileWriter(Constantes.ARCHIVO, true)) {

			ConMsql con = new ConMsql();
			List<Proveedores> proveedores = con.listProveedoresById(id);
			
			//Si no hay proveedores para el cliente asignado mostramos un mensaje por consola
			if (proveedores.isEmpty()) {
				
				System.out.println("El cliente no tiene proveedores asignados");
				
			} else {
				
			String cabecera = Constantes.CABECERAARCHIVO;
			file.write(cabecera);
			
			//Iteramos entre todos los proveedores con el mismo id de clientes
				for (Proveedores proveedores2 : proveedores) {
					file.write(String.valueOf(proveedores2.getId_proveedor()));
					file.write("\t");
					file.write(proveedores2.getNombre());
					file.write("\t\t");
					file.write(String.valueOf(proveedores2.getFecha_de_alta()));
					file.write("\r\n");

				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
