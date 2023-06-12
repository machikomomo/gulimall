package cn.odyssey.gulimall.gulimallcoupon.dao;

import cn.odyssey.gulimall.gulimallcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-11 12:48:26
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
