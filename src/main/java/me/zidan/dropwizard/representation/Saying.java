package me.zidan.dropwizard.representation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

@Accessors(chain = true, fluent = true)
public class Saying {
  @JsonProperty
  private Long id;

  @JsonProperty
  @Length(max = 3)
  private String content;

  public Saying(Long id, String content) {
    this.id = id;
    this.content = content;
  }
}
