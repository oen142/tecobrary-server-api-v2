package com.woowacourse.tecobrary.user.utils;

import com.woowacourse.tecobrary.user.entity.User;
import com.woowacourse.tecobrary.github.dto.UserJwtInfoDto;

public class UserJwtDtoConverter {

    public static UserJwtInfoDto convert(final User user) {
        return UserJwtInfoDto.builder()
                .id(user.getId())
                .email(user.getUserEmail())
                .name(user.getUserName())
                .avatarUrl(user.getUserAvatarUrl())
                .authorization(user.getAuthorization())
                .build();
    }
}
