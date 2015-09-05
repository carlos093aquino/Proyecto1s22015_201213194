
package metro;

/**
 *
 * @author omar
 */
public class bus {
  
    bus anterior;
    bus siguiente;
    String id;
    
    
    bus(String id){
    anterior=null;
    siguiente=null;
    this.id = id;
    }
    
    bus(){}
    
    
    public String retornarId(){
    return id;
    }
    
    
}//FIN DE LA CLASE BUS
