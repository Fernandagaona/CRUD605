package prod12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
Connection cx;
String url="jdbc:mysql://localhost:3306/a605";
String user="root";
String password="";
public conexion() {
	
}
public Connection conectar() {
	try {
		cx=DriverManager.getConnection(url,user,password);
		System.out.println("CONEXION EXITOSA|");
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return cx;
}
public void desconectar() {
	try {
		cx.close();
		System.out.println("DESCONEXION EXITOSA");
	} catch (SQLException e) {
		e.printStackTrace();
	
		e.printStackTrace();
	}
}
public static void main(String [] args) {
	conexion c=new conexion(); 
		c.conectar();
		c.desconectar();
}
public boolean agregarProducto(visitaproducto np) {
	return true;
}
public boolean eliminarProducto(String ProductoID) {
	return true;
}
public boolean actualizarProducto(visitaproducto np) {
	return true;
}
public boolean mostrarProducto(visitaproducto np) {
	return true;
}
public boolean borrarProducto(visitaproducto np) {
	return true;
}

}