package br.com.cantaruttim.exception;

import java.util.Date;

// formatará a nossa exception de forma mais amigável
public record ExceptionResponse(
        Date timestamp,
        String message,
        String details
        ) {

}
