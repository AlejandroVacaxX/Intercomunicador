

public class Main{
    public static void main(String[] args) {
        

        Exchange centralTelefonica_Telmex = new Exchange();
        Exchange centralTelefonica_Telcel = new Exchange();
        
        

        Celular SIMtelcel = new Celular("5544496679",centralTelefonica_Telmex, "Alejandro Vaca");
        Celular SIMmovistar = new Celular("5588774491",centralTelefonica_Telmex, "Diego Vazquez");

        

        centralTelefonica_Telcel.agregarAparato(SIMtelcel);
        centralTelefonica_Telcel.agregarAparato(SIMmovistar);

        Homephone casa1 = new Homephone("5",centralTelefonica_Telcel);
        Homephone casa2 = new Homephone("5",centralTelefonica_Telcel);

        centralTelefonica_Telcel.agregarAparato(casa1);
        centralTelefonica_Telcel.agregarAparato(casa2);


        Interfono casa11 = new Interfono("Cocina", "La morena, 703 Narvarte Poniente");
        Interfono casa22 = new Interfono("Sala", "Del Valle, Gabriel Mancera 1003");
        
        


        SIMtelcel.botonOnOFF();
        SIMmovistar.botonOnOFF();
        SIMmovistar.llamarTwoWays("5544496679");
        SIMtelcel.ring();
        SIMtelcel.answerCall(SIMmovistar.name);
        

    }
}