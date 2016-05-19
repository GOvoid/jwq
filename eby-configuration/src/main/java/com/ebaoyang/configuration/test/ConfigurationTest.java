package com.ebaoyang.configuration.test;

import com.ebaoyang.configuration.model.ConfigGroup;
import com.ebaoyang.configuration.service.IConfiguration;
import com.ebaoyang.configuration.service.impl.Configuration;

public class ConfigurationTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("com.ebaoyang.configuration.environment", "1");

        IConfiguration configuration = new Configuration();
        configuration.init(ConfigGroup.WALLET);

        System.out.println(configuration.getChild(ConfigGroup.WALLET));

        String key1 = "prop1";
        String key2 = "prop2";

        while (true) {
            System.out.println("v1=" + configuration.get(ConfigGroup.WALLET, key1));
            System.out.println("v2=" + configuration.get(ConfigGroup.WALLET, key2));

            Thread.sleep(3000);
        }
    }
}
