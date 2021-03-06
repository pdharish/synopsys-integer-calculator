package com.synopsys.homework;

/**
 * List of the supported logging levels that can be set by the user from command line
 *  Example: INFO, WARN|WARNING, DEBUG|FINE and ERROR|SEVERE
 *  I have considered WARNING, FINE and SEVERE as user can use either ERROR or SEVERE based on his/her preference.
 *  
 * @author xyz
 *
 */
public enum LogLevelEnum {
	INFO,
	ERROR,
	SEVERE,
	WARNING,
	WARN,
	FINE,
	DEBUG,
	OFF;
}
