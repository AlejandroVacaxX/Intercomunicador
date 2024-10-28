import java.util.ArrayList;

public class TwoWays  extends Intercomunicador{
    protected boolean cosa1;
    public static final int IDLE = 0;
    public static final int BUSY = 1;
    public static final int RINGING = 2;
    public String numero;
    protected Exchange central;
    protected  int valor;
    ArrayList<Exchange> arr = new ArrayList<>();
    

    public TwoWays(String numero,Exchange central) {
        cosa1 = false; // false == disponible
        this.numero = numero;
        this.valor = 0;
        this.central = central;
        this.arr = new ArrayList<>();

        
    }
    /*El método endCall() desconecta los teléfonos. 
    Finalmente, los métodos ring() y answerCall() 
    contienen la lógica de timbrado y de contestar la llamada, respectivamente.
    Adicionalmente, Two Way contiene métodos para enviar y recibir mensajes. */
    public void ring(){
        if(valor == IDLE){
            System.out.println("Sonando");
            valor = RINGING;
        }
    }
    public void endCall(){
        if (valor == BUSY){
            System.out.println("Llamada finalizada");
            valor = IDLE;
        }
    }
    public void answerCall(String num){
        if(valor == RINGING){
            System.out.println("Contestando");
            valor = BUSY;
        }
    }

    
    public void llamarTwoWays(String num){
        TwoWays si = central.find(num);
        if(si != null && si.valor == IDLE){
            System.out.println("Llamanding a: " + num);
            this.cosa1 = true;
            valor = BUSY;
        }   

    }

    public void mandarMensaje(String num){
        TwoWays si = central.find(num);
        if (si != null){
            System.out.println("Mandando txt a: " + num);
        }
        else 
            System.out.println("numero no encontrado neni");
    }

    public void escucharMensaje(String num){
        if (cosa1 == false)
            System.out.println("Mensaje:");
        else if (cosa1 == true)
            System.out.println("No puedes escuchar mensajes de aparatos a los que aun no has llamado");

    }

    
}
