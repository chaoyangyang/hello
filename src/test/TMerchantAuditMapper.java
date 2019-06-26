package test;

public interface TMerchantAuditMapper {
    int deleteByPrimaryKey(Long id);

    int insert(test.TMerchantAudit record);

    int insertSelective(test.TMerchantAudit record);

    test.TMerchantAudit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(test.TMerchantAudit record);

    int updateByPrimaryKey(test.TMerchantAudit record);
}