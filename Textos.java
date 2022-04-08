
import java.util.*;
import java.io.*; 

/**
 * @author rafae
 *
 */
public class Textos{
  BinaryTree arbol = new BinaryTree();

	/**
	 * @return
	 */
	public ArrayList<String> diccionario(){
    ArrayList<String> info = new ArrayList<String>();
        File f = new File("Diccionario.txt");
    	BufferedReader entrada;
   		try 
   		{
            entrada = new BufferedReader(new FileReader(f));
            while(entrada.ready())
            {
                info.add(entrada.readLine());
            }
    	}catch (IOException e)
    	{
            e.printStackTrace();
		}
		return info;
	}


	/**
	 * @return
	 */
	public String[] texto(){
		  String  info = ""; 
      //Se lee el archivo
      File f = new File("Texto.txt");
    	BufferedReader entrada;
   		try 
   		{
            entrada = new BufferedReader(new FileReader(f));
            while(entrada.ready())
            {
                info += entrada.readLine();
            }
    	}catch (IOException e)
    	{
            e.printStackTrace();
		  }
    String [] texto = info.replace(".","").split(" ");
		return texto;
	}



}