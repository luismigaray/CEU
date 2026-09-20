public class PantallaInicio {

    public void mostrar() {
        ConfiguracionInterfaz configuracion = ConfiguracionInterfaz.getInstancia();

        System.out.println(
                "Pantalla Inicio - Idioma: " + configuracion.getIdioma()
                        + ", tamaño de fuente: " + configuracion.getTamanoFuente()
        );
    }
}
