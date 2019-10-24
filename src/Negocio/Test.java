/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Lista;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author GUADALUPE
 */
public class Test {
    private String email;
    private String resultado;
    private String fecha;

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the resultado
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
     /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public static Vector consultarTodo() {
        return Lista.obtener2();
    }
    
    public static Vector resultadoPersonal(String email) {
        Vector listafiltrada = new Vector();
      
        for (int i=0; i<Lista.obtener2().size(); i++){
            Test obj = (Test) Lista.obtener2().get(i);
            if(obj.getEmail().equalsIgnoreCase(email)){
                listafiltrada.add(obj);
            }
        }
        
        return listafiltrada;
    }
    
    public static void excelResultados(){
        String nombreArchivo="resultados.xlsx";
		String rutaArchivo= ".\\excel_bd\\"+nombreArchivo;
		String hoja="Hoja1";
		
		XSSFWorkbook libro= new XSSFWorkbook();
		XSSFSheet hoja1 = libro.createSheet(hoja);
		//cabecera de la hoja de excel
		String [] header= new String[]{"Email", "Resultado","Fecha"};
		
                String [][] document = new String [Lista.obtener2().size()][3];
                for (int i=0; i<Lista.obtener2().size(); i++) {
                    for (int j=0; j<3; j++){
                        Test obj = (Test) Lista.obtener2().get(i);
                        switch (j){
                            case 0: document [i][j]=obj.getEmail(); break;
                            case 1: document [i][j]=obj.getResultado(); break;
                            case 2: document [i][j]=obj.getFecha(); break;
                        }
                        
                    }
                }
		
		//poner negrita a la cabecera
		CellStyle style = libro.createCellStyle();
                Font font = libro.createFont();
                font.setBold(true);
                style.setFont(font);
        
        
		//generar los datos para el documento
		for (int i = 0; i <= document.length; i++) {
			XSSFRow row=hoja1.createRow(i);//se crea las filas
			for (int j = 0; j <header.length; j++) {
				if (i==0) {//para la cabecera
						XSSFCell cell= row.createCell(j);//se crea las celdas para la cabecera, junto con la posición
						cell.setCellStyle(style); // se añade el style crea anteriormente 
						cell.setCellValue(header[j]);//se añade el contenido					
				}else{//para el contenido
					XSSFCell cell= row.createCell(j);//se crea las celdas para la contenido, junto con la posición
					cell.setCellValue(document[i-1][j]); //se añade el contenido
				}				
			}
		}
		
		File file;
		file = new File(rutaArchivo);
		try (FileOutputStream fileOuS = new FileOutputStream(file)){						
			if (file.exists()) {// si el archivo existe se elimina
				file.delete();
				System.out.println("Archivo eliminado");
			}
			libro.write(fileOuS);
			fileOuS.flush();
			fileOuS.close();
			System.out.println("Archivo Creado");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public static void leerexcelResultados(){
        String nombreArchivo = "resultados.xlsx";
		String rutaArchivo = ".\\excel_bd\\" + nombreArchivo;
		String hoja = "Hoja1";
 
		try (FileInputStream file = new FileInputStream(new File(rutaArchivo))) {
			// leer archivo excel
			XSSFWorkbook worbook = new XSSFWorkbook(file);
			//obtener la hoja que se va leer
			XSSFSheet sheet = worbook.getSheetAt(0);
			//obtener todas las filas de la hoja excel
			Iterator<Row> rowIterator = sheet.iterator();
 
			Row row;
                        int fila = 0;
			// se recorre cada fila hasta el final
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				//se obtiene las celdas por fila
				Iterator<Cell> cellIterator = row.cellIterator();
				Cell cell;
                                int cont=1;
                                Test obj = new Test();
				//se recorre cada celda
				if (fila==0){
                                    fila++;
                                }else{
                                    while (cellIterator.hasNext()) {
					// se obtiene la celda en específico y se la imprime
					cell = cellIterator.next();
                                        switch (cont){
                                            case 1: obj.setEmail(cell.getStringCellValue()); break;
                                            case 2: obj.setResultado(cell.getStringCellValue()); break;
                                            case 3: obj.setFecha(cell.getStringCellValue()); break;
                                        }
                                        cont++;
                                    }
                                    Lista.listaResultado.addElement(obj);
                                }
			}
		} catch (Exception e) {
			e.getMessage();
		}
    }
   
}
