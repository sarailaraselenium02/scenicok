package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import entidad.Cliente;

public class ExcelReader {
	
	private static String nombreArchivo = "Datos.xlsx";
	private static String rutaArchivo = "C:\\Users\\larasr\\Desktop\\metaut\\BD\\" + nombreArchivo;
	private static String hoja = "Hoja1";
	private static int columnas = 0;

	public static Cliente datosExcel() {
		try {
			ArrayList<Cliente> c = readExcel();
			System.out.println(c.size());
			return c.get( 0);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private static ArrayList<Cliente> readExcel() throws Exception {
		ArrayList<Cliente> arrayCliente = new ArrayList<Cliente>();
		int cont = 0;
		try (FileInputStream file = new FileInputStream(new File(rutaArchivo))) {
			// leer archivo excel
			XSSFWorkbook worbook = new XSSFWorkbook(file);
			// obtener la hoja que se va leer
			XSSFSheet sheet = worbook.getSheetAt(0);
			// obtener todas las filas de la hoja excel
			java.util.Iterator<Row> rowIterator = sheet.iterator();
			
			Row row;
			// se recorre cada fila hasta el final
			rowIterator.next();
			
			boolean first = true;
			while (rowIterator.hasNext()) {
				
				row = rowIterator.next();
				// se obtiene las celdas por fila
				java.util.Iterator<Cell> cellIterator = row.cellIterator();
				Cell cell;
				
				ArrayList<String> listado = new ArrayList<String>();
				
				while (cellIterator.hasNext()) {
					if(first)
					cont ++;
					cell = cellIterator.next();
					
					listado.add(cell.toString());
					
				}
				first = false;
				Cliente cliente = new Cliente();
				
				// System.out.println(cellIterator.next().getStringCellValue());
				// se recorre cada celda
				cliente.setLineaNegocio(listado.get(0));
				cliente.setRamo(listado.get(1));
				cliente.setProducto(listado.get(2));
				cliente.setRol(listado.get(3));
				cliente.setTitulo(listado.get(4));
				cliente.setNombres(listado.get(5));
				cliente.setApellidoPaterno(listado.get(6));
				cliente.setApellidoMaterno(listado.get(7));
				
				cliente.setFechaNacimiento(formatoFecha(listado.get(8)));
				System.out.println(listado.get(8));
				//cliente.setFechaNacimiento(formatter.format(listado.get(8)));
				cliente.setRFC(listado.get(9));
				cliente.setCURP(listado.get(10));
				cliente.setGenero(listado.get(11));
				cliente.setEstadoCivil(listado.get(12));
				cliente.setTipoIdentificacion(listado.get(13));
				cliente.setNumeroIdentificacion(formatoNumero(listado.get(14))+ "");
				cliente.setNSS(formatoNumero(listado.get(15))+"");
				cliente.setPaisNacimiento(listado.get(16));
				cliente.setEstadoProvincia(listado.get(17));
				cliente.setCiudadPoblacionNacimiento(listado.get(18));
				cliente.setNacionalidad(listado.get(19));
				cliente.setTipoDireccion(listado.get(20));
				cliente.setCalleAvenida(listado.get(21));
				cliente.setNumeroExterior(formatoNumero(listado.get(22))+ "");
				cliente.setCodigoPostal(formatoNumero(listado.get(23))+ "");
				cliente.setColoniaBarrio(listado.get(24));
				cliente.setMunicipioDelegacion(listado.get(25));
				cliente.setCiudadPoblacion(listado.get(26));
				cliente.setEstado(listado.get(27));
				cliente.setTipoTelefono(listado.get(28));
				cliente.setNumeroTelefono(formatoNumero(listado.get(29))+ "");
				cliente.setOcupacionProfeccion(listado.get(30));
				cliente.setClaveOcupacionProfeccion(listado.get(31));
				cliente.setDetalleOcupacion(listado.get(32));
				cliente.setIngresoMensualAproximado(formatoNumero(listado.get(33))+ "");
				cliente.setTransaccionesAnualesAportaciones(formatoNumero(listado.get(34))+ "");
				cliente.setTransaccionesAnualesRetiros(formatoNumero(listado.get(35))+ "");
				cliente.setMontoTransaccionesAnualesAportaciones(formatoNumero(listado.get(36))+ "");
				cliente.setMontoTransaccionesAnualesRetiros(formatoNumero(listado.get(37))+ "");
				cliente.setFuncionesPublicas(listado.get(38));
				cliente.setLimitarDivulgacion(listado.get(39));
				
				arrayCliente.add(cliente);
		
				System.out.println(cliente.toString());
			}
		} catch (Exception e) {
			e.getMessage();
			System.out.println(e.getMessage());
		}
		columnas = cont;
		return arrayCliente;
	}

	public static void writeExcel(Object idCliente) {
		try (OutputStream file = new FileOutputStream(new File(rutaArchivo))) {
			// leer archivo excel
			XSSFWorkbook worbook = new XSSFWorkbook();
			// obtener la hoja que se va leer
			XSSFSheet sheet = worbook.getSheetAt(0);
			// obtener todas las filas de la hoja excel
			java.util.Iterator<Row> rowIterator = sheet.iterator();
			Row row;
			// se recorre cada fila hasta el final
			rowIterator.next();
			
			row = rowIterator.next();
			// se obtiene las celdas por fila
			java.util.Iterator<Cell> cellIterator = row.cellIterator();
			//Cell cell ;
			XSSFCell cell = (XSSFCell) row.createCell(columnas + 1);
			cell.setCellValue(idCliente.toString());
			worbook.write(file);
			
		} catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
	}
	
public static String formatoFecha (String fecha) {
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	Calendar fecha1 = Calendar.getInstance();
	  
	String[]separador  = fecha.split("-");
	System.out.println(separador[1]);
	switch(separador[1]) {
	case "ene":
		separador [1]= "01";
		break;
	case "feb":
		separador [1]= "02";
		break;
	case "mar":
		separador [1]= "03";
		break;
	case "abr":
		separador [1]= "04";
		break;
	case "may":
		separador [1]= "05";
		break;
	case "jun":
		separador [1]= "06";
		break;
	case "jul":
		separador [1]= "07";
		break;
	case "ago":
		separador [1]= "08";
		break;
	case "sep":
		separador [1]= "09";
		break;
	case "oct":
		separador [1]= "10";
		break;
	case "nov":
		separador [1]= "11";
		break;
	case "dic":
		separador [1]= "12";
		break;
		
	}
	System.out.println(Integer.parseInt(separador[1]));
	 
	 
return separador[0]+"/"+ separador[1]+ "/"+ separador[2];
}

public static int formatoNumero (String numero){
	try {
		return (int)Double.parseDouble(numero);
	} catch (Exception e) {
		// TODO: handle exception
		return 0;
	}
	
}
}
