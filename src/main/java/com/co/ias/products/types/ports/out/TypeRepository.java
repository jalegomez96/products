package com.co.ias.products.types.ports.out;

import java.util.List;

import com.co.ias.products.shared.domain.PageQuery;
import com.co.ias.products.types.domain.Type;
import com.co.ias.products.types.domain.TypeId;

public interface TypeRepository {
    Integer store(Type type);

    Type get(TypeId typeId);

    void update(Type type);

    void delete(TypeId typeId);

    List<Type> getTypes(PageQuery pageQuery);
}
