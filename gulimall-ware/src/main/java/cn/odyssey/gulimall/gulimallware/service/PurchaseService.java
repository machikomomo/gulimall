package cn.odyssey.gulimall.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallware.entity.PurchaseEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 采购信息
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 14:34:26
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

