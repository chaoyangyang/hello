package test;

import java.math.BigDecimal;
import test.ReconciliationInfo;

public interface ReconciliationInfoMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(ReconciliationInfo record);

    int insertSelective(ReconciliationInfo record);

    ReconciliationInfo selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(ReconciliationInfo record);

    int updateByPrimaryKey(ReconciliationInfo record);
}