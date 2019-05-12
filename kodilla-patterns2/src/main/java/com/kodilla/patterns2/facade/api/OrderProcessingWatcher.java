package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class OrderProcessingWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderProcessingWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + "&& target(object) && args(orderDto, userId)")
    public void logEvent(Object object, OrderDto orderDto, Long userId) {
        LOGGER.info("Class: " + object.getClass().getName() + ", Args: [orderDto: " + orderDto.toString() + " , userId= " + userId + " ]");
    }
}
