/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog;

import Datos.Lista;
import Negocio.Registro;
import Negocio.Test;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import org.jpl7.Query;
import org.jpl7.Term;


/**
 *
 * @author GUADALUPE
 */
public class Prolog {

    /**
     * @param args the command line arguments
     */
    public static void reglas(String email) {
        // TODO code application logic here
        /*Scanner teclado= new Scanner(System.in);
        String Y;
        */
        String t3="consult('test_1.pl')";
        Query q3 = new Query(t3);
        System.out.println(t3+""+(q3.hasSolution()?"SatisfactoriaH":"instatisfactoria"));
        
        
        /*System.out.println("Dominio Espacial");
        Y = teclado.nextLine();
        insertaopc("domesp", Y);
        
        System.out.println("Dominio Habla");
        Y = teclado.nextLine();
        insertaopc("domhabla", Y);
        
        System.out.println("Vocación Servicio");
        Y = teclado.nextLine();
        insertaopc("vocserv", Y);
        
        System.out.println("Matemáticas");
        Y = teclado.nextLine();
        insertaopc("matematico", Y);
        
        System.out.println("Relaciones interpersonales");
        Y = teclado.nextLine();
        insertaopc("relinter", Y);
        
        System.out.println("Manejo de software");
        Y = teclado.nextLine();
        insertaopc("mansw", Y);
        */
        String t4="perfil()";
        Query q4 = new Query(t4);
        System.out.println(t4+""+(q4.hasSolution()?"SatisfactoriaT":"instatisfactoria"));
        
        String t5="res(X,si)";
        Query q5 = new Query(t5);
        
        Map<String, Term>[] accion = q5.allSolutions();
        
        Test obj = new Test();
        Date objDate = new Date();
        System.out.println(accion.length);
        if(accion.length>0){
            for (int i=0; i<accion.length; i++){
                System.out.println("Sol:"+i+" "+accion[i]);
                obj.setEmail(email);
                if(accion[i].toString().equalsIgnoreCase("{X=administracion}")){
                    obj.setResultado("Administración");
                }
                if(accion[i].toString().equalsIgnoreCase("{X=edsecundaria}")){
                    obj.setResultado("Educación Secundaria");
                }
                if(accion[i].toString().equalsIgnoreCase("{X=derecho}")){
                    obj.setResultado("Derecho");
                }
                
                obj.setFecha(objDate.toString());

                Lista.listaResultado.addElement(obj);
            }
            Test.excelResultados();
        }else{
            obj.setEmail(email);
            obj.setResultado("Sin resultado");
            obj.setFecha(objDate.toString());
            Lista.listaResultado.addElement(obj);
            Test.excelResultados();
        }
        
        
        /*String accion = q3.oneSolution().get("X").toString();*/
    }
    
    public static void insertaopc(String X, String Y){
        
        String tl="consult('test_1.pl')";
        Query ql = new Query(tl);
        System.out.println(tl+""+(ql.hasSolution()?"Satisfactoria":"instatisfactoria"));
        
        String t2="opciones("+X+","+Y+")";
        System.out.println("opciones("+X+","+Y+")");
        Query q2 = new Query(t2);
        q2.hasSolution();
    }
    
    public static void limpiezaprolog(){
        
        String t0="retractall(res(_,si))";
        Query q0 = new Query(t0);
        System.out.println(t0+""+(q0.hasSolution()?"SatisfactoriaH":"instatisfactoria"));
        
        String t00="retractall(opc(X,Y))";
        Query q00 = new Query(t00);
        System.out.println(t00+""+(q00.hasSolution()?"SatisfactoriaH":"instatisfactoria"));
    }
}
