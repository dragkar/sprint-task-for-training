package ru.tander.operationswithnumbers.infrastructure;/*
* Copyright (c) 2018 Tander, All Rights Reserved.
*/


import ru.tander.operationswithnumbers.services.ServiceAdditionOfIntegerNumbers;

public class Application {
	public ServiceAdditionOfIntegerNumbers createIntOperationsManager() {
		return new ServiceAdditionOfIntegerNumbers();
	}
}
