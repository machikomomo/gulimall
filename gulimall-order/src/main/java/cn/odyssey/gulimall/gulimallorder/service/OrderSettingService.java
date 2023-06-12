package cn.odyssey.gulimall.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallorder.entity.OrderSettingEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 14:21:00
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

