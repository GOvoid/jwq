package com.ebaoyang.configuration.service;

import com.ebaoyang.configuration.model.ConfigGroup;

import java.util.List;

public interface IConfiguration {

    void init(ConfigGroup... groups);

    String get(ConfigGroup group, String prop);

    void set(ConfigGroup group, String prop, String value);

    void remove(ConfigGroup group, String prop);

    List<String> getChild(ConfigGroup group);
}
