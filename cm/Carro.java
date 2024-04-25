package cm;
public class Carro {
    Motor motor;
    Chasis chasis;
    Llanta[] llantas;
    Carroceria carroceria;
    public Carro(int volumen, tipoChasis claseChasis, tipoCarroceria claseCarroceria, String color, String marca, int diametroRin, int altura, int anchura) {
        motor = new Motor(volumen);
        chasis = new Chasis(claseChasis);
        carroceria = new Carroceria(claseCarroceria, color);
        llantas = new Llanta[4];
        for (int i = 0; i < llantas.length; i++) {
            llantas[i]= new Llanta(marca, diametroRin, altura,anchura);
        }
        
    }
    void imprimir(){
        System.out.println("Datos del carro");
        System.out.println("Motor en volumen = " +motor.volumen);
        System.out.println("Tipo de chasis = " +chasis.tipo);
        System.out.println("Tipo de carroceria = " +carroceria.tipo + " Color = " +carroceria.color);
        System.out.println("Cantidad de LLantas " +llantas.length);
        for (int i = 0; i < llantas.length; i++) 
            llantas[i].imprimir();
        
    }
    
}
