package cn.odyssey.gulimall.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallware.entity.WareOrderTaskEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 14:34:27
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

