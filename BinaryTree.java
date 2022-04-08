

/**
 * @author rafae
 *
 */

public class BinaryTree {
    ComparableAssociation comp = new ComparableAssociation<String, String>();

    Nodo raiz;

    public BinaryTree() {
        this.raiz = null;
    }

    /**
     * @return
     */
    public Nodo getRaiz() {
        return raiz;
    }

    /**
     * @param raiz
     */
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    /**
     * @param d
     * @param nom
     */
    public void addNodo(String d, String nom) {
        Nodo nuevo = new Nodo(d,nom);
        if ( raiz == null ) {
            this.raiz = nuevo;
        }else{
            Nodo auxiliar = raiz;
            Nodo padre;
            while(true){
                padre = auxiliar;
                // Si la raiz es mayor al nuevo, esto indica que debera agregarse
                // Al lado izquierdo de la raiz, de lo contrario
                // El nuevo es mayor a la raiz por lo que se agrega al lado derecho
                if(comp.compareTo(auxiliar.valor, d) > 0){
                    auxiliar = auxiliar.hijoIzquierdo;
                    // se inserta el nodo
                    if(auxiliar==null){
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                }else{
                    auxiliar = auxiliar.hijoDerecho;
                    if(auxiliar == null){
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
	}	

    /**
     * @return
     */
    public boolean isEmpty(){
        return raiz == null;
    }
    
    /**
     * @param r
     */
    public void inOrden(Nodo r){
        if(r != null){
            inOrden(r.hijoIzquierdo);
            System.out.println(r.valor);
            inOrden(r.hijoDerecho);
        }
    }
  /**
 * @param d
 * @return
 */
public String buscar(String d){
       
       return buscarNodo(d, raiz);
    }
    
    /**
     * @param d
     * @param aux
     * @return
     */
    public String buscarNodo(String d, Nodo aux){

        if(aux.valor.equalsIgnoreCase(d)){
            return aux.nombre;
        }else if(comp.compareTo(aux.valor, d) > 0 && aux.hijoIzquierdo != null ) {

            aux = aux.hijoIzquierdo;

            return buscarNodo(d,aux);
        }else if (comp.compareTo(aux.valor, d) < 0 && aux.hijoDerecho != null){

            aux = aux.hijoDerecho;
            return buscarNodo(d,aux);
        }
        
    return null;
    }
}