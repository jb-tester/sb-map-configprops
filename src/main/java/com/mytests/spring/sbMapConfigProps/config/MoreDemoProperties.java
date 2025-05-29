package com.mytests.spring.sbMapConfigProps.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;


@ConfigurationProperties("demo.more.map.props")
@Component
public class MoreDemoProperties {

    private String strProp;
    private int numProp;
  /**
   *  property of MyPOJO type.
   *  MyPOJO has three properties:
   * - strProp, which is of type String
   * - numProp, which is of type int
   * - mapProp, which is of type Map<String, ? extends MyPOJO>
   */
    private MyPOJO myPOJO;

    private Map<String, ? extends MyPOJO> strPojoMap;

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

    public MyPOJO getMyPOJO() {
        return myPOJO;
    }

    public void setMyPOJO(MyPOJO myPOJO) {
        this.myPOJO = myPOJO;
    }

    public Map<String, ? extends MyPOJO> getStrPojoMap() {
        return strPojoMap;
    }
    /**
     *  property of Map<String,MyPOJO> type.
     *  MyPOJO has three properties:
     * - strProp, which is of type String
     * - numProp, which is of type int
     * - mapProp, which is of type Map<String, ? extends MyPOJO>
     */
    public void setStrPojoMap(Map<String, ? extends MyPOJO> strPojoMap) {
        this.strPojoMap = strPojoMap;
    }

    public static class MyPOJO {
        /**
         * ***MyPOJO.strProp: has String type.***
         */
        private String strProp;

      /**
       * ***MyPOJO.numProp: has int type.***
       */
        private int numProp;
        private Map<String, ? extends MyPOJO> mapProp;

        public String getStrProp() {
            return strProp;
        }

        public void setStrProp(String value) {
            this.strProp = value;
        }

        public int getNumProp() {
            return numProp;
        }

        public void setNumProp(int numProp) {
            this.numProp = numProp;
        }

        public Map<String, ? extends MyPOJO> getMapProp() {
            return mapProp;
        }

        public void setMapProp(Map<String, ? extends MyPOJO> value) {
            this.mapProp = value;
        }
    }
}
