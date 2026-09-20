public class PantallaAjustes {

    public void mostrar() {
        ConfiguracionInterfaz configuracion = ConfiguracionInterfaz.getInstancia();

        System.out.println(
                "Pantalla Ajustes - Idioma: " + configuracion.getIdioma()
                        + ", tamaño de fuente: " + configuracion.getTamanoFuente()
        );
    }
}
