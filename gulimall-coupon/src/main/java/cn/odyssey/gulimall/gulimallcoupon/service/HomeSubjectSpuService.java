package cn.odyssey.gulimall.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallcoupon.entity.HomeSubjectSpuEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 专题商品
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-11 12:48:26
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

