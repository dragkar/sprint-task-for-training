package ru.tander.edditionwithproperty.infrastructure.presentation;

/**
 * Класс FilePrintService
 */
public class PrintServiceException extends Exception {
	/**
	 * Создает <code>PrintServiceException</code> с указанным
	 * детализирующим сообщением.
	 *
	 * @param message детализирующее сообщение.
	 */
	public PrintServiceException(String message) {
		super(message);
	}

	/**
	 * Создает новое исключение с указанным детализирующим сообщением и
	 * причиной.
	 *
	 * @param message детализирующее сообщение (которое сохраняется для
	 *                дальнейшего получения через {@link Throwable#getMessage()} метод).
	 * @param cause   причина (которое сохраняется для дальнейшего
	 *                получения через {@link Throwable#getCause()} method).
	 *                (Значение <tt>null</tt> является разрешенным, и означает
	 *                что причина несуществует или неизвестна.)
	 */
	public PrintServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Создает новое исключение с причиной.
	 *
	 * @param cause причина (которое сохраняется для дальнейшего
	 *              получения через {@link Throwable#getCause()} method).
	 *              (Значение <tt>null</tt> является разрешенным, и означает
	 *              что причина несуществует или неизвестна.)
	 */
	public PrintServiceException(Throwable cause) {
		super(cause);
	}
}
