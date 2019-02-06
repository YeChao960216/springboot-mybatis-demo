package com.example.springbootmybatisgeneratortest.service.serviceImpl;

import com.example.springbootmybatisgeneratortest.mapper.RoleMapper;
import com.example.springbootmybatisgeneratortest.pojo.Role;
import com.example.springbootmybatisgeneratortest.pojo.RoleExample;
import com.example.springbootmybatisgeneratortest.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public int insert(Role entity) throws Exception {
        return roleMapper.insert(entity);
    }

    @Override
    public int update(Role entity) throws Exception {
        return roleMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int delete(Role entity) throws Exception {
        return roleMapper.deleteByPrimaryKey(entity.getRoleId());
    }

    @Override
    public List<Role> select(Role entity) throws Exception {
        RoleExample roleExample = new RoleExample();
        RoleExample.Criteria criteria = roleExample.createCriteria();
        if (entity.getRoleId() != null) {
            criteria.andRoleIdEqualTo(entity.getRoleId());
        }
        return roleMapper.selectByExample(roleExample);
    }
}
