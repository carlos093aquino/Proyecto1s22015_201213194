
package metro;

/**
 *
 * @author omar
 */
public class jpg {
    
    public void GenerarJPG(){
    try{
    String RutaDot ="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
    String txt = "C:\\Users\\omar\\Documents\\NetBeansProjects\\TransMetro_Guatemala\\img.txt";
    String jpg = "C:\\Users\\omar\\Documents\\NetBeansProjects\\TransMetro_Guatemala\\arbol.jpg";
    String t ="-Tjpg";
    String O = "-o";
    
    String[] env = new String[5];
    env[0]=RutaDot;
    env[1]=t;
    env[2]=txt;
    env[3]= O;
    env[4]= jpg;
    
    Runtime run = Runtime.getRuntime();
    run.exec(env);
    }
    catch(Exception ex){
    ex.printStackTrace();
    }
    }

}
