/*
* Copyright (c) 2018 Tander, All Rights Reserved.
*/

package ru.tander.operationswiththreepairnumbers.services;

import java.util.Random;

public class AdditionScenarioService {
	private final static int NUMBER_OF_PAIRS_NUMBERS = 3;
	private final static int UPPER_BOUND_GENERATED_NUMBERS = 100;

	private final ServiceAdditionOfIntegerNumbers serviceAdditionOfIntegerNumbers;
	private final PrintService printService;
	private final Random randomInt = new Random(UPPER_BOUND_GENERATED_NUMBERS);

	public AdditionScenarioService(ServiceAdditionOfIntegerNumbers serviceAdditionOfIntegerNumbers, PrintService printService) {
		this.serviceAdditionOfIntegerNumbers = serviceAdditionOfIntegerNumbers;
		this.printService = printService;
	}

	public void startAdditionScenario() {
		printService.printString("Сложение двух чисел:");

		for (int counterPairsNumbers = 0; counterPairsNumbers < NUMBER_OF_PAIRS_NUMBERS; counterPairsNumbers++) {
			int firstInputNumber = getRandomNumber();
			int secondInputNumber = getRandomNumber();
			int result = serviceAdditionOfIntegerNumbers.additionIntNumbers(firstInputNumber, secondInputNumber);
			printService.printString(firstInputNumber + " + " + secondInputNumber + " = " + result);
		}
	}

	private int getRandomNumber() {
		return randomInt.nextInt();
	}
}
