package cn.odyssey.gulimall.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallcoupon.entity.CouponSpuRelationEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-11 12:48:26
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

