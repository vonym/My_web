package ��234ҳ������;

public class CTest {
	public static void main(String[] args) {

		CCustomer customer = new CCustomer();
		CShopping shopping = new CShopping();
		CCashier cashier = new CCashier();

		shopping.setDnum(2);
		shopping.setDprice(3);
		double dsum = shopping.Sumpay();

		customer.strName = "Tom";
		customer.nAge = 20;
		customer.charSex = '��';
		customer.Payfor(dsum);

		cashier.strName = "Tom";
		cashier.nAge = 23;
		cashier.charSex = 'Ů';
		cashier.CclectMoney(dsum);
	}
}
