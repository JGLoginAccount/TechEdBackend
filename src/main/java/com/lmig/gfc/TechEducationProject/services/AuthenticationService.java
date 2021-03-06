package com.lmig.gfc.TechEducationProject.services;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lmig.gfc.TechEducationProject.models.User;
import com.lmig.gfc.TechEducationProject.repositories.UserRepository;

@Service
public class AuthenticationService implements UserDetailsService {

    private UserRepository usersRepository;

    public AuthenticationService(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = usersRepository.findByusername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return user;
    }

}