package com.ruipeng.springboot.express_delivery.security;

import org.springframework.security.crypto.password.PasswordEncoder;

/*
 * @program: spring_security_lab08.com.ruipeng.springboot.spring_security_lab08.security.MyPasswordEncoder
 *
 * @description:
 *
 * @author:Ruipeng
 *
 * @create:2019-11-13 21:37
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
