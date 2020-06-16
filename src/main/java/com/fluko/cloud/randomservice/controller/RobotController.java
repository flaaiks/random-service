package com.fluko.cloud.randomservice.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fluko.cloud.randomservice.entity.RobotEntity;



@RestController
@RequestMapping("/factory")
public class RobotController {
	
	private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/robots/{model}",
                    method = RequestMethod.GET,
                    produces = {"application/JSON"})
    public RobotEntity getRobot(
    		@RequestParam(value = "model",
			      defaultValue = "RANDOMODEL",
			      required = false)
    		String model)
    {
    	return new RobotEntity(counter.incrementAndGet(), model);
    }
}
