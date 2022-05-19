package top.lunarye.redisratelimit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisRateLimitApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisRateLimitApplication.class, args);
    }

}
