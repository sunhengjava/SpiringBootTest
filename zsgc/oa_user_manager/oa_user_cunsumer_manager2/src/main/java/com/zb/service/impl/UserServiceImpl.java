package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zb.entity.Dept;
import com.zb.service.RpcDeptService;
import com.zb.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Reference
    private RpcDeptService rpcDeptService;


    public List<Dept> getCurrentDeptInfo(){
        return rpcDeptService.findDeptList();
    }



}
