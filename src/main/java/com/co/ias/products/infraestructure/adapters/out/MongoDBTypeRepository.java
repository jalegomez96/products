package com.co.ias.products.infraestructure.adapters.out;

import java.util.List;

import com.co.ias.products.shared.domain.PageQuery;
import com.co.ias.products.types.domain.Type;
import com.co.ias.products.types.domain.TypeId;
import com.co.ias.products.types.ports.out.TypeRepository;

import org.springframework.stereotype.Repository;

@Repository
public class MongoDBTypeRepository implements TypeRepository {

    @Override
    public Integer store(Type type) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Type get(TypeId typeId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(Type type) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(TypeId typeId) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Type> getTypes(PageQuery pageQuery) {
        // TODO Auto-generated method stub
        return null;
    }

}
