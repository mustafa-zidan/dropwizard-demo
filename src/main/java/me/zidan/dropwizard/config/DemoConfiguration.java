package me.zidan.dropwizard.config;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.NotEmpty;

@Accessors(fluent = true, chain = true)
public class DemoConfiguration extends Configuration {

    @NotEmpty
    @JsonProperty
    private String template;

    @NotEmpty
    @JsonProperty
    private String defaultName = "Stranger";

}
