package com.example.springbootmybatisgeneratortest.service.serviceImpl;

import com.example.springbootmybatisgeneratortest.mapper.CompanyMapper;
import com.example.springbootmybatisgeneratortest.pojo.Company;
import com.example.springbootmybatisgeneratortest.pojo.CompanyExample;
import com.example.springbootmybatisgeneratortest.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public int insert(Company entity) throws Exception {
        return companyMapper.insert(entity);
    }

    @Override
    public int update(Company entity) throws Exception {
        return companyMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int delete(Company entity) throws Exception {
        return companyMapper.deleteByPrimaryKey(entity.getCompanyId());
    }

    @Override
    public List<Company> select(Company entity) throws Exception {
        CompanyExample companyExample = new CompanyExample();
        CompanyExample.Criteria criteria = companyExample.createCriteria();
        if (entity.getCompanyId() != null) {
            criteria.andCompanyIdEqualTo(entity.getCompanyId());
        }
        return companyMapper.selectByExample(companyExample);
    }
}
