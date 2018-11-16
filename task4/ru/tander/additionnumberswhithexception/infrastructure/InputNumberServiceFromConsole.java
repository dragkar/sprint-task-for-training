/*
* Copyright (c) 2018 Tander, All Rights Reserved.
*/

package ru.tander.additionnumberswhithexception.infrastructure;

import ru.tander.additionnumberswhithexception.services.*;

import java.util.Scanner;

public class InputNumberServiceFromConsole implements InputNumberService {
	private PrintService printService;

	public InputNumberServiceFromConsole(PrintService printService) {
		this.printService = printService;
	}

	@Override
	public int getInputNumber() throws InputNumberServiceFromConsoleException {
		Scanner scanner = new Scanner(System.in);

		if (!scanner.hasNextInt()) {
			throw new InputNumberServiceFromConsoleException("Неверный ввод");
		}

		return scanner.nextInt();
	}
}
