package com.tlong.core.utils;

import com.tlong.core.base.dto.PageAndSortRequestDto;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Objects;

/**
 * 功能描述: 基本分页Dto处理类
 *
 * @auther: wangzhuo
 * @date: 2019-03-20 10:35
 */
public class PageAndSortUtil {

    //分页排序处理
    public static PageRequest pageAndSort(PageAndSortRequestDto requestDto) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        PageRequest pageRequest = PageRequest.of(0, 10, sort);
        if (Objects.nonNull(requestDto)) {
            //处理sort
            if (requestDto.getOrderProperty() != null && requestDto.getDirection() != null) {
                Sort.Direction direction1 = requestDto.getDirection() == 1 ? Sort.Direction.ASC : Sort.Direction.DESC;
                sort = new Sort(direction1, requestDto.getOrderProperty());
            }
            if (requestDto.getOrderProperty() != null && requestDto.getDirection() == null) {
                sort = new Sort(Sort.Direction.DESC, requestDto.getOrderProperty());
            }
            if (requestDto.getDirection() != null && requestDto.getOrderProperty() == null) {
                Sort.Direction direction1 = requestDto.getDirection() == 1 ? Sort.Direction.ASC : Sort.Direction.DESC;
                sort = new Sort(direction1, "id");
            }

            //处理page size
            if (requestDto.getPage() != null && requestDto.getSize() != null) {
                pageRequest = PageRequest.of(requestDto.getPage(), requestDto.getSize(), sort);
            }
            if (requestDto.getPage() != null && requestDto.getSize() == null) {
                pageRequest = PageRequest.of(requestDto.getPage(), 10, sort);
            }
            if (requestDto.getSize() != null && requestDto.getPage() == null) {
                pageRequest = PageRequest.of(0, requestDto.getSize(), sort);
            }
            return pageRequest;
        }
        return pageRequest;
    }
}
