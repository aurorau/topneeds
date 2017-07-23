package com.topneeds.controllers;

import com.topneeds.dtos.UserDTO;
import com.topneeds.services.CommonValidation;
import com.topneeds.services.UserService;
import com.topneeds.utils.CustomizedResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * =========================================
 * This controller class is responsible to
 * handle all the api calls relates to user.
 *
 * Created by Iroshan on 7/23/2017.
 * =========================================
 */

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    private CommonValidation commonValidation;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, value = "/saveUpdateUserData")
    public CustomizedResponse saveUpdateUser(@RequestBody UserDTO dto){
        CustomizedResponse customizedResponse =  null;
        if (dto != null) {
            customizedResponse = userService.saveUpdateUser(dto);
        }
        return customizedResponse;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getUserData")
    public CustomizedResponse getUserById (@RequestParam("userId") String userId) {
        CustomizedResponse customizedResponse =  null;
        if (commonValidation.stringNotNullValidation(userId)) {
            customizedResponse = userService.getUserById(Long.parseLong(userId));
        }
        return customizedResponse;
    }


}
