package com.zxx.store.controller;

import com.sun.org.apache.xpath.internal.operations.String;
import com.zxx.store.common.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Response login(HttpServletRequest request, Map<String, String> reqMap) {
        Response response = null;
        response = Response.success(null);
        return response;
    }

}
