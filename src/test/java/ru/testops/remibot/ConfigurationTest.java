package ru.testops.remibot;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConfigurationTest {

    @Test
    void shouldReadConfigFromEnv() {
        val config = Configuration.fromEnv();

        assertThat(config).isNotNull();

        assertThat(config.getStoragePath()).isNotBlank();
    }
}
