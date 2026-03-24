package com.mytests.spring.sbMapConfigProps.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;


@ConfigurationProperties(prefix = "my.new.props")
@Component
public class MoreProperties {

    private Map<String, List<String>> stringListMap;
    private Map<String, InnerPojo> pojoMap;

    private static class InnerPojo {
        private Set<String> stringSet;
        private Map<String, String> stringMap;

        public Set<String> getStringSet() {
            return stringSet;
        }

        public void setStringSet(Set<String> stringSet) {
            this.stringSet = stringSet;
        }

        public Map<String, String> getStringMap() {
            return stringMap;
        }

        public void setStringMap(Map<String, String> stringMap) {
            this.stringMap = stringMap;
        }
    }

    public Map<String, List<String>> getStringListMap() {
        return stringListMap;
    }

    public void setStringListMap(Map<String, List<String>> stringListMap) {
        this.stringListMap = stringListMap;
    }

    public Map<String, InnerPojo> getPojoMap() {
        return pojoMap;
    }

    public void setPojoMap(Map<String, InnerPojo> pojoMap) {
        this.pojoMap = pojoMap;
    }
}
