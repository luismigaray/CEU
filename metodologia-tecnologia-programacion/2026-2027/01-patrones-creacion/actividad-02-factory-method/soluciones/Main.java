public class Main {

    public static void main(String[] args) {
        Formulario formularioMovil = new FormularioMovil();
        System.out.println("Formulario móvil:");
        formularioMovil.mostrar();

        Formulario formularioEscritorio = new FormularioEscritorio();
        System.out.println("Formulario de escritorio:");
        formularioEscritorio.mostrar();
    }
}
