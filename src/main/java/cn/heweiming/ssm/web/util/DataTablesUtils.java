package cn.heweiming.ssm.web.util;

import java.util.Collections;
import java.util.List;

import cn.heweiming.ssm.bean.Page;
import cn.heweiming.ssm.web.datatables.DataTablesResponse;

public abstract class DataTablesUtils {

	public static void setDtResponseFromPage(Page<?> page, DataTablesResponse dtResponse) {
		List<?> data = page.getRecoreds();
		dtResponse.setData(data == null ? Collections.EMPTY_LIST : data);
		dtResponse.setRecordsFiltered(page.getTotal());
		dtResponse.setRecordsTotal(page.getTotal());
	}

}
