package design.pattern.structural.adapter.phonepe;

public class Phonepe {
    private BankApiAdapter bankAPI;

    public Phonepe(BankApiAdapter bankAPI) {
        this.bankAPI = bankAPI;
    }
}
