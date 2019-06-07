package com.example.CICD;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CicdApplicationTests {

	@Test
	public void welcomeTest() {
		SampleText st = new SampleText();
		assertEquals("Hello EveryOne.. Welcome to Spring Boot", st.display());
	}

}
