package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xwfstart
 * @create 2022-09-03 15:09
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "pk/index.html";
    }
}
