/*package com.icai.alertas.mvc;

import com.icai.alertas.mvc.controller.CryptoPriceController;
import com.icai.alertas.mvc.service.CryptoPriceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
class MvcApplicationTests {

	@Autowired
	private CryptoPriceService cryptoPriceService;

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		assertThat(cryptoPriceService).isNotNull();
	}

	/*@Test
	void registerPriceWithNegativeValue() throws Exception {
		BigDecimal negativePrice = new BigDecimal("-1000.0");

		mockMvc.perform(MockMvcRequestBuilders.post("/api/prices")
						.contentType(MediaType.APPLICATION_JSON)
						.content("{\"symbol\":\"ANY_SYMBOL\", \"price\": -1000.0, \"timestamp\":\"2025-03-28T20:30:00\"}"))
				.andExpect(MockMvcResultMatchers.status().isBadRequest());
	}

}*/
