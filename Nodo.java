
/**
 * @author rafae
 *
 */
public class Nodo {

    String valor;
    String nombre;
    Nodo hijoIzquierdo;
    Nodo hijoDerecho;

    public Nodo(){

    }
    /**
     * @param v
     * @param nom
     */
    public Nodo(String v, String nom) {
        this.valor = v;
        this.nombre =  nom;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }
    public String toString(){
        return valor;
    }


}