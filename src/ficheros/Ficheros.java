package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ficheros {

	public static void main(String[] args) throws IOException {

		String path0 = "http://api/1.0/ObtenerDocumentoNAS/010/011/012/1865.numero_id_001110000.1.pdf";
		String path1 = "http://api/1.0/ObtenerDocumentoNAS/010/011/012/1865.numero_id_001110000.1.";
		String path2 = "http://api/1.0/ObtenerDocumentoNAS/010/011/012/1865.numero_id_001110000.1";

		// System.out.println(getSufix(path0));

		// System.out.println(getParams(path0));

		// existFile();
		// renameFile();
		// createFolder();
		// deleteFile();
		// readFile();
		// readInputStream();
		// writeFile();
		// createTemporalFile();
		// createNewFile
	}
	
	
	
	
	

	private static boolean existFile(String file) {

		File archivo = null;
		boolean exist = false;

		if (file != null) {
			archivo = new File(file);
		} else {
			archivo = new File(
					"C:\\Users\\josem\\WorkSpaces\\workspace-eclipse\\JavaReview\\src\\ficheros\\resources\\file_in.txt");
		}

		exist = archivo.exists();
		System.out.println("¿Existe el fichero?: " + exist);
		return exist;
	}

	private static void renameFile() {
		File archivo = new File(
				"C:\\Users\\josem\\WorkSpaces\\workspace-eclipse\\JavaReview\\src\\ficheros\\resources\\file_in.txt");
		boolean renamed = archivo.renameTo(new File(
				"C:\\Users\\josem\\WorkSpaces\\workspace-eclipse\\JavaReview\\src\\ficheros\\resources\\file_in2.txt"));
		System.out.println("¿Se ha renombrado el fichero?: " + renamed);
	}

	private static void deleteFile() {
		File archivo = new File(
				"C:\\Users\\josem\\WorkSpaces\\workspace-eclipse\\JavaReview\\src\\ficheros\\resources\\file_in.txt");
		boolean deleted = archivo.delete();
		System.out.println("¿Se ha renombrado el fichero?: " + deleted);
	}

	private static void readFile() {

		try {
			FileReader fileInForRead = new FileReader(
					"C:\\Users\\josem\\WorkSpaces\\workspace-eclipse\\JavaReview\\src\\ficheros\\resources\\file_in2.txt");
			BufferedReader buffer = new BufferedReader(fileInForRead);
			String texto;
			try {
				while ((texto = buffer.readLine()) != null) {
					System.out.println(texto);
				}
			} catch (IOException e) {
				System.out.println("Error al leer el archivo: " + e.getCause());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error archivo no encontrado: " + e.getCause());
		}

	}

	private static void readInputStream() throws IOException {

		FileInputStream fileInputStream = new FileInputStream(
				"C:\\Users\\josem\\WorkSpaces\\workspace-eclipse\\JavaReview\\src\\ficheros\\resources\\file_in2.txt");

		// Reads a byte of data from this input stream.
		// int respuesta = fileInputStream.read();
		// if (respuesta != -1) {
		// System.out.println("Lectura representada en bytes: " + respuesta);
		// } else {
		// System.out.println("Error. No se ha podido leer el archivo.");
		// }

		// artificio para poder leer los bytes y representarlos en caracteres.
		Scanner scanner = new Scanner(fileInputStream, "UTF-8");
		String texto = scanner.nextLine();
		System.out.println("Lectura con apoyo de Scanner: " + texto);

		scanner.close();
		fileInputStream.close();
	}

	private static void writeFile() throws IOException {

		String pathAndFileName = "C:\\Users\\josem\\WorkSpaces\\workspace-eclipse\\JavaReview\\src\\ficheros\\resources\\resources2\\newFile.txt";
		FileWriter writingFile = null;
		PrintWriter printe = null;

		try {
			if (existFile(pathAndFileName)) {
				System.out.println("El fichero ya existe. Se añadirá la escritura al contenido existente.");
				// Con el uso de 'true' indicamos que ya existe el archivo y así
				// añadirá lo nuevo en lugar de sobrescribirlo.
				writingFile = new FileWriter(pathAndFileName, true);
			} else {
				System.out.println("Se sobrescribirá el contenido");
				writingFile = new FileWriter(pathAndFileName);
			}

			printe = new PrintWriter(writingFile);
			printe.println("Escrito con FileWriter y PrintWriter 2");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writingFile != null) {
				writingFile.close();
			}

		}
	}

	// try/catch with resources
	private static void createNewFile() {

		String pathAndFileName = "C:\\Users\\josem\\WorkSpaces\\workspace-eclipse\\JavaReview\\src\\ficheros\\resources\\resources2\\newFile.txt";
		PrintWriter printe = null;

		// El try se encarga de gestionar los recursos. Implicitamente incluye
		// finally
		try (FileWriter archivo = new FileWriter(pathAndFileName, true)) {

			printe = new PrintWriter(archivo);
			printe.println("Este texto es añadido escrito desde createNewFile");

		} catch (Exception e) {
			System.out.println(e.getCause());
		}

	}

	private static String createFolder() {
		File direcorio = new File(
				"C:\\Users\\josem\\WorkSpaces\\workspace-eclipse\\JavaReview\\src\\ficheros\\resources\\resources2");
		boolean createdFolder = direcorio.mkdirs();
		System.out.println("¿Se ha creado el directorio?: " + createdFolder);
		return null;
	}

	private static void createTemporalFile() throws IOException {

		String pathAndFileName = "C:\\Users\\josem\\WorkSpaces\\workspace-eclipse\\JavaReview\\src\\ficheros\\resources\\resources2\\1.";
		File tempFolder = new File(
				"C:\\Users\\josem\\WorkSpaces\\workspace-eclipse\\JavaReview\\src\\ficheros\\resources\\resources2");
		// File archivo = new File(pathAndFileName);

		// archivo.createTempFile(getPrefix(), getSufix(pathAndFileName));

		System.out.println("Sufijo: " + getSufix(pathAndFileName));
		File.createTempFile(getPrefix(), "123456789.123456789.123456789.123456789.123456789.123456789.123456789.1.",
				tempFolder);
	}

	private static String getPrefix() {
		long prefix = System.currentTimeMillis();
		return prefix + "_";
	}

	private static String getParams(String path) {
		int pos = path.lastIndexOf("/");
		String param = path.substring(pos, path.length());
		String nombre = param.replace("/", "");
		int size = param.length();
		return nombre;
	}

	private static String getSufix(String path) {
		int pos = path.lastIndexOf("\\");
		String name = path.substring(pos + 1, path.length());
		return name;
	}

}
