package io.getarrays.server;

import io.getarrays.server.enums.Status;
import io.getarrays.server.model.Server;
import io.getarrays.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args -> {
		serverRepo.save(new Server(null, "192.168.1.160", "Ubunto", "16GB", "Personal PC",
				"http://localhost:8080/image/server1.png", Status.SERVER_UP));
		serverRepo.save(new Server(null, "192.168.1.163", "Windows", "32GB", "Personal PC 2",
				"http://localhost:8080/image/server3.png", Status.SERVER_DOWN));
		};
	}

}
