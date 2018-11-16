package ru.tander.edditionwithproperty.services;

import ru.tander.edditionwithproperty.infrastructure.services.InputNumberServiceException;

public interface InputNumberService {
	int getInputNumber() throws InputNumberServiceException;
}
