package com.jafa.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.jafa.domain.BoardVO;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class BoardDaoImpl implements BoardDao {

	SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<BoardVO> findByWriter(String writer) {
		List<BoardVO> list = sqlSessionTemplate.selectList("com.jafa.dao.BoardDao.findByWriter", writer);
		return list;
	}

}
