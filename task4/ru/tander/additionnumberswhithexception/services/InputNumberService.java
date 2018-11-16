package ru.tander.additionnumberswhithexception.services;

import ru.tander.additionnumberswhithexception.infrastructure.InputNumberServiceFromConsoleException;

public interface InputNumberService {
	int getInputNumber() throws InputNumberServiceFromConsoleException;
}
