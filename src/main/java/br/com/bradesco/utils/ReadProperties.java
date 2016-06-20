package br.com.bradesco.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * ReadProperties
 * @author Maciel
 *
 */
public class ReadProperties {

	/**
	 * Lê arquivo de propriedades
	 * 
	 * @return
	 * @throws IOException
	 */
	public static Properties getProp(String path) {
		Properties props = new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream(path);
			props.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
}
