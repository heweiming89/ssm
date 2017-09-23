package cn.heweiming.ssm.web.datatables;

/**
 * @author heweiming  2017年9月23日 下午5:19:17
 * @version 1.0.0
 * @description 
 */
public class DataTablesResponse {

    private int draw;
    private long recordsTotal;
    private long recordsFiltered;
    private Object data;
    private String error;

    public DataTablesResponse() {
        super();
    }

    public DataTablesResponse(int draw) {
        super();
        this.draw = draw;
    }

    public Object getData() {
        return data;
    }

    public int getDraw() {
        return draw;
    }

    public String getError() {
        return error;
    }

    public long getRecordsFiltered() {
        return recordsFiltered;
    }

    public long getRecordsTotal() {
        return recordsTotal;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setRecordsFiltered(long recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public void setRecordsTotal(long recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

}
