package cn.odyssey.gulimall.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallcoupon.entity.MemberPriceEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-11 12:48:26
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

