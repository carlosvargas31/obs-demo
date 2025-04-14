package com.obs.obsdemo.application;

import com.obs.obsdemo.domain.NoContentException;
import com.obs.obsdemo.domain.NotFoundException;
import com.obs.obsdemo.domain.User;
import com.obs.obsdemo.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new NotFoundException("User not found"));
    }

    public ResponseEntity<User> updateUser(String id, UserRequest user) {
        return userRepository.findById(id)
                .map(u -> {
                    u.setFirstName(user.firstName());
                    u.setLastName(user.lastName());
                    u.setMarriedStatus(user.marriedStatus());

                    return ResponseEntity.ok(userRepository.save(u));
                })
                .orElseGet(() -> createUser(user));
    }

    public void deleteUserById(String id) {
        User user = userRepository.findById(id).orElseThrow(() -> new NoContentException("User not found"));
        userRepository.delete(user);
    }

    private ResponseEntity<User> createUser(UserRequest user) {
        User newUser = UserMapper.mapUserRequestToUser(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(userRepository.insert(newUser));
    }

}
