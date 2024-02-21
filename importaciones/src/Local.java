import java.util.ArrayList;

class Local {
    private ArrayList<Nacional> productosNacionales = new ArrayList<>();
    private ArrayList<Importado> productosImportados = new ArrayList<>();

    public void registrarProductoNacional(Nacional productoNacional) {
        productosNacionales.add(productoNacional);
    }

    public void registrarProductoImportado(Importado productoImportado) {
        productosImportados.add(productoImportado);
    }

    public void listarProductosNacionales() {
        for (Nacional producto : productosNacionales) {
            System.out.println(producto);
        }
    }

    public void listarProductosImportados() {
        for (Importado producto : productosImportados) {
            System.out.println(producto);
        }
    }

    public Nacional buscarProductoNacional(String nombre) {
        for (Nacional producto : productosNacionales) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public Importado buscarProductoImportado(String nombre) {
        for (Importado producto : productosImportados) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }
}