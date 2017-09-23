package cn.heweiming.ssm.web.util;

import java.util.Collections;
import java.util.List;

import cn.heweiming.ssm.bean.Page;
import cn.heweiming.ssm.web.datatables.DataTablesResponse;

/**
 * @author heweiming  2017年9月23日 下午5:20:01
 * @version 1.0.0
 * @description 
 */
public abstract class DataTablesUtils {

    public static void setDtResponseFromPage(Page<?> page, DataTablesResponse dtResponse) {
        List<?> data = page.getRecoreds();
        dtResponse.setData(data == null ? Collections.EMPTY_LIST : data);
        dtResponse.setRecordsFiltered(page.getTotal());
        dtResponse.setRecordsTotal(page.getTotal());
    }

}
