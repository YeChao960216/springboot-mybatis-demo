package com.example.springbootmybatisgeneratortest.service.serviceImpl;

import com.example.springbootmybatisgeneratortest.mapper.TransMapper;
import com.example.springbootmybatisgeneratortest.pojo.Trans;
import com.example.springbootmybatisgeneratortest.pojo.TransExample;
import com.example.springbootmybatisgeneratortest.service.TransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransServiceImpl implements TransService {
    @Autowired
    private TransMapper transMapper;

    @Override
    public int insert(Trans entity) throws Exception {
        return transMapper.insert(entity);
    }

    @Override
    public int update(Trans entity) throws Exception {
        return transMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int delete(Trans entity) throws Exception {
        return transMapper.deleteByPrimaryKey(entity.getTransId());
    }

    @Override
    public List<Trans> select(Trans entity) throws Exception {
        TransExample transExample = new TransExample();
        TransExample.Criteria criteria = transExample.createCriteria();
        if (entity.getTransId() != null) {
            criteria.andTransIdEqualTo(entity.getTransId());
        }
        return transMapper.selectByExample(transExample);
    }
}
