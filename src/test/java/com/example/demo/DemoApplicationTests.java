package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Samples.Sample;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testMyService() {
		String result = "result";
		assertEquals("result", result);
	}

	@Test
	public void testSample() {
		Sample sample1 = new Sample("sample1");
		assertEquals(sample1.getSample(), "sample1");
	}

}
