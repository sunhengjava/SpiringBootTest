package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sun.deploy.nativesandbox.comm.Request;
import com.zb.entity.Dept;
import com.zb.mapper.DeptMapper;
import com.zb.service.RpcDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service
public class RpcDeptServiceImpl implements RpcDeptService {
//把这个mapper对象声明出来调用
    @Autowired(required = false)
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findDeptList() {
        return deptMapper.findDeptList();
    }
}
