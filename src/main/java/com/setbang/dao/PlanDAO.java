package com.setbang.dao;

import java.util.List;

import com.setbang.domain.PlanVO;

public interface PlanDAO {
	
    // 서비스 플랜 결제
    void planPayment(PlanVO vo);
    
    // 서비스 플랜 업그레이드
    void planUpgrade(PlanVO vo);
    
    // 결제된 서비스 플랜 내역 조회
    List<PlanVO> getPlanPaymentList(int memCode);
}
