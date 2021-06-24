package com.amran.dynamic.multitenant.mastertenant.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.time.LocalDateTime;

public class DynamicRoutingDataSourceResolver extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        String tenantName = DBContextHolder.getCurrentDb();
        if ("tenant1".equals(tenantName)) {
            return "dataSource1";
        } else {
            return "dataSource2";
        }
    }
}