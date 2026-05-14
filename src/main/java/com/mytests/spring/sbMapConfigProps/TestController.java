package com.mytests.spring.sbMapConfigProps;

import com.mytests.spring.sbMapConfigProps.config.DemoProperties;
import com.mytests.spring.sbMapConfigProps.config.MoreDemoProperties;
import com.mytests.spring.sbMapConfigProps.config.TestConfProperties;
import io.micrometer.core.instrument.Meter;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;
import org.springframework.boot.actuate.autoconfigure.metrics.ServiceLevelObjectiveBoundary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class TestController {

    private final DemoProperties demoProperties;
    private final MoreDemoProperties moreDemoProperties;
    private final TestConfProperties testConfProperties;
    private final MetricsProperties metricsProperties;

    public TestController(DemoProperties demoProperties, MoreDemoProperties moreDemoProperties, TestConfProperties testConfProperties, MetricsProperties metricsProperties) {
        this.demoProperties = demoProperties;
        this.moreDemoProperties = moreDemoProperties;
        this.testConfProperties = testConfProperties;
        this.metricsProperties = metricsProperties;
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

    @GetMapping("/test6")
    public Map<String, String> test6() {
        Map<String, String> metrics = new HashMap<>();
        metricsProperties.getDistribution().getSlo().forEach((k, v) -> metrics.put(k, v[0].getValue(Meter.Type.TIMER).toString()));
        return metrics;
    }
}
