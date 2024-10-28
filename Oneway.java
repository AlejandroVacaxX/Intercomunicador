public class Oneway extends  Intercomunicador{
    protected boolean boton;
    protected long num;
    

    public Oneway() {
        this.boton = false;
        this.num = 0;
    }
    public long getNum() {
        return num;
    }
    public void setNum(long num) {
        this.num = num;
    }
    
    public void llamarOneWay(Oneway num){
        System.out.println("Llamanding");

    }
    public void activarBotonMaestro(){
        System.out.println("Botom maestro pulsado");
        this.boton = true;
    }
    public void desactivarBotonMaestro(){
        System.out.println("Botom maestro pulsado");
        this.boton = true;
    }

    public void enviarMensajes(){
        if(this.boton == false)
            System.out.println("No se puede enviar mensajes sin antes presionar el boton");
        else if (this.boton == true) 
            System.out.println("Digita el mensaje: ");
            System.out.println("Mensaje enviado: ");    
        
    }
    /*  
    Para enviar mensajes se debe oprimir el botón maestro.
    Para escuchar mensajes se debe liberar el botón maestro.
    Todos los aparatos escuchan los mensajes enviados.
    */
    
}
