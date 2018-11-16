/*
* Copyright (c) 2018 Tander, All Rights Reserved.
*/
package ru.tander.additionnumberswhithexception.infrastructure.presentation;

import ru.tander.additionnumberswhithexception.services.PrintService;

public class ConsolePrintService implements PrintService {
	public void printString(String stringForPrint) {
		System.out.println(stringForPrint);
	}
}
