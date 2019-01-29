package com.fengdu.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fengdu.entity.CartEntity;
import com.fengdu.service.CartService;
import com.fengdu.utils.PageUtils;
import com.fengdu.utils.Query;
import com.fengdu.utils.R;


/**
 * 购物车
 * 
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-13 10:41:06
 */
@RestController
@RequestMapping("cart")
public class CartController {
	@Autowired
	private CartService cartService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("cart:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<CartEntity> cartList = cartService.queryList(query);
		int total = cartService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(cartList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("cart:info")
	public R info(@PathVariable("id") Integer id){
		CartEntity cart = cartService.queryObject(id);
		
		return R.ok().put("cart", cart);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("cart:save")
	public R save(@RequestBody CartEntity cart){
		cartService.save(cart);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("cart:update")
	public R update(@RequestBody CartEntity cart){
		cartService.update(cart);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("cart:delete")
	public R delete(@RequestBody Integer[] ids){
		cartService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
