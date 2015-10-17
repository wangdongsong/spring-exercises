package com.wds.spring.batch.partition;

import com.wds.spring.batch.partition.CreditBill;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

/**
 * Created by wds on 2015/10/1.
 */
public class CreditFieldSetMapper implements FieldSetMapper<CreditBill> {
    @Override
    public CreditBill mapFieldSet(FieldSet fieldSet) throws BindException {
        CreditBill result = new CreditBill();
        result.setId(fieldSet.readString("id"));
        result.setAccountID(fieldSet.readString("accountID"));
        result.setName(fieldSet.readString("name"));
        result.setAmount(fieldSet.readDouble("amount"));
        result.setDate(fieldSet.readString("date"));
        result.setAddress(fieldSet.readString("address"));
        return result;
    }
}
