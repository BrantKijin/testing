package sample.cafekiosk.spring.api.controller.order;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class OrderController {

	private OrderService orderService;
}
