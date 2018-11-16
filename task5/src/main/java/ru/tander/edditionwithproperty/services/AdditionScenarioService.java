package ru.tander.edditionwithproperty.services;


import ru.tander.edditionwithproperty.infrastructure.presentation.PrintServiceException;
import ru.tander.edditionwithproperty.infrastructure.services.InputNumberServiceException;

public class AdditionScenarioService {
	private final ServiceAdditionOfIntegerNumbers serviceAdditionOfIntegerNumbers;
	private final PrintService printService;
	private final InputNumberService inputNumberService;

	public AdditionScenarioService(ServiceAdditionOfIntegerNumbers serviceAdditionOfIntegerNumbers,
								   PrintService printService,
								   InputNumberService inputNumberService) {
		this.serviceAdditionOfIntegerNumbers = serviceAdditionOfIntegerNumbers;
		this.printService = printService;
		this.inputNumberService = inputNumberService;
	}

	public void startAdditionScenario() throws AdditionScenarioServiceException {
		try {
			printService.printString("Сложение двух чисел:");


			printService.printString("Введите первое целое число:");
			int firstInputNumber = getInputNumber();
			printService.printString("Введено первое целое число: " + firstInputNumber);

			printService.printString("Введите второе целое число:");
			int secondInputNumber = getInputNumber();
			printService.printString("Введено второе целое число: " + secondInputNumber);

			printService.printString("Результат сложения двух чисел:");
			int result = serviceAdditionOfIntegerNumbers.additionIntNumbers(firstInputNumber, secondInputNumber);

			printService.printString(firstInputNumber + " + " + secondInputNumber + " = " + result);
		} catch (PrintServiceException e) {
			throw new AdditionScenarioServiceException(e);
		}
	}

	private int getInputNumber() throws PrintServiceException {
		while (true) {
			try {
				return inputNumberService.getInputNumber();
			} catch (InputNumberServiceException e) {
				printService.printString("Введено не целое число. Введите целое число:");
			}
		}
	}
}
