package cn.odyssey.gulimall.gulimallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallmember.entity.IntegrationChangeHistoryEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 13:58:03
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

