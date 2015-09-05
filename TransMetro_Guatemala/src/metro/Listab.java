//CLASE QUE FUNCIONA COMO LA LISTA DOBLE ENLAZADA DE LA CLASE BUS 
package metro;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author omar
 */

public class Listab {
  bus cabeza;
  bus fin;
  int contador = 0;
  bus b = new bus();
  //int contador=0;
  Listab(){
  cabeza = null;
  fin = null;
  }
  
  //------Método que verifica si la lista está vacia--------------
  
  public boolean vacia(){
  boolean vacio = false;
  if(cabeza == null){
      vacio = true;
  }
  return vacio;
  }
  
 //-------Método que inserta en la lista al inicio------------ -------------
  
  public void insertarInicio(String id){
  System.out.println(contador);  //INDICA EL NÚMERO DE ELEMENTOS EN LA LISTA
  vacia();                       //VERIFICA SI LA LISTA ESTA VACIA O NO
  bus nuevo;                     //ASIGNA EL NODO "NUEVO" DE LA CLASE BUS 
  nuevo = new bus(id);           //INSTANCIA EL NODO "NUEVO"
  
  if(vacia()==true){
      cabeza = nuevo;
      fin = nuevo;
      contador++;
      System.out.println("Existen  "+ contador +" Elementos en la lista ");
      System.out.println("Se ha insertado el bus con id : "+"'"+ id +"'"+" En la cabeza el primer nodo");
      System.out.println("------------------------------------------------");
  }
  else{
      nuevo.siguiente=cabeza;
      cabeza.anterior= nuevo;
      cabeza = nuevo;
      contador++;
      System.out.println("Existen  "+ contador +" Elementos en la lista ");
      System.out.println("Se ha insertado el bus con id : "+"'"+ id +"'"+" En la cabeza ");
      System.out.println("------------------------------------------------");
  }
  
  }
  
  //-----Método que inserta al final de la lista------------
  
  public void insertarFinal(String id){
  System.out.println(contador);
  vacia();
  bus nuevo;
  nuevo = new bus(id);
  
  if(vacia()== true){
      cabeza = nuevo;
      fin = nuevo;
      contador++;
      System.out.println("Existen  "+ contador +" Elementos en la lista ");
      System.out.println("Se ha insertado el bus con id : "+"'"+ id +"'"+" En la cabeza el primer nodo");
      System.out.println("------------------------------------------------");
  }
  
  else{
      fin.siguiente=nuevo;
      nuevo.anterior= fin;
      fin = nuevo;
      contador++;
      System.out.println("Existen  "+ contador +" Elementos en la lista ");
      System.out.println("Se ha insertado el bus con id : "+"'"+ id +"'"+" Al final de la lista");
      System.out.println("------------------------------------------------");
  }
      
  
  }
  
  
  //------Método que elimina al final de la lista-------------------------------
  
  public void eliminarInicio(){
  System.out.println(contador);
  vacia();
  
  if(vacia()==true){
  
  }
  else{
      if(contador>1){
          cabeza = cabeza.siguiente;
          cabeza.anterior=null;
          contador--;
          System.out.println("Existen  "+ contador +" Elementos en la lista ");
          System.out.println("Se ha eliminado un bus en la cabeza ");
          System.out.println("------------------------------------------------");
      }
      else if (contador==1){
          cabeza =fin = null;
          contador--;
          System.out.println("Existen  "+ contador +" Elementos en la lista ");
          System.out.println("Se ha eliminado el último bus en la lista ");
          System.out.println("------------------------------------------------");
      }
  }
  
  }
  
  
  //-------Método que elimina del final de la lista------------------------
  
  public void eliminarFinal(){
  System.out.println(contador);
  
  vacia();
  
  if(vacia()==true){
  
  }
  else{
      if(contador>1){
          fin = fin.anterior;
          fin.siguiente = null;
          contador--;
          System.out.println("Existen  "+ contador +" Elementos en la lista ");
          System.out.println("Se ha eliminado un bus al final ");
          System.out.println("------------------------------------------------");
      }
      else if(contador==1){
          cabeza=fin= null;
          contador--;
          System.out.println("Existen  "+ contador +" Elementos en la lista ");
          System.out.println("Se ha eliminado el último bus en la lista ");
          System.out.println("------------------------------------------------");
      }
  }
  }
  
  
  //---------Método que busca en la lista enlazada------------------------------
  public bus buscar(String id){
      bus iterador;
      bus buscado = null;
      iterador = cabeza;
      while(iterador!=null && buscado ==null){
          if(iterador.retornarId().equals(id)){
              buscado = iterador;
          }
          iterador= iterador.siguiente;
      }
      return buscado;
  }
  
  
  //-----Método que muestra en consola------------------------------------------
  
