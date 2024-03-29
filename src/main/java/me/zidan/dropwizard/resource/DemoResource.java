package me.zidan.dropwizard.resource;

import com.codahale.metrics.annotation.Timed;
import me.zidan.dropwizard.representation.Saying;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Path("/say-hello")
@Produces(MediaType.APPLICATION_JSON)
public class DemoResource {
  private String template;
  private String defaultName;
  private AtomicLong counter;

  public DemoResource(String template, String defaultName) {
    this.template = template;
    this.defaultName = defaultName;
    this.counter = new AtomicLong();
  }

  @GET
  @Timed
  public Saying sayHello(@QueryParam("name") Optional<String> name) {
    final String value = String.format(template, name.orElse(defaultName));
    return new Saying(counter.incrementAndGet(), value);
  }

}
