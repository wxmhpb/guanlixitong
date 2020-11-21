package com.xdja.repository.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xdja.repository.domain.User;
import com.xdja.repository.mapper.UserMapper;
import com.xdja.repository.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author liangqi
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