  public void mostrarEnConsola(){
  bus iterador;
  iterador=cabeza;
  
  while(iterador!=null){
      System.out.print(iterador.retornarId()+" --> ");
      iterador= iterador.siguiente;
    }
  System.out.println("null");
  txt t = new txt();
  t.generarTXT(iterador, cabeza);
  }
  
  //-----Método que elimina un nodo cualquiera--------------
  
  
  public void eliminarCualquiera(String id){
      
      bus iterador = cabeza;
      bus buscado=null;
      bus temporal=null;
      bus temporal2=null;
      while(iterador!=null && buscado==null){
          
          if(iterador.retornarId().equals(id)){
              
              if(iterador == cabeza){
                  if(contador>1){
                       buscado = iterador;
                       temporal = buscado.siguiente;
                       temporal.anterior= null;
                       cabeza = temporal;
                       buscado = null;
                       contador--;
                       System.out.println(" Nodo "+ iterador.retornarId() + " eliminado ");
                       System.out.println("Quedan "+contador+" Elementos");
                       System.out.println("-------------------------------");
                  
                  }
                  else if(contador==1){
                       cabeza =fin= null;
                       contador--;
                       System.out.println(" Nodo "+ iterador.retornarId() + " eliminado ");
                       System.out.println("Quedan "+contador+" Elementos");
                       System.out.println("-------------------------------");
                  
                  }
                 
              }
              
              else if(iterador == fin ){
                  buscado = iterador;
                  temporal = buscado.anterior;
                  temporal.siguiente= null;
                  buscado = null;
                  contador--;
                  System.out.println(" Nodo "+ iterador.retornarId() + " eliminado ");
                  System.out.println("Quedan "+contador+" Elementos");
                  System.out.println("-------------------------------");
              
              }
              
              else if(iterador!= cabeza && iterador!=fin){
                  buscado = iterador;
                  temporal = buscado.anterior;
                  temporal2 = buscado.siguiente;
                  temporal.siguiente= temporal2;
                  temporal2.anterior = temporal;
                  buscado = null;
                  contador--;
                  System.out.println(" Nodo "+ iterador.retornarId() + " eliminado ");
                  System.out.println("Quedan "+contador+" Elementos");
                  System.out.println("-------------------------------");
                            
              }
          }
      iterador= iterador.siguiente;
      
      }
  
  }
  
//-----------METODO QUE GENERA EL TXT---------------------------------  
  public void generarTXT(){
        bus s = new bus();
        bus iterador= cabeza;
        FileWriter txt= null;
        PrintWriter imp = null;
        int cont=0;
  
        try{
            txt = new FileWriter("C:\\Users\\omar\\Documents\\NetBeansProjects\\TransMetro_Guatemala\\img.txt");
            imp = new PrintWriter(txt);            
            imp.println("digraph listas{");
            imp.println("rankdir=TB;");
            imp.println("node [color= green3, style=filled, fillcolor=seashell3];");
            
            while(iterador!= null){
                cont++;
                imp.println("nodo"+Integer.toString(cont)+" [ "+"label "+"="+s.retornarId()+"];"+"\n");               
                iterador= iterador.siguiente;
            }
            imp.println("nodo"+Integer.toString(cont)+":C0->nodo"+Integer.toString(cont+1));
            imp.println("nodo"+Integer.toString(cont+1)+":C0->nodo"+Integer.toString(cont));
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            try{
                if(null!=txt)
                    txt.close();
            }
            catch(Exception ex1){
                ex1.printStackTrace();
}
}
              
    }
 //------Método que elimina de la lista---------------------
  
  public void eliminar(String id){
  bus actual;
  boolean encontrar=false;
  actual = cabeza;
  
  while((actual!=null)&&(!encontrar)){
  encontrar= id.equals(id);
  if(!encontrar)
  actual=actual.siguiente;
  }
  
  if(actual!=null){
  if(actual.anterior==null){
  cabeza = actual.siguiente;
  
  if(actual.siguiente!=null){
  actual.siguiente.anterior=null;
  contador--;
  System.out.println("Nodo que es cabeza "+id+" eliminado con éxito Quedaron : " + contador +" elementos");
  System.out.println("--------------------------------------");
  }
  }
  else if(actual.siguiente!=null){
  actual.anterior.siguiente= actual.siguiente;
  actual.siguiente.anterior= actual.anterior;
  contador--;
  System.out.println("Nodo que no es cabeza ni ultimo "+id+" eliminado con éxito Quedaron : " + contador +" elementos");
  System.out.println("--------------------------------------");
  }
  else if(actual.siguiente==null){
  actual.anterior.siguiente= null;
  actual = null;
  contador--;
  System.out.println("Nodo que es ultimo "+id+" eliminado con éxito Quedaron : " + contador +" elementos");
  System.out.println("--------------------------------------");
  }
  else { 
  System.out.println("Nodo "+id+" no encontrado ");
  }
  }
  }
    
}//FIN DE CLASE
