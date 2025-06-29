package models;

import java.time.LocalDateTime;

public class Log {
    private String username;
    private LocalDateTime accessInstant;

    public Log() {}

    public Log(String username, LocalDateTime accessInstant) {
        this.username = username;
        this.accessInstant = accessInstant;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getAccessInstant() {
        return accessInstant;
    }

    public void setAccessInstant(LocalDateTime accessInstant) {
        this.accessInstant = accessInstant;
    }
}
