package com.xjc.weather.controller;

import com.xjc.weather.service.WeatherDataService;
import com.xjc.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 天气接口请求
 *
 * @author: Administrator
 * Date: 2020-10-09
 */
@RestController
@RequestMapping(value = "/weather")
public class WeatherController {

    @Autowired
    private WeatherDataService weatherDataService;

    /**
     * 通过城市名获取天气信息
     *
     * @param cityName 城市名
     * @return 天气信息
     */
    @GetMapping(value = "/cityName/{cityName}")
    public WeatherResponse getWeatherByCityName(@PathVariable("cityName") String cityName) {
        return weatherDataService.getDataByCityName(cityName);
    }

    /**
     * 通过城市ID获取天气信息
     *
     * @param cityId 城市ID
     * @return 天气信息
     */
    @GetMapping(value = "/cityId/{cityId}")
    public WeatherResponse getWeatherByCityId(@PathVariable("cityId") String cityId) {
        return weatherDataService.getDataByCityId(cityId);
    }
}
