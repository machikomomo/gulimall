package cn.odyssey.gulimall.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallorder.entity.OrderItemEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 14:21:00
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

