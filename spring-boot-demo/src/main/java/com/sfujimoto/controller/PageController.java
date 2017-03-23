package com.sfujimoto.controller;/* sfujimoto: 2017/03/20 14:12 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @RequestMapping("/")
    public String home() {
        return "HelloWorld";
    }

}
