package tests;

import java.lang.Exception;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.Keys;

/**
 * Adds various utilities used by generated tests
 */
class GeneratedUtils {
	/**
	 * Adds a pause before/after steps based on test and step-specific settings.
	 */
	public static void sleep(int milliseconds) throws Exception {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		}
		catch (Exception e) {
			throw new Exception("Pause between steps was interrupted", e);
		}
	}

	/**
	 * Converts an array of comma-separated keys (e.g. TAB) for use by sendKeys() method.
	 */
	public static Keys[] getKeys(String keyString) {
		String[] keyArray = keyString.split(",");
		Function<String, Keys> func = s -> Keys.valueOf(s);
		return Arrays.stream(keyArray).map(func).toArray(Keys[]::new);
	}

}
