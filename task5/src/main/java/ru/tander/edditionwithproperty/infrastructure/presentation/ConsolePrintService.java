package ru.tander.edditionwithproperty.infrastructure.configuration;

public enum OperationType {
	File("File"),
	Console("Console");

	private final String outputType;

	OperationType(String outputType) {
		this.outputType = outputType;
	}

	public String getOperationType() {
		return outputType;
	}

}
