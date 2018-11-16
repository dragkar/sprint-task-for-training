package ru.tander.additionnumbers.services;

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

	public void startAdditionScenario() {
		printService.printString("Сложение двух чисел:");

		printService.printString("Введите первое целое число:");
		int firstInputNumber = inputNumberService.getInputNumber();

		printService.printString("Введите второе целое число:");
		int secondInputNumber = inputNumberService.getInputNumber();

		printService.printString("Результат сложения двух чисел:");
		int result = serviceAdditionOfIntegerNumbers.additionIntNumbers(firstInputNumber, secondInputNumber);

		printService.printString(firstInputNumber + " + " + secondInputNumber + " = " + result);
	}


}
