package com.elastic.api.endpoint;

import com.elastic.api.model.Index;
import com.elastic.api.service.DataRouter;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Component
@Path("/esClient")
@Api(value = "ElasticClient", description = "Service to query Elastic Search clusters and perform CRUD operations")
public class EndPoint {

    private Logger logger = LoggerFactory.getLogger(EndPoint.class);

    @Autowired
    private DataRouter dataRouter;

    @Path("/{indexName}/{indexID}")
    @GET
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String getIndexDetailsByID(
            @NotNull @PathParam("indexName") String indexName,
            @NotNull @PathParam("indexId") String indexId) {
        logger.info("Fetching index details for index id: " + indexId);
        return dataRouter.invokeIndexData(indexName);
    }

}


