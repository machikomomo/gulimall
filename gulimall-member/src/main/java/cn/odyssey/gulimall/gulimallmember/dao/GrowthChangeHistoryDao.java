package cn.odyssey.gulimall.gulimallmember.dao;

import cn.odyssey.gulimall.gulimallmember.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 13:58:03
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
