package cn.odyssey.gulimall.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallware.entity.WareSkuEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 商品库存
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 14:34:27
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

