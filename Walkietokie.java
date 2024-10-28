public class Walkietokie extends  Oneway implements Mobile{
    protected boolean cosa;
    public Walkietokie(){
        this.cosa = false;
    }
    

    
    @Override
    public void llamarOneWay(Oneway cosa){
        System.out.println("Tocar timbre");
    }
    @Override
    public void mostrarInterface(){
        System.out.println("Mostranding");

    }
    @Override
    public void activarBotonMaestro(){
        if(cosa == true){
        System.out.println("Boto maestro activado en Walkie Talkie");
        this.boton = true;}
        else if (cosa  == false){
            System.out.println("....");
        }
    }
    @Override
    public void desactivarBotonMaestro(){
        if (cosa == true){
        System.out.println("Botom maestro desactivado");
        this.boton = false;
        }
        else if (cosa == false){
            System.out.println("...");
        }
    }
    @Override
    public void enviarMensajes(){

        if (cosa == true){
            if(this.boton == true)
                System.out.println("Desactiva el boton antes");
            else if (this.boton == false) 
                System.out.println("chhhg Cambio ");
                System.out.println("y fuera ");    
        }
        else if (cosa == false)
            System.out.println("...");
        
    }
    
    @Override
    public void botonOnOFF(){
        if (cosa == false)
            this.cosa = true;
        else if (cosa ==  true)
            this.cosa = false;


    }

    
    @Override
    public void isON(){
        if (cosa == false)
            System.out.println("...");
        else if (cosa ==  true)
            System.out.println("Esta prendido");


    }

    
    
}
