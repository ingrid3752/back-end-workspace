package com.kh.movie.service;

import com.kh.movie.domain.Movie;
import com.kh.movie.repo.MovieDAO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mapping.AccessOptions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
// import org.springframework.transaction.annotation.Propagation;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieDAO dao;
    // 저장하여 추가 / 수정
    public void change(Movie vo) {
        dao.save(vo);
    }

    // 전체 조회
    public List<Movie> viewAll() {
        return dao.findAll();
    }

    // 특정 조회 ( get 누락시 optional객체로 반환되므로 .get타입으로 조회)
    public Movie view(int id) {
        return dao.findById(id).get();
    }

    // 삭제 delete = 객체삭제 deleteById = Id로 삭제
    public void delete(int id) {
        dao.deleteById(id);
    }
}