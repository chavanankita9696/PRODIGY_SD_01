package com.prodigy.tempconversion;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("*********Temperature Conversion Program*********");
		
		Integer choice;
		System.out.println("Enter the Temprature value::");
		Double temperature=scanner.nextDouble();
		do {
		System.out.println("Enter the original unit of measurement::");
		System.out.println();
		System.out.println("Press 1. for--> Celsius");
		System.out.println("Press 2. for--> Fahrenheit");
		System.out.println("Press 3. for--> Kelvin");
		System.out.println("Press 4. for-->Exit");
		choice=scanner.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("---------------------------------------------------------");
			System.out.println("Temperature Converted into Fahrenheit:"+celsiusToFahrenheit(temperature));
			System.out.println("Temprature Converted into Kelvin:"+celsiusToKelvin(temperature));
			System.out.println("---------------------------------------------------------");
			break;
		case 2:
			System.out.println("---------------------------------------------------------");
			System.out.println("Temperature Converted into Celsius:"+fahrenheitToCelsius(temperature));
			System.out.println("Temprature Converted into Kelvin:"+fahrenheitToKelvin(temperature));
			System.out.println("---------------------------------------------------------");
			break;
		case 3:
			System.out.println("---------------------------------------------------------");
			System.out.println("Temperature Converted into Celsius:"+KelvinToCelsius(temperature));
			System.out.println("Temprature Converted into Fahrenheit:"+KelvinToFahrenheit(temperature));
			System.out.println("---------------------------------------------------------");
			break;
		case 4:
			System.out.println("-------------------------------------------------------");
			System.out.println("You Are Exits From Program...");
			System.out.println("-------------------------------------------------------");
			System.exit(0);
		default:
			System.out.println("---------------------------------------------------------");
			System.out.println("Invalid Unit...!Please enter in Celsius,Fahrenheit,Kelvin");
			System.out.println("---------------------------------------------------------");
		 }
		}while(choice!=4);
		
		scanner.close();
	}

	private static Double KelvinToFahrenheit(Double Kelvin) {
	
		return 9/5 * (Kelvin-273) + 32;
	}

	private static Double KelvinToCelsius(Double Kelvin) {

		return Kelvin - 273.15 ;
	}

	private static Double fahrenheitToKelvin(Double fahrenheit) {

		return (fahrenheit + 459.67) * 5/9;
	}

	private static Double fahrenheitToCelsius(Double fahrenheit) {
	
		return (fahrenheit - 32) * 5/9;
	}

	private static Double celsiusToKelvin(Double Celsius) {
	
		return Celsius + 271.15;
	}

	private static Double celsiusToFahrenheit(Double Celsius) {

		return (Celsius * 9/5) + 32;
	}

}
