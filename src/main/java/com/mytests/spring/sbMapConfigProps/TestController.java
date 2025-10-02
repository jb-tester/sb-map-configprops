package com.mytests.spring.sbMapConfigProps;

import com.mytests.spring.sbMapConfigProps.config.DemoProperties;
import com.mytests.spring.sbMapConfigProps.config.MoreDemoProperties;
import com.mytests.spring.sbMapConfigProps.config.TestConfProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    private final DemoProperties demoProperties;
    private final MoreDemoProperties moreDemoProperties;
    private final TestConfProperties testConfProperties;

    public TestController(DemoProperties demoProperties, MoreDemoProperties moreDemoProperties, TestConfProperties testConfProperties) {
        this.demoProperties = demoProperties;
        this.moreDemoProperties = moreDemoProperties;
        this.testConfProperties = testConfProperties;
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
    @GetMapping("/test3")
    public String test3() {
        String rez = "";
        for (String s : demoProperties.getThird().keySet()) {
            rez = rez + " "+ s + ": "+ demoProperties.getThird().get(s);
        }

        return rez;
    }

    @GetMapping("/test4")
    public String test4() {
        String strProp = moreDemoProperties.getMyPOJO().getStrProp();
        int numProp = moreDemoProperties.getMyPOJO().getNumProp();
        return strProp+" "+numProp;
    }

    @GetMapping("/test5")
    public String test5() {
        String maps = testConfProperties.getMapProp().toString();
        return maps;
    }
}
