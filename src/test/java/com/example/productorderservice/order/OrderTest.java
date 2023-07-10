package com.example.productorderservice.order;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.productorderservice.product.DiscountPolicy;
import com.example.productorderservice.product.Product;

class OrderTest {

	@Test
	void getTotalPrice() {
		final Order order = new Order(new Product("상품명", 2000, DiscountPolicy.FIX_1000_AMOUNT), 2);

		final int totalPrice = order.getTotalPrice();

		assertThat(totalPrice).isEqualTo(2000);
	}
}
