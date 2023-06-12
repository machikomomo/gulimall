package cn.odyssey.gulimall.gulimallorder.dao;

import cn.odyssey.gulimall.gulimallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 14:21:00
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
