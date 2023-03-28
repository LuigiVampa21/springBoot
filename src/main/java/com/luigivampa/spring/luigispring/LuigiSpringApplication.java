package com.luigivampa.spring.luigispring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.luigivampa.spring.luigispring.entreprise.MyWebController;
import com.luigivampa.spring.luigispring.game.GameRunner;

@SpringBootApplication
public class LuigiSpringApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(LuigiSpringApplication.class, args);

		// GamingConsole game = new MarioGame();
		// GameRunner runner = new GameRunner(game);

		GameRunner runner = context.getBean(GameRunner.class);

		MyWebController controller = context.getBean(MyWebController.class);

		System.out.println(controller.returnValueFromBusinessService());
		runner.run();
		// SuperContraGame game2 = new SuperContraGame();
		// GameRunner runner2 = new GameRunner(game2);
		// runner2.run();
		// PackmanGame game3 = new PackmanGame();
		// GameRunner runner3 = new GameRunner(game3);
		// runner3.run();
	}

}
