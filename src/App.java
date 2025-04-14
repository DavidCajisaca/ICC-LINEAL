public class App {
    MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

    public static void main(String[] args) {
        App app = new App();
        int[] arreglo = {16, 20, 25, 1, 7};
        int valorBuscar = 12;
        
        int indice = app.metodosBusqueda.busquedaLineal(arreglo, valorBuscar);
        if (indice != -1) {
            System.out.println("Valor encontrado en : " + indice);
        } else {
            System.out.println("no encontrado");
        }
    }
}
