package org.gabrielcarvalho.service.impl;

import org.gabrielcarvalho.model.User;
import org.gabrielcarvalho.repository.IUserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;

    public UserServiceImpl(IUserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User findById(Long id) throws NoSuchFieldException {
        return userRepository.findById(id).orElseThrow(NoSuchFieldException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
