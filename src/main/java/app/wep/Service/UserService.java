package app.wep.Service;

import app.wep.Dtos.Responce.UserResponse;
import app.wep.Repositories.userRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {

    private final userRepository userRepository;



}
