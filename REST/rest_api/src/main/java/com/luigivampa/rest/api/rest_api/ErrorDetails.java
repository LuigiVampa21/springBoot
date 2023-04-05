package com.luigivampa.rest.api.rest_api;

import java.time.LocalDateTime;

public class ErrorDetails {
    private LocalDateTime timestamp;
    private String message;
    private String details;

    public ErrorDetails(LocalDateTime localDateTime, String message, String details) {
        this.timestamp = localDateTime;
        this.message = message;
        this.details = details;
    }

    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    public String getMessage() {
        return this.message;
    }

    public String getDetails() {
        return this.details;
    }

    // public ErrorDetails timestamp(LocalDate timestamp) {
    // setTimestamp(timestamp);
    // return this;
    // }

    // public ErrorDetails message(String message) {
    // setMessage(message);
    // return this;
    // }

    // public ErrorDetails details(String details) {
    // setDetails(details);
    // return this;
    // }

    // @Override
    // public boolean equals(Object o) {
    // if (o == this)
    // return true;
    // if (!(o instanceof ErrorDetails)) {
    // return false;
    // }
    // ErrorDetails errorDetails = (ErrorDetails) o;
    // return Objects.equals(timestamp, errorDetails.timestamp) &&
    // Objects.equals(message, errorDetails.message)
    // && Objects.equals(details, errorDetails.details);
    // }

    // @Override
    // public int hashCode() {
    // return Objects.hash(timestamp, message, details);
    // }

    @Override
    public String toString() {
        return "{" +
                " timestamp='" + getTimestamp() + "'" +
                ", message='" + getMessage() + "'" +
                ", details='" + getDetails() + "'" +
                "}";
    }
}