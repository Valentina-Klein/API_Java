package br.com.meugrupo.meuapp; // define o pacote ao qual classe pertence

// importa a classe que possui o método que permite iniciar uma app SB (springboot)
import org.springframework.boot.SpringApplication;
// importa a anotação  que renue várias configurações do SB 
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeuappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuappApplication.class, args);
	}

}
