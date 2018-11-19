package com.cloud.gateway.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.web.bind.annotation.*;

@RestController("/route")
public class RouteController {

    @Autowired
    private RouteSupport routeSupport;

    //增加路由
    @PostMapping("/add")
    public boolean add(@RequestBody RouteDefinition definition) {
        routeSupport.add(definition);
        return true;
    }

    //更新路由
    @PostMapping("/update")
    public boolean update(@RequestBody RouteDefinition definition) {
        routeSupport.update(definition);
        return true;
    }

    //删除路由
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable String id) {
        routeSupport.delete(id);
        return true;
    }
}