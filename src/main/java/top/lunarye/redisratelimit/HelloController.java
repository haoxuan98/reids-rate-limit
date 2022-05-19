package top.lunarye.redisratelimit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lunarye.redisratelimit.unit.LimitType;
import top.lunarye.redisratelimit.unit.RateLimiter;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: lunar
 * @since: 2022-05-19
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    @RateLimiter(time = 50, count = 30, unit = TimeUnit.SECONDS, limitType = LimitType.IP)
    public String hello() {
        return "hello >>>" + new Date();
    }
}
