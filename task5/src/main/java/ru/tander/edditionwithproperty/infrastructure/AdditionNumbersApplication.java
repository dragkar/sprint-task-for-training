package ru.tander.edditionwithproperty.infrastructure;

import ru.tander.edditionwithproperty.infrastructure.configuration.*;
import ru.tander.edditionwithproperty.infrastructure.presentation.*;
import ru.tander.edditionwithproperty.infrastructure.services.*;
import ru.tander.edditionwithproperty.services.AdditionScenarioService;
import ru.tander.edditionwithproperty.services.InputNumberService;
import ru.tander.edditionwithproperty.services.PrintService;
import ru.tander.edditionwithproperty.services.ServiceAdditionOfIntegerNumbers;

import java.nio.file.*;

public class AdditionNumbersApplication {
	private PrintService printService;
	private AppConfiguration appConfiguration;

	public AdditionNumbersApplication(AppConfiguration appConfiguration) {

		this.appConfiguration = appConfiguration;
	}

	public AdditionScenarioService createAdditionScenarioService() throws AppConfigurationException {
		return new AdditionScenarioService(
			createAdditionOfIntegerNumbers(),
			getPrintService(appConfiguration.getOutputType()),
			createInputNumberService(appConfiguration.getInputType())
		);
	}

	private ServiceAdditionOfIntegerNumbers createAdditionOfIntegerNumbers() {
		return new ServiceAdditionOfIntegerNumbers();
	}

	private PrintService getPrintService(String outputType) throws AppConfigurationException {
		if (printService == null) {
			if (outputType.equals(OperationType.Console.getOperationType())) {
				printService = new ConsolePrintService();
			} else if (outputType.equals(OperationType.File.getOperationType())) {
				try {
					printService = new FilePrintService(Paths.get(appConfiguration.getOutputFilePath()));
				} catch (PrintServiceException e) {
					throw new AppConfigurationException(e);
				}
			} else {
				throw new AppConfigurationException("Bad outputType string ");
			}
		}
		return printService;

	}

	private InputNumberService createInputNumberService(String inputType) throws AppConfigurationException {
		if (inputType.equals(OperationType.Console.getOperationType())) {
			return new InputNumberServiceFromConsole();
		} else if (inputType.equals(OperationType.File.getOperationType())) {
			try {
				return new InputNumberServiceFromFile(appConfiguration.getInputFilePath());
			} catch (InputNumberServiceException e) {
				throw new AppConfigurationException(e);
			}
		} else {
			throw new AppConfigurationException("Bad outputType string ");
		}
	}
}
