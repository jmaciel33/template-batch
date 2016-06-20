package br.com.bradesco.utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
/**
 * Log Utils
 * @author Maciel
 *
 */
public class LogUtils  {
	Logger logger = null;

	public LogUtils(String classe) {
		logger = LogManager.getLogger(classe);
		DOMConfigurator.configure("log4j/log4j.xml");

	}

	public void debug(Object message) {
		logger.debug(message);
	}

	public void debug(Object message, Throwable t) {
		logger.debug(message, t);
	}

	public void error(Object message) {
		logger.error(message);
	}

	public void error(Object message, Throwable t) {
		logger.error(message, t);
	}

	public void fatal(Object message) {
		logger.fatal(message);
	}

	public void fatal(Object message, Throwable t) {
		logger.fatal(message, t);
	}

	public void info(Object message) {
		logger.info(message);
	}

	public void info(Object message, Throwable t) {
		logger.info(message, t);
	}

	public boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}

	public boolean isInfoEnabled() {
		return logger.isInfoEnabled();
	}

	public boolean isTraceEnabled() {
		return logger.isTraceEnabled();
	}

	public void trace(Object message) {
		logger.trace(message);
	}

	public void trace(Object message, Throwable t) {
		logger.trace(message, t);
	}

	public void warn(Object message) {
		logger.warn(message);
	}

	public void warn(Object message, Throwable t) {
		logger.warn(message, t);
	}

}
