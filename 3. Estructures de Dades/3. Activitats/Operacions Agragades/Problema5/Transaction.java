package AggregateOperations.Problema5;

class Transaction {
    String id;
    String clientId;
    String category;
    double totalAmount;
    String data;

    public Transaction(String id, String clientId, String category, double totalAmount, String data) {
        this.id = id;
        this.clientId = clientId;
        this.category = category;
        this.totalAmount = totalAmount;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", clientId='" + clientId + '\'' +
                ", categoria='" + category + '\'' +
                ", importTotal=" + totalAmount +
                ", data='" + data + '\'' +
                '}';
    }
}