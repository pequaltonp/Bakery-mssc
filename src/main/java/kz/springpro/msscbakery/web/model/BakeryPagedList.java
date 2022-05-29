package kz.springpro.msscbakery.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BakeryPagedList extends PageImpl<BakeryDto> {
    public BakeryPagedList(List<BakeryDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BakeryPagedList(List<BakeryDto> content) {
        super(content);
    }
}
