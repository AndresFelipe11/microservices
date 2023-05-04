package com.pragma.plaza_comida.domain.api;

import com.pragma.plaza_comida.domain.model.OrderModel;
import com.pragma.plaza_comida.domain.model.OrderState;

import java.util.List;

public interface IOrderServicePort {
    OrderModel createOrder(OrderModel orderModel);

    OrderModel getOrder(Long orderId);

    List<OrderModel> getAllOrdersByOrderState(OrderState orderState, Long restaurantId);
    Boolean getAllOrdersByUserIdOrderStateIn(Long clientId, List<OrderState> orderStateList);
}