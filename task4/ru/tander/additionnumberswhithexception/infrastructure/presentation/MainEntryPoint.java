/*
* Copyright (c) 2018 Tander, All Rights Reserved.
*/

package ru.tander.additionnumberswhithexception.infrastructure.presentation;

import ru.tander.additionnumberswhithexception.infrastructure.AdditionNumbersApplication;
import ru.tander.additionnumberswhithexception.services.AdditionScenarioService;

public class MainEntryPoint {
	public static void main(String[] args) {
		AdditionNumbersApplication additionNumbersApplication = new AdditionNumbersApplication();
		AdditionScenarioService additionScenarioService = additionNumbersApplication.createAdditionScenarioService();
		additionScenarioService.startAdditionScenario();
	}
}
