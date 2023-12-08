package HomeWork04;

import java.util.ArrayList;
import java.util.List;

public class BusRoute {
    private int id;
    private String remark;
    private int capacity;
    private List<BusStop> busStop = new ArrayList<BusStop>();

    public BusRoute(int id, String remark, int capacity, List<BusStop> busStop) {
        this.id = id;
        this.remark = remark;
        this.capacity = capacity;
        this.busStop = busStop;
    }

    public int getId() {
        return id;
    }

    public String getRemark() {
        return remark;
    }

    public List<BusStop> getBusStop() {
        return busStop;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
