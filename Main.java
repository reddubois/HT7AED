
import java.util.*;
import java.io.*; 

/**
 * @author rafae
 *
 */
public class Main{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	ArrayList<String> diccionario = new ArrayList<String>();
	Textos textos = new Textos();
	Nodo nodo = new Nodo();
	BinaryTree arbol = new BinaryTree();

	diccionario = textos.diccionario();

	String[] traducir = textos.texto();
	String[] lista = new String[2];


	for(int i = 0; i<diccionario.size(); i++){
		// Elimina los parentesis y separa por comas las palabras para ser ingresadas bien
		for(int j = 0; j<lista.length; j++){
			lista = diccionario.get(i).replace("(","").replace(".","").replace(")","").split(",");	
		}
		arbol.addNodo(lista[0],lista[1]);

	}
	System.out.println("Recorrido ordenado:");
	arbol.inOrden(arbol.raiz);
	System.out.println("Traducción:");
	for(int p = 0; p<traducir.length; p++){
		if (arbol.buscar(traducir[p]) == null){
			System.out.println("*"+traducir[p]+"*");
	    }else{
	    	System.out.println(arbol.buscar(traducir[p]));
	}
                               
	}
  }
}
