package br.com.bradesco.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Utils class
 * @author Maciel
 *
 */
public class Utils {

	
	public Utils() {
	}
	
	

	/**
	 * Converte Data
	 * @param pattern
	 * @param data
	 * @return
	 * @throws ParseException
	 */
	public String converteData(String pattern, Date date) throws ParseException{
		DateFormat fmt = new SimpleDateFormat(pattern);  
		String dataF = fmt.format(date);
		return  dataF;
	}
	
	
	
}
