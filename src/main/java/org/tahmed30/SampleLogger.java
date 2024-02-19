package org.tahmed30;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SampleLogger {

	public static void main(String... args) {
		Logger LOGGER = LoggerFactory.getLogger(SampleLogger.class.getName());

		LOGGER.debug("Testing debug");
		LOGGER.info("Testing info");
		LOGGER.warn("Testing a warning");
		LOGGER.trace("Testing trace");
		LOGGER.error("Testing error");

	}
}
