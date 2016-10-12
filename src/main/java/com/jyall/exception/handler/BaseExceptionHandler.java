package com.jyall.exception.handler;

/**
 * Unchecked Exception Handler
 * 
 * @author guo.guanfei
 *
 */
public class BaseExceptionHandler {
	protected String getErrorStackTrace(Throwable ex) {
//		StringWriter errorStackTrace = new StringWriter();
//		ex.printStackTrace(new PrintWriter(errorStackTrace));
//		msg = errorStackTrace.toString();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(ex).append("\r\n");
		for(StackTraceElement element : ex.getStackTrace()){
			stringBuilder.append("\tat ").append(element).append("\r\n");
		}
		return stringBuilder.toString();
	}
}
