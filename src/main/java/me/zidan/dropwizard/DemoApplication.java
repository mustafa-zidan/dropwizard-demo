package me.zidan.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import me.zidan.dropwizard.config.DemoConfiguration;

public class DemoApplication extends Application<DemoConfiguration> {

    public static void main(String[] args) throws Exception {
        new DemoApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello world";
    }

    @Override
    public void run(DemoConfiguration configuration, Environment environment) throws Exception {

    }
}
