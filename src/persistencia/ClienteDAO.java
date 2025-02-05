package persistencia;

import java.sql.SQLException;

import entidades.Cliente;

public class ClienteDAO extends DAO {

    public void guardarCliente(Cliente cliente) throws Exception {

        if (cliente == null) {
            throw new Exception("El cliente no puede ser nulo");
            }

        try {
            int codigoCliente = cliente.getCodigoCliente();
            String nombreCliente = cliente.getNombreCliente();
            String apellidoContacto = cliente.getApellidoContacto();
            String telefono = cliente.getTelefono();
            String fax = cliente.getFax();
            String ciudad = cliente.getCiudad();
            String region = cliente.getRegion();
            String pais = cliente.getPais();
            String codigoPostal = cliente.getCodigoPostal();
            int idEmpleado = cliente.getIdEmpleado();
            double limiteCredito = cliente.getLimiteCredito();

            String sql = "INSERT INTO cliente (codigo_cliente, nombre_cliente, nombre_contacto, apellido_contacto, telefono, fax, ciudad, region, pais, codigo_postal, id_empleado, limite_credito) VALUES ("
                        + nombreCliente + ","
                        + codigoCliente + ","
                        + apellidoContacto+ ","
                        + telefono + ","    
                        + fax + ","
                        + ciudad + ","
                        + region + ","
                        + pais + ","
                        + codigoPostal + ","
                        + idEmpleado + ","
                        + limiteCredito+ ")";
            insertarModificarEliminarDataBase(sql);
        } catch (SQLException e) {
            System.out.println("Datos incorrectos.");
        }

    }
}
