package br.com.alura.sreenMatch;

import br.com.alura.sreenMatch.service.ConsumptionAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Scanner;

@SpringBootApplication
public class SreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner reading = new Scanner(System.in);
		LocalDate nowDate = LocalDate.now();
		System.out.println("Enter your title:");
		System.out.println(nowDate);
		String movie = reading.nextLine();
		var consumptionAPI = new ConsumptionAPI();
		var json = consumptionAPI.getData("https://www.omdbapi.com/?i=tt3896198&apikey=3f9c31bf");

		System.out.println(json);
	}
}
