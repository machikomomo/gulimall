package cn.odyssey.gulimall.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallorder.entity.OrderOperateHistoryEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 14:21:00
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

