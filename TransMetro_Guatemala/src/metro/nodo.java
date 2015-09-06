
package metro;

/**
 *
 * @author omar
 */
public class nodo {
    protected Object id;
    protected Object correo;
    protected Object clave;
    protected nodo izq;
    protected nodo der;
    
    
    //CONSTRUCTOR 1
    nodo(Object id, Object correo, Object clave){
        this.id= id;
        this.clave=clave;
        this.correo=correo;
        this.izq=null;
        this.der=null;
    }
    
    //CONSTRUCTOR 2
    
    nodo(Object id, Object correo, Object clave, nodo der, nodo izq){
        this.id= id;
        this.clave=clave;
        this.correo=correo;
        this.izq=izq;
        this.der=der;
    }
    
    public Object obtenerId(){
        return id;
    }
    
    public Object obtenerCorreo(){
        return correo;
    }
    
    public Object obtenerClave(){
        return clave;    
    }
    
    public nodo obtenerIzq(){
        return izq;    
    }
    
    public nodo obtenerDer(){
        return der;        
    }
    
    
    public void nuevosDatos(Object id, Object correo, Object clave){
        this.id=id;
        this.correo=correo;
        this.clave=clave;
    }
    
    public void nodoDer(nodo der){
        this.der=der;
    }
    
    public void nodoIzq(nodo izq){
        this.izq = izq;
    }
}
