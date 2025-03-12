package com.spanner.spannerpoc;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SpannerDataService {

    private UserRepository userRepository;

    public UserEntity save(User user) {
        UserEntity entity = UserEntity.builder()
                .id(NumericUUID.generateUUID())
                .name(user.getName())
                .rollnumber(user.getRollnumber())
                .mark(user.getMark())
                .facility(4008)
                .build();
        return userRepository.save(entity);
    }

    public UserEntity findById(final String id) {
        return userRepository.findById(id).orElse(UserEntity.builder().build());
    }


}
