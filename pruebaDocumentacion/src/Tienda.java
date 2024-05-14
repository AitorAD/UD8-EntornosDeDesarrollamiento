import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa una Tienda.
 *
 * @see ProductoNuevo Esta clase usa el Objeto ProductoNuevo
 * @author Aitor Agullo Duque
 * @version 1.1
 */
public class Tienda {

    private List<ProductoNuevo> inventario;

    /**
     * Constructor por defecto clase Tienda
     */
    public Tienda() {
        inventario = new ArrayList<>();
    }

    /**
     * Este metodo agrega un Producto.
     * @param producto
     */
    public void agregarProducto(ProductoNuevo producto) {
        inventario.add(producto);
    }

    /**
     * Esta clase busca un producto en base a su nombre
     * @param nombre El nombre del producto que quieres buscar
     * @return El Objeto Producto
     */
    public ProductoNuevo buscarProducto(String nombre) {
        for (ProductoNuevo producto : inventario) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    /**
     * Este metodo realiza una venta si el producto existe y la cantidad es mayor o igual que la cantidad de productos
     * que quedan en stock. Si el producto ha sido encontrado se actualizara el stock.
     * @param nombre El nombre del producto
     * @param cantidad La cantidad que se quiere vender
     * @return true si se ha actualizado el stock o false sino se ha podido
     */
    public boolean realizarVenta(String nombre, int cantidad) {
        ProductoNuevo producto = buscarProducto(nombre);
        if (producto != null && producto.getCantidadDisponible() >= cantidad) {
            producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidad);
            return true;
        }
        return false;
    }
}