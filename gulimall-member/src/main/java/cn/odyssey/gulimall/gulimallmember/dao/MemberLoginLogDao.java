package cn.odyssey.gulimall.gulimallmember.dao;

import cn.odyssey.gulimall.gulimallmember.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 13:58:03
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
