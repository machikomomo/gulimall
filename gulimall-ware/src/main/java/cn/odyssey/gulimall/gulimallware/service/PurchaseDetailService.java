package cn.odyssey.gulimall.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallware.entity.PurchaseDetailEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 14:34:26
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

