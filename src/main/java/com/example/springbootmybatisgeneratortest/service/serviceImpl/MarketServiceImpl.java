package com.example.springbootmybatisgeneratortest.service.serviceImpl;

import com.example.springbootmybatisgeneratortest.mapper.MarketMapper;
import com.example.springbootmybatisgeneratortest.pojo.Market;
import com.example.springbootmybatisgeneratortest.pojo.MarketExample;
import com.example.springbootmybatisgeneratortest.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketServiceImpl implements MarketService {
    @Autowired
    private MarketMapper marketMapper;

    @Override
    public int insert(Market entity) throws Exception {
        return marketMapper.insert(entity);
    }

    @Override
    public int update(Market entity) throws Exception {
        return marketMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int delete(Market entity) throws Exception {
        return marketMapper.deleteByPrimaryKey(entity.getOriginId());
    }

    @Override
    public List<Market> select(Market entity) throws Exception {
        MarketExample marketExample = new MarketExample();
        MarketExample.Criteria criteria = marketExample.createCriteria();
        if (entity.getOriginId() != null) {
            criteria.andOriginIdEqualTo(entity.getOriginId());
        }
        return marketMapper.selectByExample(marketExample);
    }
}
