package ru.tander.operationswithnumbers.infrastructure.presentation;

import ru.tander.operationswithnumbers.infrastructure.Application;
import ru.tander.operationswithnumbers.services.ServiceAdditionOfIntegerNumbers;

public class MainEntryPoint {
	private static final int FIRST_NUMBER = 12;

	private static final int SECOND_NUMBER = 12;

	public static void main(String[] args) {
		Application application = new Application();
		ServiceAdditionOfIntegerNumbers serviceAdditionOfIntegerNumbers = application.createIntOperationsManager();

		System.out.println("Сложение двух чисел:");
		int result = serviceAdditionOfIntegerNumbers.additionIntNumbers(FIRST_NUMBER, SECOND_NUMBER);
		System.out.println(FIRST_NUMBER + " + " + SECOND_NUMBER + " = "+ result);
	}
}
