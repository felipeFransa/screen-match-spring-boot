package br.com.alura.sreenMatch;

import br.com.alura.sreenMatch.service.ConsumptionAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumptionAPI = new ConsumptionAPI();
		var json = consumptionAPI.getData("https://www.omdbapi.com/?i=tt3896198&apikey=3f9c31bf");

		System.out.println(json);
	}
}
