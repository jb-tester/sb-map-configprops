package com.mytests.spring.sbMapConfigProps.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "demo.map.props")
public class DemoProperties {
    private Map<String, Map<String, String>> one;
    private Map<String, Map<String, Boolean>> another;
    private Map<String, Map<String, List<String>>> third;

    public Map<String, Map<String, List<String>>> getThird() {
        return third;
    }

    public void setThird(Map<String, Map<String, List<String>>> third) {
        this.third = third;
    }

    public Map<String, Map<String, String>> getOne() {
        return one;
    }

    public void setOne(Map<String, Map<String, String>> one) {
        this.one = one;
    }

    public Map<String, Map<String, Boolean>> getAnother() {
        return another;
    }

    public void setAnother(Map<String, Map<String, Boolean>> another) {
        this.another = another;
    }
}
