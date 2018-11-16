/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.tander.edditionwithproperty.infrastructure.services;

import ru.tander.edditionwithproperty.services.InputNumberService;

import java.util.Scanner;

public class InputNumberServiceFromConsole implements InputNumberService {
	@Override
	public int getInputNumber() throws InputNumberServiceException {
		Scanner scanner = new Scanner(System.in);

		if (!scanner.hasNextInt()) {
			throw new InputNumberServiceException("Неверный ввод");
		}

		return scanner.nextInt();
	}
}
