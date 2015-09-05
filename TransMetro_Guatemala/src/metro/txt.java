
package metro;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author omar
 */
public class txt {
      public void generarTXT(bus iterador, bus cabeza){
        bus s = new bus();
        FileWriter txt= null;
        PrintWriter imp = null;
        int cont=0;
  
        try{
            txt = new FileWriter("C:\\Users\\omar\\Documents\\NetBeansProjects\\TransMetro_Guatemala\\img.txt");
            imp = new PrintWriter(txt);            
            imp.println("digraph listas{");
            imp.println("rankdir=TB;");
            imp.println("node [color= green3, style=filled, fillcolor=seashell3];");
            iterador= cabeza;
            while(iterador!= null){
                cont++;
                imp.println("nodo"+Integer.toString(cont)+" [ "+"label "+"="+s.retornarId()+"];"+"\n");               
            }
            imp.println("nodo"+Integer.toString(cont)+":C0->nodo"+Integer.toString(cont+1));
            imp.println("nodo"+Integer.toString(cont+1)+":C0->nodo"+Integer.toString(cont));
            iterador= iterador.siguiente;
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
    
}
