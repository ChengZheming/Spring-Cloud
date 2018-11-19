package cn.haylion.ptx.bean.bus;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 公交到站信息
 */
@Data
@AllArgsConstructor
public class ArriveStop {

    //公交线路ID
    private String lineId;

    //站点ID
    private String stopId;

    //站点名称
    private String stopName;

    //到达时间，单位秒
    private int arriveTime;

    //到达距离，单位米
    private int arriveDistance;

}
