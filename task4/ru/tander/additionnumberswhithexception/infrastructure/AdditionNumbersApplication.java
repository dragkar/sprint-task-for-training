package ru.tander.additionnumberswhithexception.infrastructure;

import ru.tander.additionnumberswhithexception.infrastructure.presentation.ConsolePrintService;
import ru.tander.additionnumberswhithexception.services.*;

public class AdditionNumbersApplication {
	private PrintService printService;

	public AdditionScenarioService createAdditionScenarioService() {
		return new AdditionScenarioService(
			createAdditionOfIntegerNumbers(),
			getPrintService(),
			createInputNumberService()
		);
	}

	private ServiceAdditionOfIntegerNumbers createAdditionOfIntegerNumbers() {
		return new ServiceAdditionOfIntegerNumbers();
	}

	private PrintService getPrintService() {
		if (printService == null) {
			printService = new ConsolePrintService();
		}
		return printService;
	}

	private InputNumberService createInputNumberService(){
		return new InputNumberServiceFromConsole(getPrintService());
	}
}
