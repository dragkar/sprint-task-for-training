/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.tander.edditionwithproperty.infrastructure.services;

import ru.tander.edditionwithproperty.services.InputNumberService;

import java.io.*;

public class InputNumberServiceFromFile implements InputNumberService {
	private final BufferedReader inputStream;

	public InputNumberServiceFromFile(String inputFileName) throws InputNumberServiceException {
		if (isParameterExist(inputFileName)) {
			throw new InputNumberServiceException("Bad file name for input data");
		}

		try {
			inputStream = new BufferedReader(new FileReader(new File(inputFileName).getAbsoluteFile()));
		} catch (FileNotFoundException e) {
			throw new InputNumberServiceException("Bad file");
		}
	}

	private boolean isParameterExist(String inputFileName) {
		return inputFileName == null || "".equals(inputFileName);
	}

	@Override
	public int getInputNumber() throws InputNumberServiceException {
		String str;
		try {
			if ((str = inputStream.readLine()) != null) {
				if (isParameterExist(str) || !str.matches("[-+]?\\d+")) {
					throw new InputNumberServiceException("Bad data");
				}
			}
			return Integer.parseInt(str);
		} catch (IOException e) {
			throw new InputNumberServiceException("Bad file");
		}
	}


}
