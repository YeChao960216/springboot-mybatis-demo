package com.example.springbootmybatisgeneratortest.service.serviceImpl;

import com.example.springbootmybatisgeneratortest.mapper.PrivilegeMapper;
import com.example.springbootmybatisgeneratortest.pojo.Privilege;
import com.example.springbootmybatisgeneratortest.pojo.PrivilegeExample;
import com.example.springbootmybatisgeneratortest.service.PrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrivilegeServiceImpl implements PrivilegeService {
    @Autowired
    private PrivilegeMapper privilegeMapper;

    @Override
    public int insert(Privilege entity) throws Exception {
        return privilegeMapper.insert(entity);
    }

    @Override
    public int update(Privilege entity) throws Exception {
        return privilegeMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int delete(Privilege entity) throws Exception {
        return privilegeMapper.deleteByPrimaryKey(entity.getPrivilegeId());
    }

    @Override
    public List<Privilege> select(Privilege entity) throws Exception {
        PrivilegeExample privilegeExample = new PrivilegeExample();
        PrivilegeExample.Criteria criteria = privilegeExample.createCriteria();
        if (entity.getPrivilegeId() != null) {
            criteria.andPrivilegeIdEqualTo(entity.getPrivilegeId());
        }
        return privilegeMapper.selectByExample(privilegeExample);
    }
}
