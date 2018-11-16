/*
* Copyright (c) 2018 Tander, All Rights Reserved.
*/
package ru.tander.additionnumbers.infrastructure.presentation;

import ru.tander.additionnumbers.services.PrintService;

public class ConsolePrintService implements PrintService {
	public void printString(String stringForPrint) {
		System.out.println(stringForPrint);
	}
}
