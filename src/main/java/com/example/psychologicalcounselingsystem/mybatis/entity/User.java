/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.psychologicalcounselingsystem.mybatis.entity;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private int userID;
    private String userPassword;

    public User() {
    }

    public User(int userID,String userPassword){
        this.userID= userID;
        this.userPassword=userPassword;
    }

    public User(int id, int userID, String userPassword) {
        this.id = id;
        this.userID = userID;
        this.userPassword = userPassword;
    }

    // setter方法
    public void setId(int id) {
        this.id = id;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    // getter方法
    public int getId() {
        return id;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserPassword() {
        return userPassword;
    }
}