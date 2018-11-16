/*
 * Copyright (c) 2018 Tander, All Rights Reserved.
 */

package ru.tander.edditionwithproperty.infrastructure.presentation;

import ru.tander.edditionwithproperty.services.PrintService;

import java.io.IOException;
import java.nio.file.*;

public class FilePrintService implements PrintService {
	private final Path filePath;

	public FilePrintService(Path filePath) throws PrintServiceException {

		try {
			this.filePath = filePath;
			if (Files.exists(filePath)) {
				throw new FileAlreadyExistsException("File is already exists");
			} else {
				Files.createFile(filePath);
			}
		} catch (IOException e) {
			throw new PrintServiceException(e);
		}
	}


	@Override
	public void printString(String stringForPrint) throws PrintServiceException {
		try {
			stringForPrint = stringForPrint + "\n";
			Files.write(filePath, stringForPrint.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			throw new PrintServiceException("", e);
		}
	}
}
