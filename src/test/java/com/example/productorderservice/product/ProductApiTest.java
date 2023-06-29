package com.example.productorderservice.product;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import com.example.productorderservice.ApiTest;

class ProductApiTest extends ApiTest {

	@Test
	void 상품등록() {
		final var request = ProductSteps.상품등록요청_생성();

		final var response = ProductSteps.상품등록요청(request);

		assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
	}
}
