public class Interfono extends Oneway  implements Fixed{
    protected  String lugar;
    protected  String adress;
    

    public Interfono(String lugar, String adress) {
        this.lugar = lugar;
        this.adress = adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getAdress() {
        return adress;
    }

    @Override
    public void llamarOneWay(Oneway cosa){
        System.out.println("tocar timbre");
    }
    
    @Override
    public void arreglar(){
        System.out.println("Arreglando problema");
    }
    @Override
    public void activarBotonMaestro(){
        System.out.println("Boto maestro activado en Interfono");
        this.boton = true;
    }
    @Override
    public void desactivarBotonMaestro(){
        System.out.println("Botom maestro desactivado en interfono");
        this.boton = false;
    }
    @Override
    public void enviarMensajes(){
        if(this.boton == true)
            System.out.println("Desactiva el boton antes");
        else if (this.boton == false) 
            System.out.println("Habla: "); 
        
    }

    @Override
    public void localizar(String lugar){
        this.lugar = lugar;

    }
    public String getLugar() {
        return lugar;
    }
    
}
