package br.com.zup.ordertraicing;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    public OrderRepresentation createOrder(OrderRepresentation order) {
        String orderId = UUID.randomUUID().toString();
        order.setId(orderId);
        return order;
    }

}
