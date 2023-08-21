package com.shophuggo.huggo.api.services;

import com.shophuggo.huggo.api.mappers.ResourceMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

@Slf4j
public abstract class CrudService<TEntity, TRequest, TResponse> implements CrudServiceImpl<TRequest, TResponse> {
    protected abstract ResourceMapper<TEntity, TRequest, TResponse> getMapper();
    protected abstract <TRepository extends JpaRepository<TEntity, Long> & JpaSpecificationExecutor<TEntity>> TRepository getRepository();
    protected TEntity processEntityBeforeSave(TEntity requestData) {
        return requestData;
    }
    @Override
    public TResponse save(TRequest requestData)  {
        TEntity requestEntity = getMapper().requestToEntity(requestData);
        TEntity createdEntity = getRepository().save(
                processEntityBeforeSave(requestEntity)
        );

        return getMapper()
                .entityToResponse(createdEntity);
    }
}
