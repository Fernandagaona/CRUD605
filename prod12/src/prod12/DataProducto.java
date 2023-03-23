package prod12;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataProducto {
	conexion cx = new conexion ();
	public DataProducto() {
	}
	public boolean agregarProducto(producto np) {
		PreparedStatement ps = null;
		try {
			ps = cx.conectar().prepareStatement("INSERT INTO producto VALUES(null,?,?,?,?)");
			ps.setString(1, np.getDescripcion());
			ps.setDouble(2, np.getPrecio());
			ps.setInt(3, np.getCantidad());
			ps.setString(4, np.getProveedor());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	public boolean eliminarProducto(int ProductoID) {
		return true;
	}

	public boolean actualizarProducto(producto np) {
		return true;
	}

	public boolean mostrarProducto(producto np) {
		return true;
	}
	public boolean borrarProducto(producto np) {
		return true;
	}

}

