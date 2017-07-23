package com.topneeds.services;

import com.topneeds.dtos.UserDTO;
import com.topneeds.entities.User;
import com.topneeds.repositories.UserRepository;
import com.topneeds.utils.CustomizedResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * =========================================
 * This service class is responsible to
 * handle all the business logic relates to
 * user data.
 *
 * Created by Iroshan on 7/23/2017.
 * =========================================
 */

@Service
public class UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;


    /**
     * =====================================
     * This method is responsible to save
     * or update user data.
     * =====================================
     * @param dto
     * @return
     */
    @Transactional
    public CustomizedResponse saveUpdateUser(UserDTO dto) {
        CustomizedResponse customizedResponse = new CustomizedResponse();
        try {
            User user = new User();
            user.setUserName(dto.getUserName());
            user.setPassword(dto.getPassword());
            customizedResponse.setResponseData(userRepository.save(user));
            customizedResponse.setSuccessStatus(true);
        } catch (Exception e) {
            LOG.warn("Exception in saveUpdateUser() -> UserService :",e);
        }
        return customizedResponse;

    }

    /**
     * =====================================
     * This method is responsible to get
     * user data by userId.
     * =====================================
     * @param userId
     * @return
     */
    @Transactional
    public CustomizedResponse getUserById(Long userId) {
        CustomizedResponse customizedResponse = new CustomizedResponse();
        try {
            customizedResponse.setResponseData(userRepository.getUserById(userId));
            customizedResponse.setSuccessStatus(true);
        } catch (Exception e) {
            LOG.warn("Exception in getUserById() -> UserService :",e);
        }
        return customizedResponse;
    }


}
