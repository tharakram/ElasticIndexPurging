package com.elastic.api.config;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.jersey2.InstrumentedResourceMethodApplicationListener;
import com.elastic.api.endpoint.EndPoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

    @Inject
    public JerseyConfig() {
        //register(new InstrumentedResourceMethodApplicationListener(metricRegistry));
        register(EndPoint.class);
    }

}
