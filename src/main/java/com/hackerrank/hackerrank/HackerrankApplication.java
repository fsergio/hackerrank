package com.hackerrank.hackerrank;

import com.hackerrank.hackerrank.practice.algorithms.dataStructures.DiagonalDifference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HackerrankApplication implements CommandLineRunner {
	private static Logger LOG = LoggerFactory
			.getLogger(HackerrankApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DiagonalDifference.class, args);
		LOG.info("STARTING THE APPLICATION");
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("EXECUTING : command line runner");

		for (int i = 0; i < args.length; ++i) {
			LOG.info("args[{}]: {}", i, args[i]);
		}
	}
}
