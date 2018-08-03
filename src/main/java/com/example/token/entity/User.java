package com.example.token.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author cailei.lu
 * @description
 * @date 2018/8/3
 */

@TableName("t_sys_user")
@Getter
@Setter
public class User extends Model<User> {

    Long id;

    String username;

    String password;

    @TableField("del_flag")
    Integer   delFlag;
    @TableField("created_at")
    Timestamp createdAt;
    @TableField("updated_at")
    Timestamp updatedAt;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
