package HomeWork04;

import java.math.BigDecimal;
import java.util.Date;

public class Ticket {
    private BigDecimal price;
    private Date date;
    private int startZone;
    private int finishZone;
    private boolean isLuggage;
    private int place;
    private int routeNumber;

    public Ticket(BigDecimal price, Date date, int startZone, int finishZone, boolean isLuggage, int place, int routeNumber) {
        this.price = price;
        this.date = date;
        this.startZone = startZone;
        this.finishZone = finishZone;
        this.isLuggage = isLuggage;
        this.place = place;
        this.routeNumber = routeNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public int getStartZone() {
        return startZone;
    }

    public int getFinishZone() {
        return finishZone;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStartZone(int startZone) {
        this.startZone = startZone;
    }

    public void setFinishZone(int finishZone) {
        this.finishZone = finishZone;
    }
}
