
package metro;
/**
 *
 * @author omar
 */
public class arbolB {
    protected nodo raiz;
    private boolean vacios  = false;
    
    //CONSTRUCTOR 1
    arbolB(){
        raiz = null;
    }
    
    //CONSTRUCTOR 2
    arbolB(nodo raiz){
        this.raiz = raiz;
    }
    
    public nodo obtenerRaiz(){
        return raiz;
    }
    
    //METODO QUE VERIFICA SI EL ARBOL ESTA VACIO O NO
    public boolean vacio(){
        if(raiz == null){
            vacios = true;
        }
        return vacios;    
    }
    
    
    
}
