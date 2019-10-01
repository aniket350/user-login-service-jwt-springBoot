package com.stackroute.userloginservice.jwt;

import com.rabbitmq.tools.json.JSONUtil;
import com.stackroute.userloginservice.domain.User;

import java.io.Console;
import java.util.Map;

@FunctionalInterface
public interface SecurityTokenGenrator {
    Map<String, String> generateToken(User user);
}