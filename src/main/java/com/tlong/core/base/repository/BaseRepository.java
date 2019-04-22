package com.tlong.core.base.repository;

import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

//上面的注解@NoRepositoryBean是为了避免SpringDataJPA自动实例化才添加的
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID>, QuerydslPredicateExecutor<T> {

    Optional<T> findById(ID va1);

    List<T> findAll(Predicate var1);

    List<T> findAll(Predicate var1, Sort var2);

    List<T> findAll(Predicate var1, OrderSpecifier... var2);

    List<T> findAll(OrderSpecifier... var1);

}

