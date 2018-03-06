package com.ren.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ Author:Bob
 * @ Date:2018/3/5 15:23
 * @ Description: 测试Logger
 */

@Controller
@RequestMapping("/logger")
public class LoggerController {
    private static final Logger logger = LoggerFactory.getLogger(LoggerController.class);
    @RequestMapping("/test")
    public String loggerTest(){
        logger.trace("Trace message");
        logger.debug("Debug message");
        logger.info("The loggerTest pages");
        logger.warn("Warning message");
        return "loggerTest";
    }
}
