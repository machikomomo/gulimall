package cn.odyssey.gulimall.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallorder.entity.OrderReturnReasonEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 退货原因
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 14:21:00
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

