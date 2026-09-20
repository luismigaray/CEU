public class ConfiguracionInterfaz {

    private static ConfiguracionInterfaz instancia;

    private String idioma;
    private int tamanoFuente;

    private ConfiguracionInterfaz() {
        idioma = "ES";
        tamanoFuente = 16;
    }

    public static ConfiguracionInterfaz getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionInterfaz();
        }
        return instancia;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getTamanoFuente() {
        return tamanoFuente;
    }

    public void setTamanoFuente(int tamanoFuente) {
        this.tamanoFuente = tamanoFuente;
    }
}
