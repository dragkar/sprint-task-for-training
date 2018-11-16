/*
* Copyright (c) 2018 Tander, All Rights Reserved.
*/

package ru.tander.additionnumbers.infrastructure;

import ru.tander.additionnumbers.services.InputNumberService;

import java.util.Scanner;

public class InputNumberServiceFromConsole implements InputNumberService {
	public int getInputNumber() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}
