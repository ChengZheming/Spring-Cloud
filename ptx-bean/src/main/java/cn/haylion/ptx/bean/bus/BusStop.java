package cn.haylion.ptx.bean.bus;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 公交站点信息
 */
@Data
@AllArgsConstructor
public class BusStop {

    //公交线路ID
    private String lineId;

    //站点ID
    private String stopId;

    //站点名称
    private String stopName;

    //纬度位置
    private String lat;

    //经度位置
    private String lng;

    //前一个站点ID
    private String prevStopId;

    //下一个站点ID
    private String nextStopId;

    //本站到下一站的距离，单位米
    private int nextStopDistance;

    //起点到这的距离，单位米
    private int startToHereDistance;

}
