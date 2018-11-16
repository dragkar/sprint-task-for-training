package ru.tander.edditionwithproperty.services;

import ru.tander.edditionwithproperty.infrastructure.presentation.PrintServiceException;

public interface PrintService {
	void printString(String stringForPrint) throws PrintServiceException;
}
