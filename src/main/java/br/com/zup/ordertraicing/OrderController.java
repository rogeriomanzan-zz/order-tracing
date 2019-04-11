package br.com.zup.ordertraicing;

import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import static org.springframework.http.HttpStatus.*;

@RestController
public class OrderController {

    private OrderService orderService;

    OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @ResponseBody
    @ResponseStatus(CREATED)
    @PostMapping("/orders")
    public OrderRepresentation createOrder(@RequestBody @Valid OrderRepresentation order)  {
        return orderService.createOrder(order);
    }

}
