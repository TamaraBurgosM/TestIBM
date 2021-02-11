package com.prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

public class ConMsql {

	public Connection conn() {
		
		//Generacion de la ruta de conexion
		String url  = "jdbc:mysql://" + Constantes.HOST + ":" + Constantes.PORT + "/" + Constantes.DB + "?user=" + Constantes.USER + "&password=" + Constantes.PASS + "&useSSL=false"; 
		 
		try {
			//Si conecta correctamente devolvemos la conexion
			return DriverManager.getConnection(url);
			
		} catch (SQLException e) { 
			//Si hay algun problema lo mostramos por consola
			System.out.println("Error al conectar la BD "+e);
			
		}
		return null;

	}

	public List<Proveedores> listProveedoresById(String id)  {
		
		List<Proveedores> listProveedores = new ArrayList<>();
		
		//Query a ejecutar
		String query = "select id_proveedor, nombre, fecha_de_alta from proveedores where id_cliente=" + id;

		//Generacion del result set
		try (Connection connection = conn();
				PreparedStatement stmt = connection.prepareStatement(query);
				ResultSet rs = stmt.executeQuery()){
			
			//Iteracion de los elementos devueltos y guardado en lista
			while (rs.next()) {
				Proveedores proveedor = new Proveedores();
				proveedor.setId_proveedor(rs.getInt("id_proveedor"));
				proveedor.setNombre(rs.getString("nombre"));
				proveedor.setFecha_de_alta(rs.getDate("fecha_de_alta"));

				listProveedores.add(proveedor);
			}
			
		} catch (Exception e) { 
			System.out.println("Error al devolver los datos de la BD "+e);
		} 
 

		return listProveedores;
		
		 
	}
}
