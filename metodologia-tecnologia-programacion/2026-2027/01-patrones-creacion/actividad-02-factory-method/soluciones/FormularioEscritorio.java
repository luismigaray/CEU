public class FormularioEscritorio extends Formulario {

    @Override
    public CampoTexto crearCampoTexto() {
        return new CampoTextoEscritorio();
    }
}
