package com.topneeds.utils;

/**
 * =========================================
 * This util class is used to handle all the
 * response data for api response.
 *
 * Created by Iroshan on 7/23/2017.
 * =========================================
 */
public class CustomizedResponse {

    private Object responseData;
    private Object errorData;
    private Boolean successStatus;

    public Object getResponseData() {return responseData;}

    public void setResponseData(Object responseData) {this.responseData = responseData;}

    public Object getErrorData() {return errorData;}

    public void setErrorData(Object errorData) {this.errorData = errorData;}

    public Boolean getSuccessStatus() {return successStatus;}

    public void setSuccessStatus(Boolean successStatus) {this.successStatus = successStatus;}
}
