/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Vector;
import Negocio.Registro;
import Negocio.Test;

/**
 *
 * @author GUADALUPE
 */
public class Lista {
    public static Vector <Registro> listaRegistro = new Vector<Registro>();

     public static Vector obtener()
    {
        return listaRegistro;
    }
     
    public static Vector <Test> listaResultado = new Vector<Test>();

     public static Vector obtener2()
    {
        return listaResultado;
    }
}
