package cn.odyssey.gulimall.gulimallmember.dao;

import cn.odyssey.gulimall.gulimallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 13:58:03
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
