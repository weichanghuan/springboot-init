package com.wch.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wch
 * @Description:
 * @Date: 2019-11-23 15:07
 */
@SpringBootApplication(scanBasePackages = {"io.wch.init"})
@RestController
public class ApplicationStart {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationStart.class);

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
        LOGGER.info("atomservice running....");
    }

    @GetMapping("/init")
    public String init() {
        LOGGER.info("接受访问");
        return "ok";
    }
}
