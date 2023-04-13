package com.hdsoft.fsm.utils;

import org.springframework.http.HttpStatus;

public class Message {

    private String message;
    private String date;
    private String time;
    private HttpStatus status;

    public Message(String message, HttpStatus status) {
        this.message = message;
        this.date = DateUtils.now(DateUtils.EEEE_DD_MMMM_YYYY);
        this.time = DateUtils.timeLong();
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", status=" + status +
                '}';
    }
}
