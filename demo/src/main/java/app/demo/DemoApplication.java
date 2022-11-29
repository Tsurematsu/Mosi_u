package app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.demo.db.DataBase;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		DataBase.baseDeDatos.ConfigBase();
		SpringApplication.run(DemoApplication.class, args);
	}

}
