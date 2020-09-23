package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.qfedu.common.JsonResult;
import com.qfedu.entity.Car;
import com.qfedu.entity.City;
import com.qfedu.service.CityService;
import com.qfedu.utils.DistrictUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * projectName: car
 *
 * @author: xr
 * time: 2020/9/17 21:06
 * description:
 */
@Controller
@RequestMapping("/city")
public class CarselectController {
    @Autowired
    private CityService cityService;
    @RequestMapping("/select.do")
    @ResponseBody
    public JsonResult select(String pid, HttpSession session){
        System.out.println(pid + "==============" + pid);
        if(pid == null){
            pid = "0";
        }
        int i = Integer.parseInt(pid);
        System.out.println(pid);
        List<City> list = cityService.select(i);
        return new JsonResult(1,list);

    }
    @ResponseBody
    @RequestMapping("/showCar.do")
    public Map<String,Object> showCat(Integer page,Integer limit){
        System.out.println(page);
        System.out.println(limit);
        List<Car> cars = cityService.selectByCityId(DistrictUtils.getQuiz2(),page,limit);
        long total = ((Page) cars).getTotal ();
        Map<String, Object> map = new HashMap<> ();
        map.put ("code",0);
        map.put ("msg","");
        map.put ("count",total);
        map.put ("data",cars);
        System.out.println (map);
        return map;
    }

@ResponseBody
@RequestMapping("/button.do")
    public JsonResult button (Integer quiz1,Integer quiz2,Integer quiz3,Integer quiz4){
        if (quiz1 == null || quiz2 == null || quiz3 == null ||  quiz4 == null ){
            return new JsonResult(0,"请选择正确区域");
        }
        DistrictUtils.setQuiz1(quiz1);
        DistrictUtils.setQuiz2(quiz2);
        DistrictUtils.setQuiz3(quiz3);
        DistrictUtils.setQuiz4(quiz4);
        return  new JsonResult(1,"YES");
    }

    @RequestMapping("/selectName.do")
    @ResponseBody
    public JsonResult selectName(){
        City city = cityService.selectMsg(DistrictUtils.getQuiz2());
        City city1 = cityService.selectMsg(DistrictUtils.getQuiz4());
        String [] strings = {city.getName(),city1.getName()};
        return new JsonResult(1,strings);

    }




}
