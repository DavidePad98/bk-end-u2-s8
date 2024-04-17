package bkendu2s8.u2s8;

import bkendu2s8.u2s8.Adapter.ClassAdapter;
import bkendu2s8.u2s8.Adapter.Info;
import bkendu2s8.u2s8.Adapter.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class U2S8Application {

	public static void main(String[] args) {
		SpringApplication.run(U2S8Application.class, args);

		UserData userData = new UserData();
		Info info = new Info("Paolo", "Bonolis", LocalDate.of(1960,2,2));
		userData.getData(new ClassAdapter(info));
	}

}
