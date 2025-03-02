package dev.raullalves.UserManager.Principal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserManagerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UserManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MenuManager user = new MenuManager();

		user.userManager();
	}
}