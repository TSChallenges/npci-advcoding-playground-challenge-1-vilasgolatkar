class StockPortfolio {
    // TODO: Add necessary fields for stock details
    private String symbol;
    private int quantity;
    private double buyingPrice;
    private double currentPrice;
    private double highestPrice;

    // TODO: Initialize stock details
    public StockPortfolio(String symbol, int quantity, double buyingPrice) {
        // TODO
        this.symbol = symbol;
        this.quantity = quantity;
        this.buyingPrice = buyingPrice;
        this.currentPrice = buyingPrice;
        this.highetPrice = buyingPrice;
    }

    // TODO: Update current market price
    public void updatePrice(double newPrice) {
        // TODO
        if (newPrice > 0)
        {
            highestPrice = newPrice;
            currentPrice = newPrice;
        }
    }

    // TODO: Calculate total profit or loss
    public double calculateProfit() {
        // TODO
       double profit = (currentPrice - buyingPrice) * quantity;
        
        return profit;
    }

    // TODO: Calculate current total value of holdings
    public double getCurrentValue() {
        // TODO
        double totalHolding = currentPrice * quantity;
        return totalHolding;
    }
}
