package com.devin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DevinStartController {

    @RequestMapping("devin")
    @ResponseBody
    public String devin() {
        return "devin springboot访问成功啦";
    }

}
