package com.example.springbootmybatisgeneratortest.service.serviceImpl;

import com.example.springbootmybatisgeneratortest.mapper.GrowersMapper;
import com.example.springbootmybatisgeneratortest.pojo.Growers;
import com.example.springbootmybatisgeneratortest.pojo.GrowersExample;
import com.example.springbootmybatisgeneratortest.service.GrowersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrowersServiceImpl implements GrowersService {
    @Autowired
    private GrowersMapper growersMapper;

    @Override
    public int insert(Growers entity) throws Exception {
        return growersMapper.insert(entity);
    }

    @Override
    public int update(Growers entity) throws Exception {
        return growersMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int delete(Growers entity) throws Exception {
        return growersMapper.deleteByPrimaryKey(entity.getGrowersId());
    }

    @Override
    public List<Growers> select(Growers entity) throws Exception {
        GrowersExample growersExample = new GrowersExample();
        GrowersExample.Criteria criteria = growersExample.createCriteria();
        if (entity.getGrowersId() != null) {
            criteria.andGrowersIdEqualTo(entity.getGrowersId());
        }
        return growersMapper.selectByExample(growersExample);
    }
}
