package service.impl;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.IUserRepo;
import service.IUserService;

import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepo userRepo;


    @Override
    public Iterable<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> findOne(Long id) {
        return userRepo.findById(id);
    }

    @Override
    public void save(User user) {
        userRepo.save(user);

    }

    @Override
    public void delete(Long id) {
        userRepo.deleteById(id);

    }
}
