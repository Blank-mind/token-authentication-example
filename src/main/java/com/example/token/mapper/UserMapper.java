package com.example.token.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.token.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author cailei.lu
 * @description
 * @date 2018/8/3
 */
@Mapper
@Component
public interface UserMapper extends BaseMapper<User> {


}
