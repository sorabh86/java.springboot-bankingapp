/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.userfront.service;

import com.userfront.domain.User;

/**
 *
 * @author Sorabh86 <ssorabh.ssharma@gmail.com>
 */
public interface UserService {
    User findByUsername(String username);
    User findByEmail(String email);
    
    boolean checkUserExists(String username, String email);
    boolean checkUsernameExists(String username);
    boolean checkEmailExists(String email);
    
    void save(User user);
}
