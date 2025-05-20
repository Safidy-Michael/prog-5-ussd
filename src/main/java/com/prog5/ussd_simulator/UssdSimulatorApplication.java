package com.prog5.ussd_simulator;

import com.prog5.ussd_simulator.engine.USSDEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class UssdSimulatorApplication {

	public static void main(String[] args) {
		final USSDEngine engine = new USSDEngine();
		final Scanner scanner = new Scanner(System.in);

		while (true) {
			engine.displayCurrentMenu();
			System.out.print("Votre choix : ");
			final String input = scanner.nextLine().trim();
			engine.processInput(input);
		}
	}

}
