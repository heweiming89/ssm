package cn.heweiming.ssm.web.datatables;

/**
 * @author heweiming  2017年9月23日 下午5:19:13
 * @version 1.0.0
 * @description 
 */
public class DataTablesRequest {

    private Integer draw;
    private Integer start;
    private Integer length;

    //    private Object[] search;
//    private Object[] order;
    public Integer getDraw() {
        return draw;
    }

    public Integer getLength() {
        return length;
    }

    //    public Object[] getOrder() {
//        return order;
//    }
//    public Object[] getSearch() {
//        return search;
//    }
    public Integer getStart() {
        return start;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    //    public void setOrder(Object[] order) {
//        this.order = order;
//    }
//    public void setSearch(Object[] search) {
//        this.search = search;
//    }
    public void setStart(Integer start) {
        this.start = start;
    }

}
