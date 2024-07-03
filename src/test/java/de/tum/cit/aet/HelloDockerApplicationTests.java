package de.tum.cit.aet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloDockerApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void homeReturnsHelloDockerWorld() {
		String response = restTemplate.getForObject("/", String.class);
		assertThat(response).isEqualTo("Hello Docker World");
	}
}
