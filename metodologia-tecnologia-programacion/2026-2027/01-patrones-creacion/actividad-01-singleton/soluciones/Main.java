public class Main {

    public static void main(String[] args) {
        ConfiguracionInterfaz configuracion = ConfiguracionInterfaz.getInstancia();
        configuracion.setIdioma("EN");
        configuracion.setTamanoFuente(20);

        PantallaInicio pantallaInicio = new PantallaInicio();
        PantallaAjustes pantallaAjustes = new PantallaAjustes();

        pantallaInicio.mostrar();
        pantallaAjustes.mostrar();

        ConfiguracionInterfaz segundaReferencia = ConfiguracionInterfaz.getInstancia();
        System.out.println(
                "¿Las referencias apuntan al mismo objeto? "
                        + (configuracion == segundaReferencia)
        );
    }
}
