package cn.odyssey.gulimall.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallorder.entity.OrderReturnApplyEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 14:21:00
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

