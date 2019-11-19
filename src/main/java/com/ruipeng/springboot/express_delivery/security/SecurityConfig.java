package com.ruipeng.springboot.express_delivery.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*
 * @program: express_delivery.com.ruipeng.springboot.express_delivery.security.SecurityConfig
 *
 * @description:
 *
 * @author:Ruipeng
 *
 * @create:2019-11-19 11:01
 */
@Configuration
@EnableGlobalMethodSecurity(proxyTargetClass = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private MyPasswordEncoder myPasswordEncoder;
}
