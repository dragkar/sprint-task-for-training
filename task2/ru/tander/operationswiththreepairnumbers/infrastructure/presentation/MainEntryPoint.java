/*
* Copyright (c) 2018 Tander, All Rights Reserved.
*/

package ru.tander.operationswiththreepairnumbers.infrastructure.presentation;

import ru.tander.operationswiththreepairnumbers.infrastructure.Application;
import ru.tander.operationswiththreepairnumbers.services.AdditionScenarioService;

public class MainEntryPoint {
	public static void main(String[] args) {
	Application application = new Application();
		AdditionScenarioService additionScenarioService = application.createAdditionScenarioService();
		additionScenarioService.startAdditionScenario();
	}
}
