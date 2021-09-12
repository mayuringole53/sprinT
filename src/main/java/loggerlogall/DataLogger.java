package loggerlogall;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class DataLogger {
	static String CFile = "F:\\Java Notes\\Eclipse Programs\\sprinT\\Log4j.properties";
	public static final Logger l = Logger.getLogger(DataLogger.class.getName());
}
