package com.epam.mbank.utils.system;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class SystemInitialization {
	private final static String LOGGER_CONFIG_FILE = "resources/log4j.xml";
	private final static Logger logger = Logger.getLogger(SystemInitialization.class);

	public static void init() {
		initLogger();
	}

	private static void initLogger() {
		DOMConfigurator.configure(LOGGER_CONFIG_FILE);
	}

}
