package org.springframework.social.twitter.api.impl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Annotated mixin to add Jackson annotations to TwitterObject. 
 * @author Craig Walls
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class TwitterObjectMixin {

	@JsonAnySetter
	abstract void add(String key, Object value);

	@JsonIgnore
	abstract JsonNode getRawJson();

	@JsonProperty("rawJson")
	abstract void setRawJson(JsonNode rawJson);
}
