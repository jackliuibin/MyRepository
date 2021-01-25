package com.for42.study.model;

import lombok.Data;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import org.apache.commons.lang.StringEscapeUtils;
import org.restlet.data.Reference;

@Data
public class User {
    @NotEmpty(message = "姓名不能为空")
    private String name;

    @Max(value = 100,message = "最大为100岁")
    @Min(value = 18,message = "最小为18岁")
    private int age;

    @NotEmpty(message = "密码不能为空")
    @Length(min = 6,message = "密码长度不能小于6位")
    private String pass;

}
