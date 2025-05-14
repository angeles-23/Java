
package _10_Coches;

/**
 *
 * @author angam
 */
public class Motor {
    
    private int caballos;
    private TipoCombustible combustible;
    private TipoCambio cambio;
    private int kilometros;

    
    
    
    public Motor(int caballos, TipoCombustible combustible, TipoCambio cambio, int kilometros) {
        this.caballos = caballos;
        this.combustible = combustible;
        this.cambio = cambio;
        this.kilometros = kilometros;
    }

    
    
    
    public int getCaballos() {
        return caballos;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    public TipoCambio getCambio() {
        return cambio;
    }

    public int getKilometros() {
        return kilometros;
    }
    
    
}/**/
