package com.kodilla.good.patterns.food;


public class FoodOrderProcessor {
    private ManufacturerService manufacturerService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public FoodOrderProcessor(final ManufacturerService manufacturerService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.manufacturerService = manufacturerService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getManufacturer(), orderRequest.getProductName(),
                orderRequest.getOrderQuantity());

        if(isOrdered) {
            manufacturerService.process(orderRequest.getManufacturer(), orderRequest.getProductName(), orderRequest.getOrderQuantity());
            orderRepository.createOrder(orderRequest.getManufacturer(), orderRequest.getProductName(), orderRequest.getOrderQuantity());
            return new OrderDto(orderRequest.getManufacturer(), true);
        } else {
            return new OrderDto(orderRequest.getManufacturer(), false);
        }
    }
}
