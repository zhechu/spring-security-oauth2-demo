package me.josephzhu.springsecurity101.cloud.oauth2.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 无需登录就可以访问的资源
 *
 * @author lingyuwang
 * @date 2020-10-04 11:29
 * @since 1.0.4
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "Hello";
    }

}
