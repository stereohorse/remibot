package ru.testops.remibot;

import lombok.Builder;

/**
 * TODO
 *
 * - read config
 * - read previously scheduled reminders from storage
 *   - setup scheduler
 * - fetch new messages
 * - if got new requests
 *   - save to storage
 *   - setup scheduler
 */
@Builder
public class App {

    private Configuration config;



    public void run() {

    }

    public static void main(String[] args) {
    }
}
