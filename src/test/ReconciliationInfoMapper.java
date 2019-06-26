package test;

import java.math.BigDecimal;

public interface ReconciliationInfoMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(test.ReconciliationInfo record);

    int insertSelective(test.ReconciliationInfo record);

    test.ReconciliationInfo selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(test.ReconciliationInfo record);

    int updateByPrimaryKey(test.ReconciliationInfo record);
}