package cn.odyssey.gulimall.gulimallorder.dao;

import cn.odyssey.gulimall.gulimallorder.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 14:21:00
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
