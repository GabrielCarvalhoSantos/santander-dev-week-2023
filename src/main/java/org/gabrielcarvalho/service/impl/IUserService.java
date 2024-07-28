package org.gabrielcarvalho.service.impl;

import org.gabrielcarvalho.model.User;

public interface IUserService {

    User findById(Long id) throws NoSuchFieldException;

    User create(User userToCreate);
}
