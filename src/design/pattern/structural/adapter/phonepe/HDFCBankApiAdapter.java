package design.pattern.structural.adapter.phonepe;

import design.pattern.structural.adapter.phonepe.thirdparty.HDFCBankAPI;

public class HDFCBankApiAdapter implements BankApiAdapter{
    HDFCBankAPI hdfcBankAPI;
    HDFCBankApiAdapter(HDFCBankAPI api){
        this.hdfcBankAPI=api;
    }
    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
