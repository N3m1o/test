package com.laptrinhjavaweb.serviceIpm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.entity.CateEntity;
import com.laptrinhjavaweb.entity.NewEntity;
import com.laptrinhjavaweb.repository.CategoryRepository;
import com.laptrinhjavaweb.repository.NewRepository;
import com.laptrinhjavaweb.service.iNewService;

@Service
public class NewService implements iNewService{
	@Autowired
	private NewRepository newRepository;
	
	
	@Autowired
	private CategoryRepository categoryRepository;

	public NewEntity save(NewEntity newEntity) {
		CateEntity cateEntity = categoryRepository.findOneByCid(newEntity.getNew_cate());
		return null;
	}
	
	
}
