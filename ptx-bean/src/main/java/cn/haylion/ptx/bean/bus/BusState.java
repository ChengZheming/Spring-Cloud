package cn.haylion.ptx.bean.bus;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 公交车状况
 */
@Data
@AllArgsConstructor
public class BusState {

    //速度，每小时多少公里
    private String speed;

    //纬度位置
    private String lat;

    //经度位置
    private String lng;

}
