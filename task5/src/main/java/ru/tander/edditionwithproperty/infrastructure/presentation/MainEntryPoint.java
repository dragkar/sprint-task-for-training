/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.tander.edditionwithproperty.infrastructure.presentation;


import org.apache.log4j.Logger;
import ru.tander.edditionwithproperty.infrastructure.AdditionNumbersApplication;
import ru.tander.edditionwithproperty.infrastructure.configuration.*;
import ru.tander.edditionwithproperty.services.*;

public class MainEntryPoint {
	private static final Logger LOG = Logger.getLogger(MainEntryPoint.class);
	private static final String CONFIG_FILE_NAME = "sprint.task.for.training.config";

	public static void main(String[] args) {
		try {
			AdditionNumbersApplication additionNumbersApplication = new AdditionNumbersApplication(
				AppConfiguration.fromFileWithName(getConfigFileName()));

			AdditionScenarioService additionScenarioService = additionNumbersApplication.
				createAdditionScenarioService();
			additionScenarioService.startAdditionScenario();
		} catch (AppConfigurationException | AdditionScenarioServiceException e) {
			LOG.error("Bad config file ", e);
		}
	}

	private static String getConfigFileName() throws AppConfigurationException {
		final String configFilePath = System.getProperty(CONFIG_FILE_NAME);
		if (configFilePath == null || configFilePath.isEmpty()) {
			throw new AppConfigurationException("Parameter " + CONFIG_FILE_NAME + " not exists or empty");
		}
		return configFilePath;
	}
}
