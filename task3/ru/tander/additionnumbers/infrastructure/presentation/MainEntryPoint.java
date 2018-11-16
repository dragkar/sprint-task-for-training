/*
* Copyright (c) 2018 Tander, All Rights Reserved.
*/

package ru.tander.additionnumbers.infrastructure.presentation;

import ru.tander.additionnumbers.infrastructure.AdditionNumbersApplication;
import ru.tander.additionnumbers.services.AdditionScenarioService;

public class MainEntryPoint {
	public static void main(String[] args) {
		AdditionNumbersApplication additionNumbersApplication = new AdditionNumbersApplication();
		AdditionScenarioService additionScenarioService = additionNumbersApplication.createAdditionScenarioService();
		additionScenarioService.startAdditionScenario();
	}
}
