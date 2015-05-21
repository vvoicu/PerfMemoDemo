package com.tools;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Custom class for data generation
 * 
 * @author vladvoicu
 * 
 */
public final class FieldGenerators {

	public static SecureRandom random = new SecureRandom();

	public static enum Mode {
		ALPHA_CAPS, ALPHA, ALPHANUMERIC, NUMERIC, ALPHANUMERICSCHAR,
	}

	public static Integer getRandomInteger(int max) {
		return Math.abs(random.nextInt(max));
	}

	public static Integer getRandomIntegerBetween(int min, int max) {
		int result = random.nextInt(max + 1);
		return (result >= min ? result : result + min);

	}

	public static String getCurrentTime() {
		long currentTime = System.currentTimeMillis();
		Date date = new Date(currentTime); // if you really have long
		return new SimpleDateFormat("HH:mm:ss").format(date.getTime());
	}

	public static String generateRandomString(int length, Mode mode) {

		StringBuffer buffer = new StringBuffer();
		String characters = "";

		switch (mode) {

		case ALPHA_CAPS:
			characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			break;

		case ALPHA:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			break;

		case ALPHANUMERIC:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			break;

		case NUMERIC:
			characters = "1234567890";
			break;

		case ALPHANUMERICSCHAR:
			characters = "ab\'cdef'|}{[]:'?@#$%^&*! ,.ghi\"jklmn'opq++*";
			break;

		}

		int charactersLength = characters.length();

		for (int i = 0; i < length; i++) {
			double index = Math.random() * charactersLength;
			buffer.append(characters.charAt((int) index));
		}
		return buffer.toString();
	}

}
