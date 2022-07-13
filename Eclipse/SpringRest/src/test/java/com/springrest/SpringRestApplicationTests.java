package com.springrest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringRestApplicationTests {

	Calculator c=new Calculator();
	@Test
	void contextLoads() {
	}

	@Test
	void testSum() {
		int expresult=91;
		int actualresult=c.doSum(6, 80, 4);
		
		assertThat(expresult).isEqualTo(actualresult);
	}
}
