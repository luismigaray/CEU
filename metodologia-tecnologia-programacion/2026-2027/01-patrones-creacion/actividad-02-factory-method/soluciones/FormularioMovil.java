public class FormularioMovil extends Formulario {

    @Override
    public CampoTexto crearCampoTexto() {
        return new CampoTextoMovil();
    }
}
