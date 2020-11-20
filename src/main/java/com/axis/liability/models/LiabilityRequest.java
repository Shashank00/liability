package com.axis.liability.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LiabilityRequest {

    public String userId = null;
    public Integer sourceId = null;
}
