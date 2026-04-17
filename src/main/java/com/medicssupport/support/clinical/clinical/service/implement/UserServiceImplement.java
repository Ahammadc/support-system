package com.medicssupport.support.clinical.clinical.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.clinical.model.user.User;
import com.medicssupport.support.clinical.clinical.repository.UserRepository;
import com.medicssupport.support.clinical.clinical.service.UserService;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class UserServiceImplement extends SuperServiceImpl<User, Integer> implements UserService {

    @Autowired
    public UserServiceImplement(UserRepository userRepository, Map<String, SearchStrategy<User>> searchStrategies) {
        super(userRepository, searchStrategies);
    }
}
