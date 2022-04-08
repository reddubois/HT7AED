
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author rafae
 *
 */
public class BinaryTreeNGTest {
    
    public BinaryTreeNGTest() {
    }

    /**
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    /**
     * @throws Exception
     */
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * @throws Exception
     */
    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    /**
     * @throws Exception
     */
    @AfterMethod
    public void tearDownMethod() throws Exception {
    }


   

    /**
     * Test of addNodo method, of class BinaryTree.
     */
    @Test
    public void testAddNodo() {
        System.out.println("addNodo");
        String d = "woman";
        String nom = "mujer,femme";
        BinaryTree instance = new BinaryTree();
        instance.addNodo(d, nom);
        // TODO review the generated test code and remove the default call to fail.
        if(d.equalsIgnoreCase(nom)){
            fail("The test case is a prototype.");
        }
        
    }

 
    /**
     * Test of buscar method, of class BinaryTree.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String d = "woman";
        BinaryTree instance = new BinaryTree();
        String expResult = "mujer,femme";
        String result = instance.buscar(d);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
       if(d.equalsIgnoreCase(expResult)){
           fail("The test case is a prototype.");
       }

    }

    /**
     * Test of buscarNodo method, of class BinaryTree.
     */
    @Test
    public void testBuscarNodo() {
        System.out.println("buscarNodo");
        String d = "woman";
        Nodo aux = null;
        BinaryTree instance = new BinaryTree();
        String expResult = "mujer,femme";
        String result = instance.buscarNodo(d, aux);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
       if(d.equalsIgnoreCase(expResult)){
           fail("The test case is a prototype.");
       }
    }
    
}
