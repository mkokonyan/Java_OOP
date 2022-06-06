package L09_DesignPatterns.a_lab.D05_Template;

public abstract class TemplatePurchase {

    public final void purchaseOrder() {
        getItemsFromCart();
        calculatePricesWithDiscounts();
        createReceipt();
        payOrder();
        notifyClient();
    }

    protected abstract void notifyClient();

    protected abstract void payOrder();

    protected abstract void createReceipt();

    protected abstract void calculatePricesWithDiscounts();

    protected abstract void getItemsFromCart();

}
