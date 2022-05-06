package com.mybatis.tiny.builder;

import com.mybatis.tiny.session.Configuration;
import com.mybatis.tiny.type.TypeAliasRegistry;

public abstract class BaseBuilder {

    protected final Configuration configuration;
    protected final TypeAliasRegistry typeAliasRegistry;

    public BaseBuilder(Configuration configuration) {
        this.configuration = configuration;
        this.typeAliasRegistry = this.configuration.getTypeAliasRegistry();
    }

    public Configuration getConfiguration() {
        return configuration;
    }
}
