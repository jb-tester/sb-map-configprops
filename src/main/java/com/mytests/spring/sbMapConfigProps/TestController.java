package com.mytests.spring.sbMapConfigProps;

import com.mytests.spring.sbMapConfigProps.config.DemoProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    private final DemoProperties demoProperties;

    public TestController(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }

    @GetMapping("/test1")
    public String test1() {
        String rez = "";
        for (String s : demoProperties.getOne().keySet()) {
          rez = rez + " "+ s + ": "+ demoProperties.getOne().get(s);
        }

        return rez;
    }

    @GetMapping("/test2")
    public String test2() {
        String rez = "";
        for (String s : demoProperties.getAnother().keySet()) {
            rez = rez + " "+ s + ": "+ demoProperties.getAnother().get(s);
        }

        return rez;
    }
}
