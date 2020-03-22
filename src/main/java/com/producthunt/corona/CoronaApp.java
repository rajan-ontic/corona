package com.producthunt.corona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * Author : rajan
 * Date : 2020-02-06
 */


@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration.class,
        GsonAutoConfiguration.class
})
@Import({ // @formatter:off
        CoronaAppConfig.class,
        // @formatter:on
})
public class CoronaApp extends WebMvcAutoConfiguration {

    public static void main(final String... args) {
        SpringApplication.run(CoronaApp.class, args);
    }

}
