
package _10_Coches;

/**
 *
 * @author angam
 */
public class Coche {
    
    private String marca;
    private String modelo;
    private Motor motor;
    private Rueda [] ruedas;

    public Coche(String marca, String modelo, int potencia, TipoCombustible com, TipoCambio cam, int radio) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(potencia, com, cam, 0);
        this.ruedas = new Rueda[4];
        this.ruedas[0] = new Rueda(radio, potencia);
        this.ruedas[1] = new Rueda(radio, potencia);
        this.ruedas[2] = new Rueda(radio, potencia);
        this.ruedas[3] = new Rueda(radio, potencia);
    }

    
    public void cambiarRueda(int numeroRueda) {
        this.ruedas[numeroRueda-1].setKilometros(0);
    }//
    
    
    public void recorrer(int kilometros){
        this.ruedas[0].setKilometros(this.ruedas[0].getKilometros() + kilometros);
        this.ruedas[1].setKilometros(this.ruedas[1].getKilometros() + kilometros);
        this.ruedas[2].setKilometros(this.ruedas[2].getKilometros() + kilometros);
        this.ruedas[3].setKilometros(this.ruedas[3].getKilometros() + kilometros);
    }//
    
    
    public void imprimirFicha(){
        System.out.println("Ficha del coche");
        System.out.println("=".repeat(55));
        System.out.println("Marca/Modelo: " + this.marca + " " + this.modelo);
        System.out.println("Motor(CV): " + this.motor.getCaballos());
        System.out.println("Combustible: " + TipoCombustible.GASOLINA);
        System.out.println("Cambio: " + TipoCambio.MANUAL);
        System.out.println("KM del motor: " + this.motor.getKilometros() + " km");
        System.out.println("Tamaño ruedas: " + this.ruedas[0].getRadio() + "''");
        System.out.printf("KM de las ruedas: [%d]  [%d]  [%d]  [%d]\n", 
                this.ruedas[0].getKilometros(),
                this.ruedas[1].getKilometros(),
                this.ruedas[2].getKilometros(),
                this.ruedas[3].getKilometros());
        System.out.println("=".repeat(55));
    }//
    
    
    public String getFichaSimplificada(){
        return String.format("%S %s - %d %s %s", this.marca, this.modelo, this.motor.getCaballos(), TipoCombustible.GASOLINA, TipoCambio.MANUAL); 
    }//
    
    
    
}/**/
