import java.util.ArrayList;


public class Exchange  {

    private final ArrayList <TwoWays> listaAparatos;

    public Exchange() {
        listaAparatos = new ArrayList<>();
    }

    public void agregarAparato(Celular aparato) {
        listaAparatos.add(aparato);
    }

    public void agregarAparato(Homephone aparato) {
        listaAparatos.add(aparato);
    }

    public TwoWays find(String num) {
        for (TwoWays aparato : listaAparatos) {
            if (aparato.numero.equals(num)) {
                return aparato;
            }
        }
        return null;  // Si no se encuentra el número
    }
    
}

