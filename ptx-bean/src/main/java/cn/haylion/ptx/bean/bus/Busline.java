package cn.haylion.ptx.bean.bus;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 公交线路信息
 */
@Data
@AllArgsConstructor
public class Busline {

    //公交线路ID
    private String lineId;

    //站点ID
    private String lineName;

    //起点站名称
    private String startStopName;

    //终点站名称
    private String endStopName;

    //起点到终点距离，单位米
    private int distance;

}
