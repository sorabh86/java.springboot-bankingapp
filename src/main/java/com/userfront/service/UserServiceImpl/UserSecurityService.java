/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.userfront.service.UserServiceImpl;

import com.userfront.Dao.UserDao;
import com.userfront.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sorabh86 <ssorabh.ssharma@gmail.com>
 */

@Service
public class UserSecurityService implements UserDetailsService {
    
    /** The application logger */
    private static final Logger LOG = LoggerFactory.getLogger(UserSecurityService.class);
    
    @Autowired
    private UserDao userDao;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);
        if(null == user) {
            LOG.warn("Username {} not found", username);
            throw new UsernameNotFoundException("Username "+username+" not found");
        }
        return user;
    }
}
