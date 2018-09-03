/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.userfront.Dao;

import com.userfront.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sorabh86 <ssorabh.ssharma@gmail.com>
 */
public interface UserDao extends CrudRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
}
