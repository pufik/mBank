package com.epam.mbank.utils.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SystemInitialization {
	private final static String LOGGER_CONFIG_FILE = "resources/log4j.xml";
	private final static Logger logger = LoggerFactory.getLogger(SystemInitialization.class);

	public static void init() {
		initLogger();
	}

	private static void initLogger() {

	}

}
