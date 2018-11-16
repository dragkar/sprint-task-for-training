/*
* Copyright (c) 2018 Tander, All Rights Reserved.
*/

package ru.tander.operationswiththreepairnumbers.infrastructure;

import ru.tander.operationswiththreepairnumbers.infrastructure.presentation.ConsolePrintService;

public class Application {
	public ru.tander.operationswiththreepairnumbers.services.AdditionScenarioService createAdditionScenarioService() {
		return new ru.tander.operationswiththreepairnumbers.services.AdditionScenarioService(createAdditionOfIntegerNumbers(), createPrintService());
	}

	private ru.tander.operationswiththreepairnumbers.services.ServiceAdditionOfIntegerNumbers createAdditionOfIntegerNumbers() {
		return new ru.tander.operationswiththreepairnumbers.services.ServiceAdditionOfIntegerNumbers();
	}

	private ru.tander.operationswiththreepairnumbers.services.PrintService createPrintService() {
		return new ConsolePrintService();
	}
}
