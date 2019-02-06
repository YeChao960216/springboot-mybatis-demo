package com.example.springbootmybatisgeneratortest.service.serviceImpl;

import com.example.springbootmybatisgeneratortest.mapper.ChemicalsMapper;
import com.example.springbootmybatisgeneratortest.pojo.Chemicals;
import com.example.springbootmybatisgeneratortest.pojo.ChemicalsExample;
import com.example.springbootmybatisgeneratortest.service.ChemicalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChemicalsServiceImpl implements ChemicalsService {
    @Autowired
    private ChemicalsMapper chemicalsMapper;

    @Override
    public int insert(Chemicals entity) throws Exception {
        return chemicalsMapper.insert(entity);
    }

    @Override
    public int update(Chemicals entity) throws Exception {
        return chemicalsMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int delete(Chemicals entity) throws Exception {
        return chemicalsMapper.deleteByPrimaryKey(entity.getChemicalsId());
    }

    @Override
    public List<Chemicals> select(Chemicals entity) throws Exception {
        ChemicalsExample chemicalsExample = new ChemicalsExample();
        ChemicalsExample.Criteria criteria = chemicalsExample.createCriteria();
        if (entity.getChemicalsId() != null) {
            criteria.andChemicalsIdEqualTo(entity.getChemicalsId());
        }
        return chemicalsMapper.selectByExample(chemicalsExample);
    }
}
