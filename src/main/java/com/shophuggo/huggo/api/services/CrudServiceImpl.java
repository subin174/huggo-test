package com.shophuggo.huggo.api.services;

import java.util.List;

public interface CrudServiceImpl<TRequest, TResponse> {
    List<TResponse> getAll();
    List<TResponse> getById();
    TResponse save(TRequest data);
    TResponse save(long id, TRequest data);

    TResponse delete(long id);



}