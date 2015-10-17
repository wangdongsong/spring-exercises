package com.wds.spring.batch.partition;

import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by wds on 2015/10/2.
 */
public class CreditBillRowMapper implements RowMapper<CreditBill> {
    @Override
    public CreditBill mapRow(ResultSet rs, int rowNum) throws SQLException {
        CreditBill bill = new CreditBill();
        bill.setId(rs.getString("ID"));
        bill.setAccountID(rs.getString("ACCOUNTID"));
        bill.setAddress(rs.getString("ADDRESS"));
        bill.setAmount(rs.getDouble("AMOUNT"));
        bill.setDate(rs.getString("DATE"));
        bill.setName(rs.getString("NAME"));
        return bill;
    }
}
