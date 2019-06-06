package test;

import test.TMerchantAudit;

public interface TMerchantAuditMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TMerchantAudit record);

    int insertSelective(TMerchantAudit record);

    TMerchantAudit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TMerchantAudit record);

    int updateByPrimaryKey(TMerchantAudit record);
}