package com.example.mobileapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc 
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // Tambahkan ini
class MobileapiApplicationTests {

	@Test
	void contextLoads() {
	}

}
