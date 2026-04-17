package com.medicssupport.support.clinical.clinical.repository;

import com.medicssupport.support.clinical.clinical.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Page<User> findAllByUserRidIn(List<Integer> userRids, Pageable pageable);
    Page<User> findAllByUserIdInAndUserEntityRidIn(List<String> userIds, List<Integer> userEntityRids, Pageable pageable);
    Page<User> findAllByUserEntityRidIn(List<Integer> userEntityRids, Pageable pageable);
    Page<User> findAllByUserFullNameContainingIgnoreCaseAndUserEntityRidIn(String userFullName, List<Integer> userEntityRids, Pageable pageable);
}
