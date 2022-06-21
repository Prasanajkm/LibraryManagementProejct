package com.Prasana.Library.AdminAddBook.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.Prasana.Library.AdminAddBook.exception.AdminAddBookException;

@Component
@Aspect
public class LoggingAspect {
	public static final Log LOGGER=LogFactory.getLog(LoggingAspect.class);
	//@AfterThrowing(pointcut="execution(*com.Prasana.Library.AdminAddBook.service.AdminAddBookService.*(..))",throwing="exception")
	public void logServiceException(AdminAddBookException exception) {
		LOGGER.error(exception.getMessage(),exception);
		
	}
	
}
