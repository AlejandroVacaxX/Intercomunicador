

public class Celular extends TwoWays  implements Mobile{

    protected boolean OnOff;
    protected String name;


    public Celular(String numero,Exchange si, String name){
        super(numero, si);
        this.OnOff = false;
        this.name = name;
        

    }
    @Override
    public void ring(){
        if(valor == IDLE){
            System.out.println("Sonando");
            valor = RINGING;
        }
    }
    @Override
    public void endCall(){
        if (valor == BUSY){
            System.out.println("Llamada finalizada");
            valor = IDLE;
        }
    }
    @Override
    public void answerCall(String num){
        if(valor == RINGING){
            System.out.println("Contestando a " + num);
            valor = BUSY;
        }
    }

    @Override
    public void llamarTwoWays(String num){
        if (OnOff == true){
            TwoWays si = central.find(num);
                if(si != null && si.valor == IDLE){
                    System.out.println("Llamando a " + num);
                    this.cosa1 = true;
                valor = BUSY;
                }
                else if (si == null || si.valor == BUSY) {
                    System.out.println("Telefono ocupado o no esta en nuestra base de datos");
                    }
        else if (OnOff == false)
            System.out.println("...");
    }

    }
    @Override
    public void mandarMensaje(String num){
        TwoWays si = central.find(num);
        if (si != null && cosa1 == true)
            System.out.println("Mandando txt a: " + num);
        else if (si == null)
            System.out.println("System.out.println(\"numero no encontrado neni\");");
        else 
            System.out.println("telefono apagado");
    }

    @Override
    public void escucharMensaje(String num){
        if (cosa1 == true && valor == IDLE){
            System.out.println("Mensaje:");
        }
        else if (cosa1 == false){
            System.out.println("No puedes escuchar mensajes de aparatos a los que aun no has llamado");}

    }

    @Override
    public void botonOnOFF(){
        if (this.OnOff == false)
            this.OnOff = true;
        else 
            this.OnOff = false;


    }
    @Override
    public void isON(){
        if (OnOff == false)
            System.out.println("Esta apagado");
        else if (OnOff ==  true)
            System.out.println("Esta prendido");


    }

    @Override
    public void mostrarInterface(){
        System.out.println("Funcion nada queverienta");

    }

    
    
    
}
