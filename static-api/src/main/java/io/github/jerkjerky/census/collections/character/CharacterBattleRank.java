package io.github.jerkjerky.census.collections.character;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class CharacterBattleRank {
    private final Long percentToNext;
    private final Long value;

    @JsonCreator
    protected CharacterBattleRank(@JsonProperty("percent_to_next") String percentToNext,
                                  @JsonProperty("value") String value) {
        this.percentToNext = Long.parseLong(percentToNext);
        this.value = Long.parseLong(value);
    }
}
