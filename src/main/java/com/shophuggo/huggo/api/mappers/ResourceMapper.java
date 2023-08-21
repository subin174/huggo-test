package com.shophuggo.huggo.api.mappers;

public interface ResourceMapper<TEntity, TRequest, TResponse> {
    TResponse entityToResponse(TEntity entity);
    TEntity requestToEntity(TRequest request);
}
