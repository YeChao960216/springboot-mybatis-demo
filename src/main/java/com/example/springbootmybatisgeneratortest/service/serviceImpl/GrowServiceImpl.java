package com.example.springbootmybatisgeneratortest.service.serviceImpl;

import com.example.springbootmybatisgeneratortest.mapper.GrowMapper;
import com.example.springbootmybatisgeneratortest.pojo.Grow;
import com.example.springbootmybatisgeneratortest.pojo.GrowExample;
import com.example.springbootmybatisgeneratortest.service.GrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrowServiceImpl implements GrowService {
    @Autowired
    private GrowMapper growMapper;

    @Override
    public int insert(Grow entity) throws Exception {
        return growMapper.insert(entity);
    }

    @Override
    public int update(Grow entity) throws Exception {
        return growMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int delete(Grow entity) throws Exception {
        return growMapper.deleteByPrimaryKey(entity.getGrowId());
    }

    @Override
    public List<Grow> select(Grow entity) throws Exception {
        GrowExample growExample = new GrowExample();
        GrowExample.Criteria criteria = growExample.createCriteria();
        if (entity.getGrowId() != null) {
            criteria.andGrowIdEqualTo(entity.getGrowId());
        }
        return growMapper.selectByExample(growExample);
    }
}
