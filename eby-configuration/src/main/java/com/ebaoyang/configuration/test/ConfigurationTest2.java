package com.ebaoyang.configuration.test;

import com.ebaoyang.configuration.model.ConfigGroup;
import com.ebaoyang.configuration.service.IConfiguration;
import com.ebaoyang.configuration.service.impl.Configuration;

public class ConfigurationTest2 {
    public static void main(String[] args) throws InterruptedException {
        IConfiguration configuration = new Configuration();

        configuration.set(ConfigGroup.WALLET, "prop2", "000");
    }
}
