package com.mytests.spring.sbMapConfigProps.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.Nested;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "custom.config")
public class TestConfProperties {
 private String stringProp;
 private int intProp;
 private Map<String, String> mapProp;
 private NestedClassOne pojoPropOne;
 private NestedClassTwo pojoPropTwo;


    public static class NestedClassOne {
        private String strProp;
        private int numProp;

        public String getStrProp() {
            return strProp;
        }

        public void setStrProp(String strProp) {
            this.strProp = strProp;
        }

        public int getNumProp() {
            return numProp;
        }

        public void setNumProp(int numProp) {
            this.numProp = numProp;
        }
    }
    public static class NestedClassTwo {
        private String strProp;
        private int numProp;

        public String getStrProp() {
            return strProp;
        }

        public void setStrProp(String strProp) {
            this.strProp = strProp;
        }

        public int getNumProp() {
            return numProp;
        }

        public void setNumProp(int numProp) {
            this.numProp = numProp;
        }
    }

    public String getStringProp() {
        return stringProp;
    }

    public void setStringProp(String stringProp) {
        this.stringProp = stringProp;
    }

    public int getIntProp() {
        return intProp;
    }

    public void setIntProp(int intProp) {
        this.intProp = intProp;
    }

    public Map<String, String> getMapProp() {
        return mapProp;
    }

    public void setMapProp(Map<String, String> mapProp) {
        this.mapProp = mapProp;
    }

    public NestedClassOne getPojoPropOne() {
        return pojoPropOne;
    }

    public void setPojoPropOne(NestedClassOne pojoPropOne) {
        this.pojoPropOne = pojoPropOne;
    }

    public NestedClassTwo getPojoPropTwo() {
        return pojoPropTwo;
    }

    public void setPojoPropTwo(NestedClassTwo pojoPropTwo) {
        this.pojoPropTwo = pojoPropTwo;
    }
}
