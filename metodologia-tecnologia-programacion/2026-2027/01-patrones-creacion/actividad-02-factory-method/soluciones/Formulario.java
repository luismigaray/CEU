public abstract class Formulario {

    public abstract CampoTexto crearCampoTexto();

    public void mostrar() {
        CampoTexto campoTexto = crearCampoTexto();
        campoTexto.dibujar();
    }
}
