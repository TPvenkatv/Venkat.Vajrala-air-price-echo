package com.travelport.air.price.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.travelport.air.offerresource.model.OfferQueryBuildFromProducts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${openapi.offerResource.base-path:/11/air/price}")
@Slf4j
public class OffersController {

    @Autowired
    private ObjectMapper om;

    @PostMapping(value = "/offers/buildfromproducts", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OfferQueryBuildFromProducts> buildFromProducts(
            @RequestBody OfferQueryBuildFromProducts offerQueryBuildFromProducts,
            @RequestHeader(value = "TraceId", required = false) String traceId,
            @RequestHeader(value = "XAUTH_TRAVELPORT_ACCESSGROUP", required = false) String XAUTH_TRAVELPORT_ACCESSGROUP,
            @RequestHeader(value = "TravelportPlusSessionID", required = false) String travelportPlusSessionID) throws Exception {

        log.info("Request: " + om.writeValueAsString(offerQueryBuildFromProducts));
        log.info("Header XAUTH_TRAVELPORT_ACCESSGROUP: " + XAUTH_TRAVELPORT_ACCESSGROUP);
        log.info("Header TravelportPlusSessionID: " + travelportPlusSessionID);
        log.info("Header TraceId: " + traceId);

        ResponseEntity<OfferQueryBuildFromProducts> responseEntity = ResponseEntity.status(HttpStatus.OK)
                .header("TraceId", traceId)
                .header("XAUTH_TRAVELPORT_ACCESSGROUP", XAUTH_TRAVELPORT_ACCESSGROUP)
                .header("TravelportPlusSessionID", travelportPlusSessionID)
                .body(offerQueryBuildFromProducts);
        return responseEntity;
    }
}
