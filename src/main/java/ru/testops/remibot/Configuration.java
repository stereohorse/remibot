package ru.testops.remibot;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
public class Configuration {

    @Getter
    private String storagePath;

    @Getter
    private String telegramApiToken;


    public static Configuration fromEnv() {
        return Configuration.builder()
            .storagePath(System.getenv("REMI_STORAGE_PATH"))
            .telegramApiToken(System.getenv("REMI_TG_API_TOKEN"))
            .build();
    }
}
