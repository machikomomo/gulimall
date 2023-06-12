package cn.odyssey.gulimall.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallcoupon.entity.SeckillPromotionEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-11 12:48:26
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

