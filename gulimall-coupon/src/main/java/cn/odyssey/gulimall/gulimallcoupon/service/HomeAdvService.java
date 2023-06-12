package cn.odyssey.gulimall.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallcoupon.entity.HomeAdvEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-11 12:48:26
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

