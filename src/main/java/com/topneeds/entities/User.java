package com.topneeds.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Iroshan on 7/23/2017.
 */

@Entity
@Table(name="user_table")
public class User implements Serializable{

    @Id
    @Column(name = "user_id")
    @GeneratedValue(generator = "snowflake")
    @GenericGenerator(name = "snowflake", strategy = "com.topneeds.utils.SnowflakeIdGenerator")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    public Long getUserId() {return userId;}

    public void setUserId(Long userId) {this.userId = userId;}

    public String getUserName() {return userName;}

    public void setUserName(String userName) {this.userName = userName;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}
}
