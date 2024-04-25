package cm;

public class Prueba {
    public static void main(String[] args) {
        Carro carro = new Carro(2, tipoChasis.MONOCASCO, tipoCarroceria.TUBULAR, "Rojo", "Goodyear", 25, 20, 15);
        carro.imprimir();
    }
}
