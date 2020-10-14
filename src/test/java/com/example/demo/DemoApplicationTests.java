package com.example.demo;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Value;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class DemoApplicationTests {

	TestRestTemplate restTemplate = new TestRestTemplate();
	
	int port=8080;
    String url = "http://localhost:" + port;
	
   
	@Test
	public void contextLoads() {
	    System.out.println("URLは"+url);
		assertThat(restTemplate.getForObject(url,String.class), equalTo("hello!"));
		
		
	}

}
