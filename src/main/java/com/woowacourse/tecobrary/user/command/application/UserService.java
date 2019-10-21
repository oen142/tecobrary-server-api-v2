package com.woowacourse.tecobrary.user.command.application;

import com.woowacourse.tecobrary.user.command.domain.User;
import com.woowacourse.tecobrary.user.command.domain.UserAuthorization;
import com.woowacourse.tecobrary.user.command.domain.UserGithubInfo;
import com.woowacourse.tecobrary.user.command.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByGithubId(String githubId) {
        return userRepository.getUserByUserGithubInfo_GithubId(githubId)
                .orElseThrow(NotFoundGithubUserException::new);
    }

    public User findById(String userNo) {
        return userRepository.findById(Long.valueOf(userNo))
                .orElseThrow(NotFoundGithubUserException::new);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User save(UserGithubInfo userGithubInfo, UserAuthorization userAuthorization) {
        return userRepository.save(new User(userGithubInfo, userAuthorization));
    }
}
