package cn.odyssey.gulimall.gulimallcoupon.dao;

import cn.odyssey.gulimall.gulimallcoupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-11 12:48:26
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
