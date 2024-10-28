


public class Homephone extends TwoWays implements Fixed{
    protected String lugar;
    protected String adress;
    
    

    public Homephone(String numero, Exchange si){
        super(numero, si);
        lugar = null;
        adress = null;

    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getAdress() {
        return adress;
    }

    @Override
    public void localizar(String lugar){
        this.lugar = lugar;

    }
    public String getLugar() {
        return lugar;
    }

    @Override
    public void arreglar(){
        System.out.println("Arreglando el telefono del hogar");
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
            System.out.println("Contestando");
            valor = BUSY;
        }
    }

    @Override
    public void llamarTwoWays(String num){
        TwoWays si = central.find(num);
        if(si != null && si.valor == IDLE){
            System.out.println("Llamanding a: " + num);
            this.cosa1 = true;
            valor = BUSY;
        }   

    }
    @Override
    public void mandarMensaje(String num){
        TwoWays si = central.find(num);
        if (si != null){
            System.out.println("Mandando txt a: " + num);
        }
        else 
            System.out.println("numero no encontrado neni");
    }
    @Override
    public void escucharMensaje(String num){
        if (cosa1 == false)
            System.out.println("Mensaje:");
        else if (cosa1 == true)
            System.out.println("No puedes escuchar mensajes de aparatos a los que aun no has llamado");

    }
    
}
