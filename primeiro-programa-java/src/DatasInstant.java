import java.time.Duration;
import java.time.Instant;

public class DatasInstant {

	public static void main(String[] args) throws InterruptedException {
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Dura��o em nano segundos: " + duracao.toNanos());
		
		System.out.println("Dura��o em mili segundos: " + duracao.toMillis());
		
		System.out.println("Dura��o em minutos: " + duracao.toMinutes());
		

	}

}
