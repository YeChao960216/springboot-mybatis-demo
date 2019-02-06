package com.example.springbootmybatisgeneratortest.service.serviceImpl;

import com.example.springbootmybatisgeneratortest.mapper.ManufactureMapper;
import com.example.springbootmybatisgeneratortest.pojo.Manufacture;
import com.example.springbootmybatisgeneratortest.pojo.ManufactureExample;
import com.example.springbootmybatisgeneratortest.service.ManufactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufactureServiceImpl implements ManufactureService {
    @Autowired
    private ManufactureMapper manufactureMapper;

    @Override
    public int insert(Manufacture entity) throws Exception {
        return manufactureMapper.insert(entity);
    }

    @Override
    public int update(Manufacture entity) throws Exception {
        return manufactureMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int delete(Manufacture entity) throws Exception {
        return manufactureMapper.deleteByPrimaryKey(entity.getManufactureId());
    }

    @Override
    public List<Manufacture> select(Manufacture entity) throws Exception {
        ManufactureExample manufactureExample = new ManufactureExample();
        ManufactureExample.Criteria criteria = manufactureExample.createCriteria();
        if (entity.getManufactureId() != null) {
            criteria.andManufactureIdEqualTo(entity.getManufactureId());
        }
        return manufactureMapper.selectByExample(manufactureExample);
    }
}
