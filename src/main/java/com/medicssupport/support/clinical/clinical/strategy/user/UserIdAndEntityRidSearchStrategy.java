package com.medicssupport.support.clinical.clinical.strategy.user;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.clinical.model.user.User;
import com.medicssupport.support.clinical.clinical.model.user.UserConstants;
import com.medicssupport.support.clinical.clinical.repository.UserRepository;
import com.medicssupport.support.search.constants.SearchConstants;
import com.medicssupport.support.search.model.SearchData;
import com.medicssupport.support.search.service.SearchStrategyExtended;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component(UserConstants.STRATEGY_USER_ID_AND_ENTITY_RID)
@Slf4j
public class UserIdAndEntityRidSearchStrategy extends SearchStrategyExtended<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Page<User> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_TWO);

        List<String> userIds = dataMap.getOrDefault(UserConstants.KEY_USER_ID, List.of());
        
        List<Integer> userEntityRids = dataMap.getOrDefault(UserConstants.KEY_USER_ENTITY_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching user by userId: {} and userEntityRid: {}", userIds, userEntityRids);

        return userRepository.findAllByUserIdInAndUserEntityRidIn(userIds, userEntityRids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return UserConstants.COLUMN_USER_RID;
    }
}
