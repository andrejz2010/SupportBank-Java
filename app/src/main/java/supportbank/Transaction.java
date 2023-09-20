package supportbank;

public class Transaction {
    private String date;
    private String from;
    private String to;
    private String narrative;
    private double amount;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFrom() {
        return from;
    }


    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public String getNarrative() {
        return narrative;
    }

    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Transaction(String date, String from, String to, String narrative, double amount) {
        this.date = date;
        this.from = from;
        this.to = to;
        this.narrative = narrative;
        this.amount = amount;

    }


    public String getTransactionMessage() {
        String transactionMessage = "[Date: " + getDate() + ", " + "from: " + getFrom() + ", " + "to: " + getTo() + ", " + "narrative: " + getNarrative() + ", " + "amount: " + getAmount() + "]";
        return transactionMessage;
    }


}
