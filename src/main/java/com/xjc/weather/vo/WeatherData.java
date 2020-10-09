package com.xjc.weather.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Description: 城市天气信息
 *
 * @author: Administrator
 * Date: 2020-10-09
 */
@Data
public class WeatherData implements Serializable {

    private static final long serialVersionUID = -5854646376866048265L;

    /**
     * 昨天天气
     */
    private Yesterday yesterday;

    /**
     * 城市
     */
    private String city;

    /**
     * 五天内天气信息
     */
    private List<Forecast> forecast;

    /**
     * 感冒指数
     */
    private String ganmao;

    /**
     * 温度
     */
    private String wendu;
}
