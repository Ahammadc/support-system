package com.medicssupport.support.clinical.clinical.service;

import com.medicssupport.support.application.core.layer.SuperService;
import com.medicssupport.support.clinical.clinical.model.user.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends SuperService<User, Integer> {}
