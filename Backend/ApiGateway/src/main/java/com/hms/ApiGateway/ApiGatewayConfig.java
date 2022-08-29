package com.hms.ApiGateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

public class ApiGatewayConfig {
    @Bean
    public RouteLocator routeLocatorRoom(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route(p->p
                        .path("/room/get")
                        .uri("http://localhost:8081")
                )
                .route(p->p
                        .path("/room/add")
                        .uri("http://localhost:8081")
                )
                .route(p->p
                        .path("/room/get/{roomId}")
                        .uri("http://localhost:8081")
                )
                .route(p->p
                        .path("/room/update/{roomId}")
                        .uri("http://localhost:8081")
                )
                .route(p->p
                        .path("/room/delete/{roomId}")
                        .uri("http://localhost:8081")
                )
                .build();
    }
}
