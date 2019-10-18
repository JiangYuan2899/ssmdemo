package com.jiangyuan.test.userdemo.po;

import lombok.Data;

//@EqualsAndHashCode (callSuper = true)
@Data
public class User {
    private Integer userid;
    private String  username;
    private String  sex;
    private String  age;

}
