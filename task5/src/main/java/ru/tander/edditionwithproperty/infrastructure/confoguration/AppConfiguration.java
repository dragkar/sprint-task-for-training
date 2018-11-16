/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.tander.edditionwithproperty.infrastructure.configuration;

import java.io.*;
import java.util.Properties;

public class AppConfiguration {


	private String inputType;
	private String outputType;
	private String outputFilePath;
	private String inputFilePath;

	public static AppConfiguration fromFileWithName(String configFileName) throws AppConfigurationException {
		return new AppConfiguration(configFileName);
	}

	private AppConfiguration(String configFileName) throws AppConfigurationException {
		Properties configValues = getConfigValuesFromConfigFileByName(configFileName);

		setInputType(getConfigValueByName(configValues, "inputType"));
		setOutputType(getConfigValueByName(configValues, "outputType"));
		setOutputFilePath(getConfigValueByName(configValues, "outputFilePath"));
		setInputFilePath(getConfigValueByName(configValues, "inputFilePath"));

	}

	private String getConfigValueByName(Properties configValue, String nameValue) {
		return configValue.getProperty(nameValue);

	}

	private Properties getConfigValuesFromConfigFileByName(String configFileName) throws AppConfigurationException {
		Properties configValue = new Properties();
		try (FileInputStream configFile = new FileInputStream(configFileName)) {
			configValue.load(configFile);
			if (configValue.isEmpty()) {
				throw new AppConfigurationException("Config file not found or empty");
			}
		} catch (IOException e) {
			throw new AppConfigurationException(e);
		}
		return configValue;
	}

	private boolean isStringValueNotNullOrEmpty(String stringValue) {
		return (stringValue == null || stringValue.isEmpty());
	}

	private void setInputType(String inputType) throws AppConfigurationException {
		if (isStringValueNotNullOrEmpty(inputType)) {
			throw new AppConfigurationException("inputType parameter are not available in the " +
				"configuration file");
		}

		this.inputType = inputType;
	}

	private void setOutputType(String outputType) throws AppConfigurationException {
		if (isStringValueNotNullOrEmpty(outputType)) {
			throw new AppConfigurationException("outputType parameter are not available in the " +
				"configuration file");
		}

		this.outputType = outputType;
	}

	private void setInputFilePath(String inputFilePath) throws AppConfigurationException {
		if (isStringValueNotNullOrEmpty(inputFilePath)) {
			throw new AppConfigurationException("inputFilePath parameter are not available in the " +
				"configuration file");
		}

		this.inputFilePath = inputFilePath;
	}

	private void setOutputFilePath(String outputFilePath) throws AppConfigurationException {
		if (isStringValueNotNullOrEmpty(outputFilePath)) {
			throw new AppConfigurationException("outputFilePath parameter are not available in the " +
				"configuration file");
		}

		this.outputFilePath = outputFilePath;
	}

	public String getInputType() {
		return inputType;
	}

	public String getOutputType() {
		return outputType;
	}

	public String getOutputFilePath() {
		return outputFilePath;
	}

	public String getInputFilePath() {
		return inputFilePath;
	}
}
