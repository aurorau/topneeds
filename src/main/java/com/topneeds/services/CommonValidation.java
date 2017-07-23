package com.topneeds.services;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * ==========================================
 * This service class is responsible to
 * manage all the common validation related
 * to input parameters at back end.
 *
 * Created by Iroshan on 7/23/2017.
 * ==========================================
 */

@Service
public class CommonValidation {

    public Boolean stringNotNullValidation (String param) {

        return StringUtils.isEmpty(param) ? false : true;

    }
}
