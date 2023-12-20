package design.pattern.structural.adapter.phonepe;

import design.pattern.structural.adapter.phonepe.thirdparty.HDFCBankAPI;

public class Client {
    public static void main(String[] args) {
        String userInput = "ICICI";
        // factory
        // BankAdapteraFactory
//        BankAPIAdapter bankAPI = BankAdapteraFactory.getFactory("ICICI");
        BankApiAdapter bankAPI = new HDFCBankApiAdapter(new HDFCBankAPI());
        Phonepe accountObj = new Phonepe(bankAPI);
    }
}
