package com.woowacourse.tecobrary.web.tecorvis.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class SlackBotModeDto {

    private boolean mode;

    public SlackBotModeDto(final boolean mode) {
        this.mode = mode;
    }

    public void offSlackBotNotification() {
        if (this.mode) {
            this.mode = false;
        }
    }
}
