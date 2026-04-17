package com.medicssupport.support.clinical.clinical.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.clinical.converter.UserConverter;
import com.medicssupport.support.clinical.clinical.model.user.User;
import com.medicssupport.support.clinical.clinical.model.user.UserDTO;
import com.medicssupport.support.clinical.clinical.model.user.UserConstants;
import com.medicssupport.support.clinical.clinical.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(UserConstants.PATH_USER)
@RestController
public class UserController extends SuperController<User, UserDTO, Integer> {

    protected UserController(UserService userService, UserConverter userConverter) {
        super(userService, userConverter);
    }
}
