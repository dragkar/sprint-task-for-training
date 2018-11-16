package ru.tander.additionnumberswhithexception.services;

import ru.tander.additionnumberswhithexception.infrastructure.InputNumberServiceFromConsoleException;

public class AdditionScenarioService {
	private final ServiceAdditionOfIntegerNumbers serviceAdditionOfIntegerNumbers;
	private final ru.tander.additionnumberswhithexception.services.PrintService printService;
	private final ru.tander.additionnumberswhithexception.services.InputNumberService inputNumberService;

	public AdditionScenarioService(ServiceAdditionOfIntegerNumbers serviceAdditionOfIntegerNumbers,
								   ru.tander.additionnumberswhithexception.services.PrintService printService,
								   ru.tander.additionnumberswhithexception.services.InputNumberService inputNumberService) {
		this.serviceAdditionOfIntegerNumbers = serviceAdditionOfIntegerNumbers;
		this.printService = printService;
		this.inputNumberService = inputNumberService;
	}

	public void startAdditionScenario() {
		printService.printString("Сложение двух чисел:");

		printService.printString("Введите первое целое число:");
		int firstInputNumber = getInputNumber();

		printService.printString("Введите второе целое число:");
		int secondInputNumber = getInputNumber();

		printService.printString("Результат сложения двух чисел:");
		int result = serviceAdditionOfIntegerNumbers.additionIntNumbers(firstInputNumber, secondInputNumber);

		printService.printString(firstInputNumber + " + " + secondInputNumber + " = " + result);
	}

	private int getInputNumber() {
		while (true) {
			try {
				return inputNumberService.getInputNumber();
			} catch (InputNumberServiceFromConsoleException e) {
				printService.printString("Введено не целое число. Введите целое число:");
			}
		}
	}
}
