package com.example.springsecuritytest.repo;

import com.example.springsecuritytest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: xieyi
 * @create: 2021/9/27 16:13
 * @conent:
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findOneByLogin(String login);

}
