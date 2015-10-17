/**
 * 
 */
package com.wds.spring.batch.partition;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.batch.item.ItemProcessor;

/**
 * 
 * @author bruce.liu(mailto:jxta.liu@gmail.com)
 * 2014-1-11下午02:38:01
 */
public class CreditBillProcessor implements
		ItemProcessor<CreditBill, CreditBill> {

	public CreditBill process(CreditBill bill) throws Exception {
		System.out.println(bill.toString());
		CreditBill destCreditBill = new CreditBill();
		destCreditBill.setAccountID(bill.getAccountID());
		destCreditBill.setAddress(bill.getAddress());
		destCreditBill.setAmount(bill.getAmount());
		destCreditBill.setDate(bill.getDate());
		destCreditBill.setId(bill.getId() + 100);
		destCreditBill.setName(bill.getName());
		return destCreditBill;
	}
}
