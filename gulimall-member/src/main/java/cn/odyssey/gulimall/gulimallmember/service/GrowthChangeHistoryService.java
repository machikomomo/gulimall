package cn.odyssey.gulimall.gulimallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallmember.entity.GrowthChangeHistoryEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 13:58:03
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

