package com.example.demo.configuration;

import com.example.demo.configuration.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserDetailsServicelmpl implements UserDetailsService {

    @Autowired
    UserRoleRepository userRoleRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        UserRoles byName  = userRoleRepository.findByName(name);
        if (name!= null)
            return User.builder()
            .username(byName.getName())
            .password(byName.getPassword())
            .roles(byName.getUserRole())
            .build();

        throw new UsernameNotFoundException("No such user");
    }

}
