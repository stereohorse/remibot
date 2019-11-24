package ru.testops.remibot;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


@SuppressWarnings("ResultOfMethodCallIgnored")
class AppTest {

    @Test
    void shouldReadConfigOnStart() {
        // given
        val config = mock(Configuration.class);
        val app = App.builder()
            .config(config)
            .build();

        // when
        app.run();

        // then
        verify(config).getStoragePath();
    }
}
