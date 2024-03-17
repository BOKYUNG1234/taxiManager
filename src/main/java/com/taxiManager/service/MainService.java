package com.taxiManager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.taxiManager.vo.CarInfoVO;
import com.taxiManager.vo.DriveInfoVO;
import com.taxiManager.vo.UserVO;

@Service
public interface MainService {
	
	List<CarInfoVO> mainList();
   String checkDuplicateId(String id);
	}

